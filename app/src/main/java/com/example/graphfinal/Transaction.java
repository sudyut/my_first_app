package com.example.graphfinal;

public class Transaction {
    String TrID,TrAmount,TrName,TrMode;
    public  Transaction(){

    }

    public Transaction(String trID, String trAmount, String trName, String trMode) {
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
