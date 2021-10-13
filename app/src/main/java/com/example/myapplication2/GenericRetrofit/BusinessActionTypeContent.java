package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class BusinessActionTypeContent {
    @SerializedName("BusinessActivityTypeCode")
    private String BusinessActivityTypeCode;
    @SerializedName("BusinessActivityTypeName")
    private String BusinessActivityTypeName;
    @SerializedName("BusinessDivisionCode")
    private String BusinessDivisionCode;
    @SerializedName("IsActive")
    private String IsActive;
    @SerializedName("OrgCode")
    private String OrgCode;

    public BusinessActionTypeContent(String BusinessActivityTypeCode, String BusinessActivityTypeName, String BusinessDivisionCode, String IsActive, String OrgCode){
        this.BusinessActivityTypeCode=BusinessActivityTypeCode;
        this.BusinessActivityTypeName=BusinessActivityTypeName;
        this.BusinessDivisionCode=BusinessDivisionCode;
        this.IsActive=IsActive;
        this.OrgCode=OrgCode;
    }

    public String getBusinessDivisionCode(){return this.BusinessDivisionCode;}
    public String getBusinessActivityTypeName(){return this.BusinessActivityTypeName;}
    public String getBusinessActivityTypeCode(){return this.BusinessActivityTypeCode;}
    public String getIsActive(){return this.IsActive;}
    public String getOrgCode(){return this.OrgCode;}

    @Override
    public String toString(){
        return "Business Activity Type Code: "+this.BusinessActivityTypeCode+"\n"+"Business Activity Type Name: "+this.BusinessActivityTypeName+"\n"+
                "Business Division Code: "+this.BusinessDivisionCode+"\n"+"Is Active: "+this.IsActive+"\n"+"Organization Code: "+this.OrgCode+"\n";
    }

}
