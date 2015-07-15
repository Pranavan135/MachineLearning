package com.inno.ml.parseData;

import com.inno.ml.parseData.info.Info;
import com.inno.ml.parseData.innings.Innings;
import com.inno.ml.parseData.meta.Meta;

import java.util.ArrayList;

/**
 * Created by banu on 18/06/2015.
 */

//Holds all data about every match
public class MatchInfo {
    private Meta meta;
    private Info info;
    private Object innings; //This is used only for parsing purpose
    private ArrayList<Innings> inningsArrayList;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Object getInnings() {
        return innings;
    }

    public void setInnings(Object innings) {
        this.innings = innings;
    }

    public ArrayList<Innings> getInningsArrayList() {
        return inningsArrayList;
    }

    public void setInningsArrayList(ArrayList<Innings> inningsArrayList) {
        this.inningsArrayList = inningsArrayList;
    }
}
