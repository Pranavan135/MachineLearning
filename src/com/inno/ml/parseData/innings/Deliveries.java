package com.inno.ml.parseData.innings;

/**
 * Created by banu on 18/06/2015.
 */
public class Deliveries {
    private String bastman;
    private String non_striker;
    private String bowler;
    private Runs runsList;
    private SuperSub superSubList;
    private Wicket wicketList;
    private  Extras extrasList;

    public String getBastman() {
        return bastman;
    }

    public void setBastman(String bastman) {
        this.bastman = bastman;
    }

    public String getNon_striker() {
        return non_striker;
    }

    public void setNon_striker(String non_striker) {
        this.non_striker = non_striker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }


    public Runs getRunsList() {
        return runsList;
    }

    public void setRunsList(Runs runsList) {
        this.runsList = runsList;
    }

    public SuperSub getSuperSubList() {
        return superSubList;
    }

    public void setSuperSubList(SuperSub superSubList) {
        this.superSubList = superSubList;
    }

    public Wicket getWicketList() {
        return wicketList;
    }

    public void setWicketList(Wicket wicketList) {
        this.wicketList = wicketList;
    }

    public Extras getExtrasList() {
        return extrasList;
    }

    public void setExtrasList(Extras extrasList) {
        this.extrasList = extrasList;
    }
}
