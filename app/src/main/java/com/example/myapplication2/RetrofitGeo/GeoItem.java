package com.example.myapplication2.RetrofitGeo;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GeoItem {
    @SerializedName("List")
    private List<GeoContent> list;
    @SerializedName("Message")
    private String Message;
    @SerializedName("Status")
    private int Status;

    public List<GeoContent> getList() {
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
