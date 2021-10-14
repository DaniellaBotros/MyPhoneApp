package com.example.myapplication2.GenericRetrofit;

import com.google.gson.annotations.SerializedName;

public class OfficerLoginContent {
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

    public OfficerLoginContent(String BranchCode, String JobCode, String OfficerKey, String OfficerName, String OrgCode){
        this.BranchCode=BranchCode;
        this.JobCode=JobCode;
        this.OfficerKey=OfficerKey;
        this.OfficerName=OfficerName;
        this.OrgCode=OrgCode;
    }

    public String getBranchCode() {
        return this.BranchCode;
    }

    public String getJobCode(){
        return this.JobCode;
    }

    public String getOfficerName(){
        return this.OfficerName;
    }

    public String getOfficerKey(){
        return this.OfficerKey;
    }

    public String getOrgCode(){
        return this.OrgCode;
    }

    @Override
    public String toString() {
        return "BranchCode: " + this.BranchCode + '\n' +
                "JobCode: " + this.JobCode + '\n' +
                "OfficerKey: " + this.OfficerKey + '\n' +
                "OfficerName: " + this.OfficerName + '\n' +
                "OrgCode: " + this.OrgCode + '\n';
    }
}
