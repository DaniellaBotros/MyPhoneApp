package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class GenericItemContent {
    @SerializedName("Code")
    private String Code;
    @SerializedName("Description")
    private String Description;
    @SerializedName("Language")
    private String Language;

    public GenericItemContent(String Code, String Description, String Language) {
        this.Code=Code;
        this.Description=Description;
        this.Language=Language;
    }

    public String getCode() {
        return this.Code;
    }
    public String getDescription() {
        return this.Description;
    }
    public String getLanguage() {
        return this.Language;
    }

    @Override
    public String toString(){
        return "Code: "+this.Code+"\n"+"Description: "+this.Description+"\n"+"Language: "+this.Language+"\n";
    }
}
