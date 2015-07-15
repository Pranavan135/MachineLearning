package com.inno.ml.datareader;

/**
 * Created by banu on 18/06/2015.
 */
public enum MatchTypes {
    TEST_MATCH("TestMatches"),
    IPL_MATCH(""),
    ODI_MATCH(""),
    T20_MATCH("");

    private final String path;

    MatchTypes(String path){
        this.path = path;
    }

    public String toString(){
        return path;
    }


}
