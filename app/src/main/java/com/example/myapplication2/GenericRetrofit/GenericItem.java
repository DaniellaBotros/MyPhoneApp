package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GenericItem<T>{
    @SerializedName("List")
    private List<T> list;
    @SerializedName("Message")
    private String Message;
    @SerializedName("Status")
    private int Status;

    public List<T> getList() {
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
        String val="Status: "+this.Status+"\n"+ "Message: "+this.Message+"\n"+"List Content: "+this.list.size()+"\n";
        for(int i=0;i<this.list.size();i++){
            val=val+this.list.get(i);
        }
        val=val+"\t"+"}";
        return val;
    }
}
