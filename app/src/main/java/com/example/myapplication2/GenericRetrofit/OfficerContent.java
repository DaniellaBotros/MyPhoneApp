package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class OfficerContent {
    @SerializedName("BranchCode")
    private String BranchCode;
    @SerializedName("JobCode")
    private String JobCode;
    @SerializedName("OfficerKey")
    private String OfficerKey;
    @SerializedName("OfficerName")
    private String OfficerName;
    @SerializedName("OrgCode")
    private String OrgCode;

    public OfficerContent(String BranchCode, String JobCode, String OfficerKey, String OfficerName, String OrgCode){
        this.BranchCode=BranchCode;
        this.JobCode=JobCode;
        this.OfficerKey=OfficerKey;
        this.OfficerName=OfficerName;
        this.OrgCode=OrgCode;
    }

    public String getOrgCode(){return this.OrgCode;}
    public String getBranchCode(){return this.BranchCode;}
    public String getJobCode(){return this.JobCode;}
    public String getOfficerKey(){return this.OfficerKey;}
    public String getOfficerName(){return this.OfficerName;}

    @Override
    public String toString(){
        return "Branch Code: "+this.BranchCode+"\n"+"Job Code: "+this.JobCode+"\n"+"Officer Key: "+this.OfficerKey+"\n"+
                "Officer Name: "+this.OfficerName+"\n"+"Organization Code: "+this.OrgCode+"\n";
    }
}
