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
private JobObj job;
private DataObj data;
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

public ClientObj(JobObj job,DataObj data,Gender gender,UserType user_type,String name,String name_lang_other,
                 String national_id,Calendar b_date,Calendar national_id_date,String[] address,String postal,
                 String cell,String phone_home,String[] email,String[] websites,String dist_code,String cell_code){
this.job=job;
this.data=data;
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
}
public ClientObj(String name, UserType user_type,Gender gender, String national_id,Calendar national_id_date,Calendar b_date){
this.name=name;
this.user_type=user_type;
this.gender=gender;
this.national_id=national_id;
this.national_id_date=national_id_date;
this.b_date=b_date;
}
public String get_id(){
    return this.id;
}
public void set_id(int id){
    this.id=Integer.toString(id);
}
}
