package com.inno.ml.parseData.innings;

/**
 * Created by banu on 18/06/2015.
 */
public class Wicket {
    private String kind;
    private String player_out;
    private String[] fielders;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPlayer_out() {
        return player_out;
    }

    public void setPlayer_out(String player_out) {
        this.player_out = player_out;
    }

    public String[] getFielders() {
        return fielders;
    }

    public void setFielders(String[] fielders) {
        this.fielders = fielders;
    }
}
