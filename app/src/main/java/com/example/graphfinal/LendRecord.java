package com.example.graphfinal;

public class LendRecord {
    String TrID,TrAmount,TrName,TrMode;
    public LendRecord(){

    }

    public LendRecord(String trID, String trAmount, String trName, String trMode) {
        TrID = trID;
        TrAmount = trAmount;
        TrName = trName;
        TrMode = trMode;
    }

    public String getTrID() {
        return TrID;
    }

    public String getTrAmount() {
        return TrAmount;
    }

    public String getTrName() {
        return TrName;
    }

    public String getTrMode() {
        return TrMode;
    }
}
