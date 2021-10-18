package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class ClientKey {
    @SerializedName("Key")
    private String Key;

    public void setKey(String key){
        this.Key=key;
    }
    public String getKey(){
        return this.Key;
    }
    @Override
    public String toString(){
        return "Client Key: "+this.Key+"\n";
    }
}
