package com.example.myapplication2;

import android.icu.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Locale;

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
private Calendar b_date;
private Calendar national_id_date;
private String[] address;
private String postal;
private String cell;
private String phone_home;
private String[] email;
private String[] websites;
//// may change the bottom option's data type
private String dist_code;
private String cell_code;
//////////////////////////////////////////////////DataObj/////////////////////////////////////////////////////////////////////

    private int num_of_full_time_workers;
    private int num_of_temp_workers;
    private String active_account_num;
    private String account_Branch;
    private String notice;
    Calendar registration_date;
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
    private Calendar license_reg_Date;
    private String commercial_record;
    private String industrial_record;
    private String tax_card;
    //// may change the bottom option's data type
    private String district;
    private String center;
    private String village;
    private String district_code_work;
    private String work_sector;
    private String job_type;
    private String speciality;



    ///////////////////////////Constructors////////////////////////////////////////////////////////////////////

public ClientObj(){
//Empty Constructor
}

public ClientObj(Gender gender,UserType user_type,String name,String name_lang_other,
                 String national_id,Calendar b_date,Calendar national_id_date,String[] address,String postal,
                 String cell,String phone_home,String[] email,String[] websites,String dist_code,String cell_code,
                 int num_of_full_time_workers,int num_of_temp_workers,String active_account_num,String account_Branch,
                 String notice,String delegate,String socialStat,String electronic_wallet,String geographic_sector,
                 Calendar registration_date, String education,String jname, String[] address_job, Boolean is_from_city,
                 String work_email, String work_Phone, String license_num,
                 Calendar license_reg_Date, String commercial_record, String industrial_record, String tax_card,
                 String district, String center, String village, String district_code, String work_sector, String job_type, String speciality){

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
this.dist_code=dist_code;
this.cell_code=cell_code;

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
    this.district=district;
    this.district_code_work =district_code;
    this.center=center;
    this.village=village;
    this.work_sector=work_sector;
    this.job_type=job_type;
    this.speciality=speciality;


}
public ClientObj(String name, UserType user_type,Gender gender, String national_id,Calendar national_id_date,Calendar b_date,
                 String geographic_sector, String delegate, Calendar registration_date,String social_stat, String education,
                 String district,String center, String village, String work_sector, String job_type){
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

    this.district=district;
    this.center=center;
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
    public void setClientBirthdate(Calendar date) {
       this.b_date=date;
    }

    @Override
    public void setClientNationalIdDate(Calendar date) {
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
    public void setClientDistrictCode(String dc) {
        this.dist_code=dc;
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
    public void setClientRegistrationDate(Calendar date) {
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
    public void setClientLicenseRegistrationDate(Calendar date) {
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
    public void setClientDistrict(String district) {
        this.district=district;
    }

    @Override
    public void setClientCenter(String c) {
        this.center=c;
    }

    @Override
    public void setClientVillage(String v) {
        this.village=v;
    }

    @Override
    public void setClientDistrictCodeWork(String dcw) {
        this.district_code_work=dcw;
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
    public Calendar getClientBirthdate() {
        return b_date;
    }

    @Override
    public Calendar getClientNationalIdDate() {
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
    public String getClientDistrictCode() {
        return dist_code;
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
    public Calendar getClientRegistrationDate() {
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
    public Calendar getClientLicenseRegistrationDate() {
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
    public String getClientDistrict() {
        return district;
    }

    @Override
    public String getClientCenter() {
        return center;
    }

    @Override
    public String getClientVillage() {
        return village;
    }

    @Override
    public String getClientDistrictCodeWork() {
        return district_code_work;
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
}
