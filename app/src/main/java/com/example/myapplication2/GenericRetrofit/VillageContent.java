package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class VillageContent {
    @SerializedName("DistrictCode")
    private String DistrictCode;
    @SerializedName("GovernmentCode")
    private String GovernmentCode;
    @SerializedName("IsActive")
    private String IsActive;
    @SerializedName("OrgCode")
    private String OrgCode;
    @SerializedName("VillageCode")
    private String VillageCode;
    @SerializedName("VillagelName")
    private String VillagelName;

    public VillageContent(String DistrictCode, String GovernmentCode, String IsActive, String OrgCode, String VillageCode, String VillagelName){
        this.DistrictCode=DistrictCode;
        this.GovernmentCode=GovernmentCode;
        this.IsActive=IsActive;
        this.OrgCode=OrgCode;
        this.VillageCode=VillageCode;
        this.VillagelName=VillagelName;
    }
    public String getDistrictCode(){ return this.DistrictCode;}
    public String getGovernmentCode(){return this.GovernmentCode;}
    public String getIsActive(){return this.IsActive;}
    public String getOrgCode(){return this.OrgCode;}
    public String getVillageCode(){return this.VillageCode;}
    public String getVillagelName(){return this.VillagelName;}

    @Override
    public String toString(){
        return "District Code: "+this.DistrictCode+"\n"+"Government Code: "+this.GovernmentCode+"\n"+
                "Is Active: "+this.IsActive+"\n"+"Organization Code: "+this.OrgCode+"\n"+
                "Village Code: "+this.VillageCode+"\n"+"Village Name: "+this.VillagelName+"\n";
    }

}
