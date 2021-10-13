package com.example.myapplication2.BusinessDevision;

import com.example.myapplication2.RepeatedRetroItemsSocialStatEducation.RetroItemContent;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BusinessDevision {
    @SerializedName("List")
    private List<BusinessDevisionContent> list;
    @SerializedName("Message")
    private String Message;
    @SerializedName("Status")
    private int Status;

    public List<BusinessDevisionContent> getList() {
        return this.list;
    }
    public String getMessage(){
        return this.getMessage();
    }
    public int getStatus(){
        return this.Status;
    }

    @Override
    public String toString(){
        String val="Status: "+this.Status+"\n"+ "Message: "+this.Message+"\n"+"List Content:{ "+"\n";
        for(int i=0;i<this.list.size();i++){
            val=val+list.get(i);
        }
        val=val+"\t"+"}";
        return val;
    }
}