package com.example.myapplication2;

import com.google.gson.annotations.SerializedName;

enum Gender{
    female{ @Override public String toString() { return "Female"; } }
    , male{ @Override public String toString() { return "Male"; } }
}
enum UserType{
    single{ @Override public String toString() { return "Single"; } }
    , group{ @Override public String toString() { return "Group"; } }
    , groupMember{ @Override public String toString() { return "Member Of A Group"; } }
}
public class ClientObj implements ClientPlanner {

private String id;
private Gender gender;
private UserType user_type;
private String name;
private String name_lang_other;
private String national_id;
private String b_date;
private String national_id_date;
private String[] address;
private String postal;
private String cell;
private String phone_home;
private String[] email;
private String[] websites;
//// may change the bottom option's data type
private String gov_code;
private String cell_code;
private String fax;
private String admission_date;
//////////////////////////////////////////////////DataObj/////////////////////////////////////////////////////////////////////

    private int num_of_full_time_workers;
    private int num_of_temp_workers;
    private String active_account_num;
    private String account_Branch;
    private String notice;
    String registration_date;
    //// may change the bottom option's data type
    private String delegate;
    private String social_stat;
    private String education;
    private String electronic_wallet;
    private String geographic_sector;

    ///////////////////////////////////////////////////////////////JobObj///////////////////////////////////////////////////////////

    private String jname;
    private String[] address_job;
    private Boolean is_from_city;
    private String work_email;
    private String work_Phone;
    private String license_num;
    private String license_reg_Date;
    private String commercial_record;
    private String industrial_record;
    private String tax_card;
    //// may change the bottom option's data type
    private String government;
    private String district;
    private String village;
    private String government_code_work;
    private String work_sector;
    private String job_type;
    private String speciality;
    private String licensing_address;



    ///////////////////////////Constructors////////////////////////////////////////////////////////////////////

public ClientObj(){
//Empty Constructor
}

public ClientObj(Gender gender, UserType user_type, String name, String name_lang_other, String fax, String admission_date,
                 String national_id, String b_date, String national_id_date, String[] address, String postal,
                 String cell, String phone_home, String[] email, String[] websites, String goverment_code, String cell_code,
                 int num_of_full_time_workers, int num_of_temp_workers, String active_account_num, String account_Branch,
                 String notice, String delegate, String socialStat, String electronic_wallet, String geographic_sector,
                 String registration_date, String education, String jname, String[] address_job, Boolean is_from_city,
                 String work_email, String work_Phone, String license_num,
                 String license_reg_Date, String commercial_record, String industrial_record, String tax_card,
                 String government, String district, String village, String government_code_work, String work_sector, String job_type, String speciality, String licensing_address){

this.gender=gender;
this.user_type=user_type;
this.name=name;
this.name_lang_other=name_lang_other;
this.national_id=national_id;
this.b_date=b_date;
this.national_id_date=national_id_date;
this.address=address;
this.postal=postal;
this.cell=cell;
this.phone_home=phone_home;
this.email=email;
this.websites=websites;
this.gov_code =goverment_code;
this.cell_code=cell_code;
this.fax=fax;
this.admission_date=admission_date;

    this.num_of_full_time_workers=num_of_full_time_workers;
    this.num_of_temp_workers=num_of_temp_workers;
    this.active_account_num=active_account_num;
    this.account_Branch=account_Branch;
    this.notice=notice;
    this.delegate=delegate;
    this.social_stat= socialStat;
    this.electronic_wallet=electronic_wallet;
    this.geographic_sector=geographic_sector;
    this.registration_date=registration_date;
    this.education=education;


    this.jname=jname;
    this.address_job=address_job;
    this.is_from_city=is_from_city;
    this.work_email=work_email;
    this.work_Phone=work_Phone;
    this.license_num=license_num;
    this.license_reg_Date=license_reg_Date;
    this.commercial_record=commercial_record;
    this.industrial_record=industrial_record;
    this.tax_card=tax_card;
    this.government = government;
    this.government_code_work =government_code_work;
    this.district = district;
    this.village=village;
    this.work_sector=work_sector;
    this.job_type=job_type;
    this.speciality=speciality;
    this.licensing_address=licensing_address;


}
public ClientObj(String name, UserType user_type, Gender gender, String national_id, String national_id_date, String b_date,
                 String geographic_sector, String delegate, String registration_date, String social_stat, String education,
                 String government, String district, String village, String work_sector, String job_type){
this.name=name;
this.user_type=user_type;
this.gender=gender;
this.national_id=national_id;
this.national_id_date=national_id_date;
this.b_date=b_date;

    this.geographic_sector=geographic_sector;
    this.delegate=delegate;
    this.registration_date=registration_date;
    this.social_stat=social_stat;
    this.education=education;

    this.government = government;
    this.district = district;
    this.village=village;
    this.work_sector=work_sector;
    this.job_type=job_type;

}

    ///////////////////////////////////////////////////////////Setters////////////////////////////////////////////////////
    @Override
    public void setID(int id) {
        this.id=Integer.toString(id);
    }

    @Override
    public void setClientName(String name) {
        this.name=name;
    }

    @Override
    public void setClientGender(Gender g) {
        this.gender=g;
    }

    @Override
    public void setClientType(UserType ut) {
        this.user_type=ut;
    }

    @Override
    public void setClientOtherLangName(String n) {
        this.name_lang_other=n;
    }

    @Override
    public void setClientNationalID(String id) {
        this.national_id=id;
    }

    @Override
    public void setClientBirthdate(String date) {
       this.b_date=date;
    }

    @Override
    public void setClientNationalIdDate(String date) {
        this.national_id_date=date;
    }

    @Override
    public void setClientAddress(String[] a) {
        this.address=a;
    }

    @Override
    public void setClientPostal(String p) {
        this.postal=p;
    }

    @Override
    public void setClientCell(String c) {
        this.cell=c;
    }

    @Override
    public void setClientHomePhone(String home) {
        this.phone_home=home;
    }

    @Override
    public void setClientEmail(String[] email) {
        this.email=email;
    }

    @Override
    public void setClientWebsite(String[] w) {
        this.websites=w;
    }

    @Override
    public void setClientGovernmentCode(String dc) {
        this.gov_code =dc;
    }

    @Override
    public void setClientCellCode(String cc) {
        this.cell_code=cc;
    }

    @Override
    public void setClientNumFullTimeWorkers(int n) {
        this.num_of_full_time_workers=n;
    }

    @Override
    public void setClientNumTempWorkers(int n) {
        this.num_of_temp_workers=n;
    }

    @Override
    public void setClientActiveAccountNum(String n) {
        active_account_num=n;
    }

    @Override
    public void setClientAccountBranch(String account_Branch) {
        this.account_Branch=account_Branch;
    }

    @Override
    public void setClientNotice(String n) {
        this.notice=n;
    }

    @Override
    public void setClientRegistrationDate(String date) {
        this.registration_date=date;
    }

    @Override
    public void setClientDelegate(String deleg) {
        this.delegate=deleg;
    }

    @Override
    public void setClientSocialStatus(String social_stat) {
        this.social_stat=social_stat;
    }

    @Override
    public void setClientEducation(String e) {
        this.education=e;
    }

    @Override
    public void setClientElectronicWallet(String ew) {
        this.electronic_wallet=ew;
    }

    @Override
    public void setClientGeographicSector(String g) {
        this.geographic_sector=g;
    }

    @Override
    public void setClientJobName(String job) {
        this.jname=job;
    }

    @Override
    public void setClientJobAddress(String[] ja) {
        this.address_job=ja;
    }

    @Override
    public void setClientIsFromCity(Boolean f) {
        this.is_from_city=f;
    }

    @Override
    public void setClientWorkEmail(String we) {
        this.work_email=we;
    }

    @Override
    public void setClientWorkPhone(String wp) {
        this.work_Phone=wp;
    }

    @Override
    public void setClientLicenseNum(String ln) {
        this.license_num=ln;
    }

    @Override
    public void setClientLicenseRegistrationDate(String date) {
        this.license_reg_Date=date;
    }

    @Override
    public void setClientCommercialRecord(String cr) {
        this.commercial_record=cr;
    }

    @Override
    public void setClientIndustrialRecord(String ir) {
        this.industrial_record=ir;
    }

    @Override
    public void setClientTaxCard(String tc) {
        this.tax_card=tc;
    }

    @Override
    public void setClientGovernment(String government) {
        this.government = government;
    }

    @Override
    public void setClientDistrict(String c) {
        this.district =c;
    }

    @Override
    public void setClientVillage(String v) {
        this.village=v;
    }

    @Override
    public void setClientGovernmentCodeWork(String dcw) {
        this.government_code_work =dcw;
    }

    @Override
    public void setClientWorkSector(String ws) {
        this.work_sector=ws;
    }

    @Override
    public void setClientJobType(String jt) {
        this.job_type=jt;
    }

    @Override
    public void setClientSpeciality(String s) {
        this.speciality=s;
    }

    @Override
    public void setClientFaxNum(String s) {
        this.fax=s;
    }

    @Override
    public void setClientAdmissionDate(String s) {
        this.admission_date=s;
    }

    @Override
    public void setClientLicensingAddress(String s) {
        this.licensing_address=s;
    }

    ///////////////////////////////////////////////////////////Getters////////////////////////////////////////////////////

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getClientName() {
        return name;
    }

    @Override
    public String getClientGender() {
        return gender.toString();
    }

    @Override
    public String getClientType() {
        return user_type.toString();
    }

    @Override
    public String getClientOtherLangName() {
        return name_lang_other;
    }

    @Override
    public String getClientNationalID() {
        return national_id;
    }

    @Override
    public String getClientBirthdate() {
        return b_date;
    }

    @Override
    public String getClientNationalIdDate() {
        return national_id_date;
    }

    @Override
    public String[] getClientAddress() {
        return address;
    }

    @Override
    public String getClientPostal() {
        return postal;
    }

    @Override
    public String getClientCell() {
        return cell;
    }

    @Override
    public String getClientHomePhone() {
        return phone_home;
    }

    @Override
    public String[] getClientEmail() {
        return email;
    }

    @Override
    public String[] getClientWebsite() {
        return websites;
    }

    @Override
    public String getClientGovernmentCode() {
        return gov_code;
    }

    @Override
    public String getClientCellCode() {
        return cell_code;
    }

    @Override
    public int getClientNumFullTimeWorkers() {
        return num_of_full_time_workers;
    }

    @Override
    public int getClientNumTempWorkers() {
        return num_of_temp_workers;
    }

    @Override
    public String getClientActiveAccountNum() {
        return active_account_num;
    }

    @Override
    public String getClientAccountBranch() {
        return account_Branch;
    }

    @Override
    public String getClientNotice() {
        return notice;
    }

    @Override
    public String getClientRegistrationDate() {
        return registration_date;
    }

    @Override
    public String getClientDelegate() {
        return delegate;
    }

    @Override
    public String getClientSocialStatus() {
        return social_stat;
    }

    @Override
    public String getClientEducation() {
        return education;
    }

    @Override
    public String getClientElectronicWallet() {
        return electronic_wallet;
    }

    @Override
    public String getClientGeographicSector() {
        return geographic_sector;
    }

    @Override
    public String getClientJobName() {
        return jname;
    }

    @Override
    public String[] getClientJobAddress() {
        return address_job;
    }

    @Override
    public Boolean getClientIsFromCity() {
        return is_from_city;
    }

    @Override
    public String getClientWorkEmail() {
        return work_email;
    }

    @Override
    public String getClientWorkPhone() {
        return work_Phone;
    }

    @Override
    public String getClientLicenseNum() {
        return license_num;
    }

    @Override
    public String getClientLicenseRegistrationDate() {
        return license_reg_Date;
    }

    @Override
    public String getClientCommercialRecord() {
        return commercial_record;
    }

    @Override
    public String getClientIndustrialRecord() {
        return industrial_record;
    }

    @Override
    public String getClientTaxCard() {
        return tax_card;
    }

    @Override
    public String getClientGovernment() {
        return government;
    }

    @Override
    public String getClientDistrict() {
        return district;
    }

    @Override
    public String getClientVillage() {
        return village;
    }

    @Override
    public String getClientGovernmentCodeWork() {
        return government_code_work;
    }

    @Override
    public String getClientWorkSector() {
        return work_sector;
    }

    @Override
    public String getClientJobType() {
        return job_type;
    }

    @Override
    public String getClientSpeciality() {
        return speciality;
    }

    @Override
    public String getClientFaxNum() {
        return fax;
    }

    @Override
    public String getClientAdmissionDate() {
        return admission_date;
    }

    @Override
    public String getClientLicensingAddress() {
        return licensing_address;
    }
}
