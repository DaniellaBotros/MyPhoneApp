package com.example.myapplication2;

import java.util.Calendar;

public class DataObj {
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
    public DataObj(int num_of_full_time_workers,int num_of_temp_workers,String active_account_num,String account_Branch,
                   String notice,String delegate,String socialStat,String electronic_wallet,String geographic_sector,
                   Calendar registration_date, String education){
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
    }
    public DataObj(String geographic_sector, String delegate, Calendar registration_date,String social_stat, String education){
        this.geographic_sector=geographic_sector;
        this.delegate=delegate;
        this.registration_date=registration_date;
        this.social_stat=social_stat;
        this.education=education;
    }
}
