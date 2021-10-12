package com.example.myapplication2.RetrofitGoverment;

import com.google.gson.annotations.SerializedName;

public class GovernmentContent {
    @SerializedName("GovernmentCode")
    private String GovernmentCode;
    @SerializedName("GovernmentName")
    private String GovernmentName;
    @SerializedName("IsActive")
    private String IsActive;
    @SerializedName("OrgCode")
    private String OrgCode;

    public GovernmentContent(String GovernmentCode,String GovernmentName,String IsActive,String OrgCode){
        this.GovernmentCode=GovernmentCode;
        this.GovernmentName=GovernmentName;
        this.IsActive=IsActive;
        this.OrgCode=OrgCode;
    }

    public String getGovernmentCode(){return this.GovernmentCode;}
    public String getGovernmentName(){return this.GovernmentName;}
    public String getIsActive(){return this.IsActive;}
    public String getOrgCode(){return this.OrgCode;}

    @Override
    public String toString(){
        return "GovernmentCode: "+this.GovernmentCode+"\n"+"GovernmentName: "+this.GovernmentName+"\n"+
                "Is Active: "+this.IsActive+"\n"+"Organization Code: "+this.OrgCode+"\n";
    }
}
