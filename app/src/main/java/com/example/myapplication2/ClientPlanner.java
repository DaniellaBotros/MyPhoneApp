package com.example.myapplication2;

import java.util.Calendar;

public interface ClientPlanner {

///////////////////////////////////Setters//////////////////////////////////////////////
    public void setID(int id);
    public void setClientName(String name);
    public void setClientGender(Gender g);
    public void setClientType(UserType ut);
    public void setClientOtherLangName(String n);
    public void setClientNationalID(String id);
    public void setClientBirthdate(Calendar date);
    public void setClientNationalIdDate(Calendar date);
    public void setClientAddress(String[] a);
    public void setClientPostal(String p);
    public void setClientCell(String c);
    public void setClientHomePhone(String home);
    public void setClientEmail(String[] email);
    public void setClientWebsite(String[] w);
    public void setClientDistrictCode(String dc);
    public void setClientCellCode(String cc);
    public void setClientNumFullTimeWorkers(int n);
    public void setClientNumTempWorkers(int n);
    public void setClientActiveAccountNum(String n);
    public void setClientAccountBranch(String account_branch);
    public void setClientNotice(String n);
    public void setClientRegistrationDate(Calendar date);
    public void setClientDelegate(String deleg);
    public void setClientSocialStatus(String social_stat);
    public void setClientEducation(String e);
    public void setClientElectronicWallet(String ew);
    public void setClientGeographicSector(String g);
    public void setClientJobName(String job);
    public void setClientJobAddress(String[] ja);
    public void setClientIsFromCity(Boolean f);
    public void setClientWorkEmail(String we);
    public void setClientWorkPhone(String wp);
    public void setClientLicenseNum(String ln);
    public void setClientLicenseRegistrationDate(Calendar date);
    public void setClientCommercialRecord(String cr);
    public void setClientIndustrialRecord(String ir);
    public void setClientTaxCard(String tc);
    public void setClientDistrict(String district);
    public void setClientCenter(String c);
    public void setClientVillage(String v);
    public void setClientDistrictCodeWork(String dcw);
    public void setClientWorkSector(String ws);
    public void setClientJobType(String jt);
    public void setClientSpeciality(String s);

    ////////////////////////////////////////////////////////Getters////////////////////////////////////////////////////////////
    public String getID();
    public String getClientName();
    public String getClientGender();
    public String getClientType();
    public String getClientOtherLangName();
    public String getClientNationalID();
    public Calendar getClientBirthdate();
    public Calendar getClientNationalIdDate();
    public String[] getClientAddress();
    public String getClientPostal();
    public String getClientCell();
    public String getClientHomePhone();
    public String[] getClientEmail();
    public String[] getClientWebsite();
    public String getClientDistrictCode();
    public String getClientCellCode();
    public int getClientNumFullTimeWorkers();
    public int getClientNumTempWorkers();
    public String getClientActiveAccountNum();
    public String getClientAccountBranch();
    public String getClientNotice();
    public Calendar getClientRegistrationDate();
    public String getClientDelegate();
    public String getClientSocialStatus();
    public String getClientEducation();
    public String getClientElectronicWallet();
    public String getClientGeographicSector();
    public String getClientJobName();
    public String[] getClientJobAddress();
    public Boolean getClientIsFromCity();
    public String getClientWorkEmail();
    public String getClientWorkPhone();
    public String getClientLicenseNum();
    public Calendar getClientLicenseRegistrationDate();
    public String getClientCommercialRecord();
    public String getClientIndustrialRecord();
    public String getClientTaxCard();
    public String getClientDistrict();
    public String getClientCenter();
    public String getClientVillage();
    public String getClientDistrictCodeWork();
    public String getClientWorkSector();
    public String getClientJobType();
    public String getClientSpeciality();

}
