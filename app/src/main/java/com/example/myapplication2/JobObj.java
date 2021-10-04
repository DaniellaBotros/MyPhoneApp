package com.example.myapplication2;

import java.util.Calendar;

public class JobObj {
private String jname;
private String[] address;
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



public JobObj(String jname, String[] address, Boolean is_from_city, String work_email, String work_Phone, String license_num,
              Calendar license_reg_Date, String commercial_record, String industrial_record, String tax_card,
              String district, String center, String village, String district_code, String work_sector, String job_type, String speciality){
    this.jname=jname;
    this.address=address;
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
public JobObj(String district,String center, String village, String work_sector, String job_type){
this.district=district;
this.center=center;
this.village=village;
this.work_sector=work_sector;
this.job_type=job_type;
}
}
