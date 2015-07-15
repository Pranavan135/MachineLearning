package com.inno.ml.datareader;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.inno.ml.parseData.MatchInfo;
import com.inno.ml.parseData.innings.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by banu on 18/06/2015.
 */
public class FetchData {

    public static MatchInfo getData(String fileName) {
        YamlReader reader = null;
        try {
            reader = new YamlReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        MatchInfo matchInfo = null;
        try {
            matchInfo = reader.read(MatchInfo.class);
        } catch (YamlException e) {
            e.printStackTrace();
        }
        ArrayList<Innings> inningsArrayList = new ArrayList<Innings>();
        try {
            int i = 0;
            for (Object h : ((ArrayList) matchInfo.getInnings())) {
                inningsArrayList.add(new Innings());
                HashMap t = new HashMap();

                if ((HashMap) ((HashMap) (h)).get("1st innings") != null) {
                    t = (HashMap) ((HashMap) (h)).get("1st innings");
                } else if ((HashMap) ((HashMap) (h)).get("2nd innings") != null) {
                    t = (HashMap) ((HashMap) (h)).get("2nd innings");
                } else if ((HashMap) ((HashMap) (h)).get("3rd innings") != null) {
                    t = (HashMap) ((HashMap) (h)).get("3rd innings");
                } else if ((HashMap) ((HashMap) (h)).get("4th innings") != null) {
                    t = (HashMap) ((HashMap) (h)).get("4th innings");
                }
                BeanUtils.populate(inningsArrayList.get(inningsArrayList.size() - 1), t);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        matchInfo.setInningsArrayList(inningsArrayList);
        for (Innings o : inningsArrayList) {
            ArrayList<Deliveries> deliveriesArrayList = new ArrayList<Deliveries>();
            for (Object o1 : o.getDeliveries()) {
                deliveriesArrayList.add(new Deliveries());
                try {
                    BeanUtils.populate(deliveriesArrayList.get(deliveriesArrayList.size() - 1), (Map) ((HashMap) o1).get(((HashMap) o1).keySet().toArray()[0]));
                    deliveriesArrayList.get(deliveriesArrayList.size() - 1).setRunsList(new Runs());
                    BeanUtils.populate(deliveriesArrayList.get(deliveriesArrayList.size() - 1).getRunsList(), (HashMap) ((Map) ((HashMap) o1).get(((HashMap) o1).keySet().toArray()[0])).get("runs"));
                    deliveriesArrayList.get(deliveriesArrayList.size() - 1).setSuperSubList(new SuperSub());
                    BeanUtils.populate(deliveriesArrayList.get(deliveriesArrayList.size() - 1).getSuperSubList(), (HashMap) ((Map) ((HashMap) o1).get(((HashMap) o1).keySet().toArray()[0])).get("supersub"));
                    deliveriesArrayList.get(deliveriesArrayList.size() - 1).setWicketList(new Wicket());
                    BeanUtils.populate(deliveriesArrayList.get(deliveriesArrayList.size() - 1).getWicketList(), (HashMap) ((Map) ((HashMap) o1).get(((HashMap) o1).keySet().toArray()[0])).get("wicket"));
                    deliveriesArrayList.get(deliveriesArrayList.size() - 1).setExtrasList(new Extras());
                    BeanUtils.populate(deliveriesArrayList.get(deliveriesArrayList.size() - 1).getExtrasList(), (HashMap) ((Map) ((HashMap) o1).get(((HashMap) o1).keySet().toArray()[0])).get("extras"));


                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }catch (Exception e){

                }
            }
            o.setDeliveriesArrayList(deliveriesArrayList);
        }
        return matchInfo;


    }

    public static void getAllMatchDetails(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                getAllMatchDetails(fileEntry);
            } else {

                if (FilenameUtils.getExtension(fileEntry.getPath()).equals("yaml")) {
                    System.out.println("Parsing: " + fileEntry.getName() + " - " + fileEntry.getPath());
                    getData(fileEntry.getPath());
               }
            }
        }
    }


}
