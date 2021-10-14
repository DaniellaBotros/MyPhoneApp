package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfficerLoginItem{
    @SerializedName("Message")
    private String Message;
    @SerializedName("Obj")
    private OfficerLoginContent Obj;
    @SerializedName("Status")
    private int Status;

    public OfficerLoginContent getList() {
        return this.Obj;
    }
    public String getMessage(){
        return this.getMessage();
    }
    public int getStatus(){
        return this.Status;
    }

    @Override
    public String toString(){
        String val="Status: "+this.Status+"\n"+ "Message: "+this.Message+"\n"+"Obj: "+this.Obj+"\n";
        return val;
    }
}
