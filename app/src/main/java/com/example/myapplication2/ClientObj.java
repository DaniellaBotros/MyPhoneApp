package com.example.myapplication2;

import java.util.Calendar;

enum Gender{
    female{ @Override public String toString() { return "Female"; } }
    , male{ @Override public String toString() { return "Male"; } }
}
enum UserType{
    single{ @Override public String toString() { return "Single"; } }
    , group{ @Override public String toString() { return "Group"; } }
    , groupMember{ @Override public String toString() { return "Member Of A Group"; } }
}
public class ClientObj {
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
    private String district_code;
    private String work_sector;
    private String job_type;
    private String speciality;



    ///////////////////////////Constructors////////////////////////////////////////////////////////////////////

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
    this.district_code=district_code;
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
public String get_id(){
    return this.id;
}
public void set_id(int id){
    this.id=Integer.toString(id);
}
}
