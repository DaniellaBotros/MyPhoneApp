package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class DistrictContent {
    @SerializedName("DistrictCode")
    private String DistrictCode;
    @SerializedName("DistrictName")
    private String DistrictName;
    @SerializedName("GovernmentCode")
    private String GovernmentCode;
    @SerializedName("IsActive")
    private String IsActive;
    @SerializedName("OrgCode")
    private String OrgCode;

    public DistrictContent(String DistrictCode, String DistrictName, String GovernmentCode, String IsActive, String OrgCode){
        this.DistrictCode=DistrictCode;
        this.DistrictName=DistrictName;
        this.GovernmentCode=GovernmentCode;
        this.IsActive=IsActive;
        this.OrgCode=OrgCode;
    }

    public String getDistrictCode(){return this.DistrictCode;}
    public String getDistrictName(){return this.DistrictName;}
    public String getGovernmentCode(){return this.GovernmentCode;}
    public String getIsActive(){return this.IsActive;}
    public String getOrgCode(){return this.OrgCode;}

    @Override
    public String toString(){
        return "District Code: "+this.DistrictCode+"\n"+"District Name: "+this.DistrictName+"\n"+
                "Government Code: "+this.GovernmentCode+"\n"+"Is Active: "+this.IsActive+"\n"+
                "Organization Code: "+this.OrgCode+"\n";
    }
}
