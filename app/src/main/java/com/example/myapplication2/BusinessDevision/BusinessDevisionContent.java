package com.example.myapplication2.BusinessDevision;

import com.google.gson.annotations.SerializedName;

public class BusinessDevisionContent {
    @SerializedName("BusinessDivisionCode")
    private String BusinessDivisionCode;
    @SerializedName("BusinessDivisionName")
    private String BusinessDivisionName;
    @SerializedName("IsActive")
    private String IsActive;
    @SerializedName("OrgCode")
    private String OrgCode;

    public BusinessDevisionContent(String BusinessDivisionCode,String BusinessDivisionName,String IsActive,String OrgCode){
        this.BusinessDivisionCode=BusinessDivisionCode;
        this.BusinessDivisionName=BusinessDivisionName;
        this.IsActive=IsActive;
        this.OrgCode=OrgCode;
    }

    public String getBusinessDivisionCode(){return this.BusinessDivisionCode;}
    public String getBusinessDivisionName(){return this.BusinessDivisionName;}
    public String getIsActive(){return this.IsActive;}
    public String getOrgCode(){return this.OrgCode;}

    @Override
    public String toString(){
        return "Business Division Code: "+this.BusinessDivisionCode+"\n"+"Business Division Name: "+this.BusinessDivisionName+"\n"+
                "Is Active: "+this.IsActive+"\n"+"Organization Code: "+this.OrgCode+"\n";
    }
}
