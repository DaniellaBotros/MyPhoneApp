package com.example.myapplication2.GenericRetrofit;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class DummyClientToSend {
    @SerializedName("client")
    private DummyClient client;

    public DummyClientToSend(DummyClient c){
        this.client=c;
    }

    public void setClient(DummyClient c){
        this.client=c;
    }
    public DummyClient getClient(){
        return this.client;
    }
   @Override
    public String toString(){
        return "{\"client\":"+this.client.toString()+"}";
    }
}
