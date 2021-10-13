package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class GeoContent {
    @SerializedName("BranchCode")
    private String BranchCode;
    @SerializedName("GeoAreaCode")
    private String GeoAreaCode;
    @SerializedName("GeoAreaName")
    private String GeoAreaName;
    @SerializedName("GeoBoundaries")
    private String GeoBoundaries;
    @SerializedName("OrgCode")
    private String OrgCode;

    public GeoContent(String BranchCode, String GeoAreaCode, String GeoAreaName, String GeoBoundaries, String OrgCode){
        this.BranchCode=BranchCode;
        this.GeoAreaCode=GeoAreaCode;
        this.GeoAreaName=GeoAreaName;
        this.GeoBoundaries=GeoBoundaries;
        this.OrgCode=OrgCode;
    }

    public String getBranchCode(){return this.BranchCode;}
    public String getGeoAreaCode(){return this.GeoAreaCode;}
    public String getGeoAreaName(){return this.GeoAreaName;}
    public String getGeoBoundaries(){return this.GeoBoundaries;}
    public String getOrgCode(){return this.OrgCode;}

    @Override
    public String toString(){
        return "Branch Code: "+this.BranchCode+"\n"+"Geographic Area Code: "+this.GeoAreaCode+"\n"+
                "Geographic Area Name: "+this.GeoAreaName+"\n"+"Geographic Boundaries: "+this.GeoBoundaries+"\n"+
                "Organization Code: "+this.OrgCode+"\n";
    }
}
