package com.example.myapplication2.GenericRetrofit;

import com.example.myapplication2.BasicClientBuilder;
import com.example.myapplication2.ClientObj;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class DummyClient {
    @SerializedName("BirthDate")
    private String BirthDate="";
    @SerializedName("BranchCode")
    private String BranchCode="";
    @SerializedName("BusinessActivityTypeCode")
    private String BusinessActivityTypeCode="";
    @SerializedName("BusinessAddress1")
    private String BusinessAddress1="";
    @SerializedName("BusinessAddress2")
    private String BusinessAddress2="";
    @SerializedName("BusinessAddress3")
    private String BusinessAddress3="";
    @SerializedName("BusinessDivisionCode")
    private String BusinessDivisionCode="";
    @SerializedName("BusinessLongitude")
    private String BusinessLongitude="";
    @SerializedName("BusinessName")
    private String BusinessName="";
    @SerializedName("BusinessTelephone")
    private String BusinessTelephone="";
    @SerializedName("BusinessZip")
    private String BusinessZip="";
    @SerializedName("BusinessZoom")
    private String BusinessZoom="";
    @SerializedName("ClientName")
    private String ClientName="";
    @SerializedName("ClientTypeCode")
    private String ClientTypeCode="";
    @SerializedName("CommercialRegistrationNumber")
    private String CommercialRegistrationNumber="";
    @SerializedName("DistrictCode")
    private String DistrictCode="";
    @SerializedName("Email1")
    private String Email1="";
    @SerializedName("Email2")
    private String Email2="";
    @SerializedName("Email3")
    private String Email3="";
    @SerializedName("Email4")
    private String Email4="";
    @SerializedName("FaxNo")
    private String FaxNo="";
    @SerializedName("Gender")
    private String Gender="";
    @SerializedName("GeographicalAreaCode")
    private String GeographicalAreaCode="";
    @SerializedName("GovernmentCode")
    private String GovernmentCode="";
    @SerializedName("HomeAddress1")
    private String HomeAddress1="";
    @SerializedName("HomeAddress2")
    private String HomeAddress2="";
    @SerializedName("HomeAddress3")
    private String HomeAddress3="";
    @SerializedName("HomeLatitude")
    private String HomeLatitude="";
    @SerializedName("HomeLongitude")
    private String HomeLongitude="";
    @SerializedName("HomeTelephone")
    private String HomeTelephone="";
    @SerializedName("HomeZip")
    private String HomeZip="";
    @SerializedName("HomeZoom")
    private String HomeZoom="";
    @SerializedName("IdDisbursementDate")
    private String IdDisbursementDate="";
    @SerializedName("MobileNumber1")
    private String MobileNumber1="";
    @SerializedName("MobileNumber2")
    private String MobileNumber2="";
    @SerializedName("MobileNumber3")
    private String MobileNumber3="";
    @SerializedName("MobileNumber4")
    private String MobileNumber4="";
    @SerializedName("NationalId")
    private String NationalId="";
    @SerializedName("Notes")
    private String Notes="";
    @SerializedName("OfficerKey")
    private String OfficerKey="";
    @SerializedName("OrgCode")
    private String OrgCode="";
    @SerializedName("VillageCode")
    private String VillageCode="";
    @SerializedName("WebPageAdd1")
    private String WebPageAdd1="";
    @SerializedName("WebPageAdd2")
    private String WebPageAdd2="";
    @SerializedName("WebPageAdd3")
    private String WebPageAdd3="";
    @SerializedName("WebPageAdd4")
    private String WebPageAdd4="";
    @SerializedName("busLatitude")
    private String busLatitude="";
    @SerializedName("MartialStatus")
    private String MartialStatus="";
    @SerializedName("EducationLevelCode")
    private String EducationLevelCode="";

    public DummyClient(String BranchCode,String ClientName,String ClientTypeCode,String Gender,String NationalId,String IdDisbursementDate,String BirthDate,
                       String GovernmentCode,String DistrictCode,String VillageCode,String BusinessDivisionCode,String BusinessActivityTypeCode
                       ,String GeographicalAreaCode, String MartialStatus,String EducationLevelCode){
        this.BranchCode=BranchCode;
        this.ClientName=ClientName;
        this.ClientTypeCode=ClientTypeCode;
        this.Gender=Gender;
        this.NationalId=NationalId;
        this.IdDisbursementDate=IdDisbursementDate;
        this.BirthDate=BirthDate;
        this.GovernmentCode=GovernmentCode;
        this.DistrictCode=DistrictCode;
        this.VillageCode=VillageCode;
        this.BusinessDivisionCode=BusinessDivisionCode;
        this.BusinessActivityTypeCode=BusinessActivityTypeCode;
        this.GeographicalAreaCode=GeographicalAreaCode;
        this.MartialStatus=MartialStatus;
        this.EducationLevelCode=EducationLevelCode;
    }

  @Override
    public String toString(){
     /* return "BranchCode: "+this.BranchCode+"\n"+"Client Name: "+this.ClientName+"\n"+"OrgCode: "+this.OrgCode+"\n"+"Officer Key: "+this.OfficerKey+"\n"+
                "Gender: "+this.Gender+"\n"+"Client Type Code: "+this.ClientTypeCode+"\n"+"National ID: "+this.NationalId+"\n"+
                "National ID Date: "+this.IdDisbursementDate+"\n"+"Birth Date: "+this.BirthDate+"\n"+"Government Code: "+this.GovernmentCode+"\n"+
                "District Code: "+this.DistrictCode+"\n"+"Village Code: "+this.VillageCode+"\n"+"Business Division Code: "+this.BusinessDivisionCode+"\n"+
                "Business Activity Type Code: "+this.BusinessActivityTypeCode+"\n"+"Geographical Area Code: "+this.GeographicalAreaCode+"\n"+
                "Marital Status: "+this.MartialStatus+"\n"+"Education Level Code: "+this.EducationLevelCode+"\n";*/
        return new GsonBuilder().create().toJson(this, DummyClient.class);

    }




    public DummyClient(){

    }

    public DummyClient (BasicClientBuilder c){

        this.OfficerKey=c.getBuilderClientDelegate();
        this.OrgCode=c.getBuilderOrgCode();
        this.BranchCode=c.getBuilderBranchID();
        this.ClientName=c.getBuilderClientName();
        if(c.getBuilderClientType().equals("Single")){
            this.ClientTypeCode="1";
        }
        else if(c.getBuilderClientType().equals("Group")){
            this.ClientTypeCode="2";
        }
        else {
            this.ClientTypeCode="3";
        }

        this.Gender=(c.getBuilderClientGender().equals("Male"))? "2":"1";
        this.NationalId=c.getBuilderClientNationalID();
        this.IdDisbursementDate=c.getBuilderClientNationalIdDate();
        this.BirthDate=c.getBuilderClientBirthdate();
        this.GovernmentCode=c.getBuilderClientGovernment();
        this.DistrictCode=c.getBuilderClientDistrict();
        this.VillageCode=c.getBuilderClientVillage();
        this.BusinessDivisionCode=c.getBuilderClientWorkSector();
        this.BusinessActivityTypeCode=c.getBuilderClientJobType();
        this.GeographicalAreaCode=c.getBuilderClientGeographicSector();
        this.MartialStatus=c.getBuilderClientSocialStatus();
        this.EducationLevelCode=c.getBuilderClientEducation();

        this.BusinessName=(c.getBuilderClientJobName()!=null)?"":c.getBuilderClientJobName();

        this.BusinessAddress1=(c.getBuilderClientJobAddress()[0]!=null)?"":c.getBuilderClientJobAddress()[0];
        this.BusinessTelephone=(c.getBuilderClientWorkPhone()!=null)?"":c.getBuilderClientWorkPhone();
        this.HomeTelephone=(c.getBuilderClientHomePhone()!=null)?"":c.getBuilderClientHomePhone();
        this.HomeAddress1=(c.getBuilderClientAddress()[0]!=null)?"":c.getBuilderClientAddress()[0];
        this.Email1=(c.getBuilderClientEmail1()!=null)?"":c.getBuilderClientEmail1();
        this.WebPageAdd1=(c.getBuilderClientWebsite1()!=null)?"":c.getBuilderClientWebsite1();
        this.Notes=(c.getBuilderClientNotice()!=null)?"":c.getBuilderClientNotice();
        this.FaxNo=(c.getBuilderClientFaxNum()!=null)?"":c.getBuilderClientFaxNum();




    }

    public void IdentityMandatoryData(String ClientName,String IdDisbursementDate,String BirthDate){
        this.ClientName=ClientName;
        this.IdDisbursementDate=IdDisbursementDate;
        this.BirthDate=BirthDate;
    }

    public void PersonalMandatoryInformation(String HomeAddress1){
        this.HomeAddress1=HomeAddress1;
    }

    public void BusinessMandatoryData(String BusinessName,String BusinessAddress1 ){
        this.BusinessName=BusinessName;
        this.BusinessAddress1=BusinessAddress1;
    }

    //////////////////////////////////////Setters///////////////////////////////////////////////////

    public void setBirthDate(String d){

        this.BirthDate=d;
    }
    public void setBranchCode(String code){

        this.BranchCode=code;
    }
    public void setBusinessActivityTypeCode(String code){

        this.BusinessActivityTypeCode=code;
    }
    public void setBusinessDivisionCode(String code){

        this.BusinessDivisionCode=code;
    }
    public void setClientTypeCode(String code){

        this.ClientTypeCode=code;
    }
    public void setBusinessName(String name){
        ;
        this.BusinessName=name;
    }


    public void setBranchID(String id) {

        this.BranchCode=id;
    }

    public void setDistrictCode(String code){

        this.DistrictCode=code;
    }

    public void setGender(String g){

        this.Gender=g;
    }

    public void setGovernmentCode(String code){

        this.GovernmentCode=code;
    }




    public void setClientName(String clientName) {

        this.ClientName = clientName;
    }

    public void setGeographicalAreaCode(String code){

        this.GeographicalAreaCode=code;
    }

    public void setIdDisbursementDate(String date){

        this.IdDisbursementDate=date;
    }

    public void setNationalId(String id){

        this.NationalId=id;
    }

    public void setOfficerKey(String key){

        this.OfficerKey=key;
    }

    public void setVillageCode(String code){

        this.VillageCode=code;
    }

    public void setOrgCode(String code){
        this.OrgCode=code;

    }

    public void setNotes(String note){

        this.Notes=note;
    }

    public void setFaxNo(String fax){

        this.FaxNo=fax;
    }

    public void setCommercialRegistrationNumber(String crn){

        this.CommercialRegistrationNumber=crn;
    }

    public void setBusinessAddress1(String ba){
        this.BusinessAddress1=ba;
    }

    public void setBusinessAddress2(String businessAddress2) {
        this.BusinessAddress2 = businessAddress2;
    }

    public void setBusinessAddress3(String ba){
        this.BusinessAddress3=ba;
    }

    public void setAllBusinessAddresses(){
        String[] arr=new String[3];

        arr[0]=this.BusinessAddress1;

        if (this.BusinessAddress2!=null){
            arr[1]=this.BusinessAddress2;
        }
        if(this.BusinessAddress3!=null){
            arr[2]=this.BusinessAddress3;
        }



    }

    public void setBusinessTelephone(String businessTelephone) {

        BusinessTelephone = businessTelephone;
    }

    public void setHomeAddress1(String ha){
        this.HomeAddress1=ha;
    }

    public void setHomeAddress2(String ha){
        this.HomeAddress2=ha;
    }

    public void setHomeAddress3(String ha){
        this.HomeAddress3=ha;
    }

    public void setAllHomeAddresses(){
        String[] arr=new String[3];

        arr[0]=this.HomeAddress1;

        if (this.BusinessAddress2!=null){
            arr[1]=this.HomeAddress2;
        }
        if(this.BusinessAddress3!=null){
            arr[2]=this.HomeAddress3;
        }


    }

    public void setEmail1(String email) {
        this.Email1 = email;

    }

    public void setEmail2(String email){
        this.Email2=email;

    }

    public void setEmail3(String email) {
        this.Email3 = email;

    }

    public void setEmail4(String email) {
        this.Email4 = email;

    }

    public void setHomeTelephone(String ht){

        this.HomeTelephone=ht;
    }

    public void setWebPageAdd1(String web){
        this.WebPageAdd1=web;

    }

    public void setWebPageAdd2(String web){
        this.WebPageAdd2=web;

    }

    public void setWebPageAdd3(String web){
        this.WebPageAdd3=web;

    }

    public void setWebPageAdd4(String web){
        this.WebPageAdd4=web;

    }

    public void setMartialStatus(String status){
        this.MartialStatus=status;

    }

    public void setEducationLevelCode(String education){
        this.EducationLevelCode=education;

    }

    public void setMobileNumber1(String cell){
        this.MobileNumber1=cell;

    }

    public void setHomeZip(String hz){
        this.HomeZip=hz;

    }

    public void setMobileNumber2(String cell){
        this.MobileNumber2=cell;
    }

    public void setMobileNumber3(String cell){
        this.MobileNumber3=cell;
    }

    public void setMobileNumber4(String cell){
        this.MobileNumber4=cell;
    }

    public void setBusinessZip(String bz){
        this.BusinessZip=bz;
    }

    public void setBusinessZoom(String zoom){
        this.BusinessZoom=zoom;
    }

    public void setBusLatitude(String lat){
        this.busLatitude=lat;
    }

    public void setHomeZoom(String hz){
        this.HomeZoom=hz;
    }

    public void setHomeLatitude(String lat){
        this.HomeLatitude=lat;
    }

    public void setHomeLongitude(String hl){
        this.HomeLongitude=hl;
    }

    public void setBusinessLongitude(String bl){
        this.BusinessLongitude=bl;
    }

    ////////////////////////////////////////////Getters//////////////////////////////////////////////

    public String getBranchCode(){
        return this.BranchCode;
    }

    public String getBirthDate() {
        return this.BirthDate;
    }

    public String getBusinessActivityTypeCode() {
        return this.BusinessActivityTypeCode;
    }

    public String getBusinessAddress1() {
        return this.BusinessAddress1;
    }

    public String getBusinessAddress2() {
        return this.BusinessAddress2;
    }

    public String getBusinessAddress3() {
        return this.BusinessAddress3;
    }

    public String getBusinessDivisionCode() {
        return this.BusinessDivisionCode;
    }

    public String getBusinessLongitude() {
        return this.BusinessLongitude;
    }

    public String getBusinessName() {
        return this.BusinessName;
    }

    public String getBusinessTelephone() {
        return this.BusinessTelephone;
    }

    public String getBusinessZip() {
        return this.BusinessZip;
    }

    public String getBusinessZoom() {
        return this.BusinessZoom;
    }


    public String getClientName() {
        return this.ClientName;
    }

    public String getClientTypeCode() {
        return this.ClientTypeCode;
    }

    public String getCommercialRegistrationNumber() {
        return this.CommercialRegistrationNumber;
    }

    public String getDistrictCode() {
        return this.DistrictCode;
    }

    public String getEmail1() {
        return this.Email1;
    }

    public String getEmail2() {
        return this.Email2;
    }

    public String getEmail3() {
        return this.Email3;
    }

    public String getEmail4() {
        return this.Email4;
    }

    public String getFaxNo() {
        return this.FaxNo;
    }

    public String getGender() {
        return this.Gender;
    }

    public String getGeographicalAreaCode() {
        return this.GeographicalAreaCode;
    }

    public String getBusLatitude() {
        return this.busLatitude;
    }

    public String getGovernmentCode() {
        return this.GovernmentCode;
    }

    public String getEducationLevelCode() {
        return this.EducationLevelCode;
    }

    public String getHomeAddress1() {
        return this.HomeAddress1;
    }

    public String getHomeAddress2() {
        return this.HomeAddress2;
    }

    public String getHomeAddress3() {
        return this.HomeAddress3;
    }

    public String getHomeLatitude() {
        return this.HomeLatitude;
    }

    public String getHomeLongitude() {
        return this.HomeLongitude;
    }

    public String getHomeTelephone() {
        return this.HomeTelephone;
    }

    public String getHomeZip() {
        return this.HomeZip;
    }

    public String getHomeZoom() {
        return this.HomeZoom;
    }

    public String getIdDisbursementDate() {
        return this.IdDisbursementDate;
    }

    public String getMartialStatus() {
        return this.MartialStatus;
    }

    public String getMobileNumber1() {
        return this.MobileNumber1;
    }

    public String getMobileNumber2() {
        return this.MobileNumber2;
    }

    public String getMobileNumber3() {
        return this.MobileNumber3;
    }

    public String getMobileNumber4() {
        return this.MobileNumber4;
    }

    public String getNationalId() {
        return this.NationalId;
    }

    public String getNotes() {
        return this.Notes;
    }

    public String getOfficerKey() {
        return this.OfficerKey;
    }

    public String getOrgCode() {
        return this.OrgCode;
    }

    public String getVillageCode() {
        return this.VillageCode;
    }

    public String getWebPageAdd1() {
        return this.WebPageAdd1;
    }

    public String getWebPageAdd2() {
        return this.WebPageAdd2;
    }

    public String getWebPageAdd3() {
        return this.WebPageAdd3;
    }

    public String getWebPageAdd4() {
        return this.WebPageAdd4;
    }

}
