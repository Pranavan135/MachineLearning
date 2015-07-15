package com.inno.ml.parseData.info;

/**
 * Created by banu on 18/06/2015.
 */
public class Info {
    private BowlOut bowl_out;
    private String city;
    private String[] dates;
    private String match_type;
    private String neutral_venue;
    private Outcome outcome;
    private String overs;
    private String[] player_of_match;
    private String[] teams;
    private Toss toss;
    private String[] umpires;
    private String venue;

    public BowlOut getBowl_out() {
        return bowl_out;
    }

    public void setBowl_out(BowlOut bowl_out) {
        this.bowl_out = bowl_out;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getDates() {
        return dates;
    }

    public void setDates(String[] dates) {
        this.dates = dates;
    }

    public String getMatch_type() {
        return match_type;
    }

    public void setMatch_type(String match_type) {
        this.match_type = match_type;
    }

    public String getNeutral_venue() {
        return neutral_venue;
    }

    public void setNeutral_venue(String neutral_venue) {
        this.neutral_venue = neutral_venue;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
    }

    public String[] getPlayer_of_match() {
        return player_of_match;
    }

    public void setPlayer_of_match(String[] player_of_match) {
        this.player_of_match = player_of_match;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public Toss getToss() {
        return toss;
    }

    public void setToss(Toss toss) {
        this.toss = toss;
    }

    public String[] getUmpires() {
        return umpires;
    }

    public void setUmpires(String[] umpires) {
        this.umpires = umpires;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
