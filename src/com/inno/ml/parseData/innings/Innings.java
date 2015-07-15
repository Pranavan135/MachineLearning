package com.inno.ml.parseData.innings;

import java.util.ArrayList;

/**
 * Created by banu on 18/06/2015.
 */
public class Innings {
    private String team;
    private String[] absent_hurt;
    private String declared;
    private ArrayList deliveries;
    private ArrayList<Deliveries> deliveriesArrayList;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String[] getAbsent_hurt() {
        return absent_hurt;
    }

    public void setAbsent_hurt(String[] absent_hurt) {
        this.absent_hurt = absent_hurt;
    }

    public String getDeclared() {
        return declared;
    }

    public void setDeclared(String declared) {
        this.declared = declared;
    }

    public ArrayList getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(ArrayList deliveries) {
        this.deliveries = deliveries;
    }

    public ArrayList<Deliveries> getDeliveriesArrayList() {
        return deliveriesArrayList;
    }

    public void setDeliveriesArrayList(ArrayList<Deliveries> deliveriesArrayList) {
        this.deliveriesArrayList = deliveriesArrayList;
    }
}
