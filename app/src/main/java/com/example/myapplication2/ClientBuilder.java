package com.example.myapplication2;

import java.io.Serializable;
import java.util.Calendar;

////////////////////////////////////////////////////Explanation of use///////////////////////////////
/////////////////// This interface will be implemented by any class that wants to build a client
//////////////////with some or all of the form Data
////////////////////////////////////////////////////////////////////////////////////////////////////



public interface ClientBuilder extends Serializable {
    ////////////////////////////////////Getters or getBuilders////////////////////////////////////////////////////////////////////////
    public ClientObj getClient();

    public String getBuilderID();
    public String getBuilderOrgCode();
    public String getBuilderBranchID();
    public String getBuilderClientName();
    public String getBuilderClientGender();
    public String getBuilderClientType();
    public String getBuilderClientOtherLangName();
    public String getBuilderClientNationalID();
    public String getBuilderClientBirthdate();
    public String getBuilderClientNationalIdDate();
    public String[] getBuilderClientAddress();
    public String getBuilderClientPostal();
    public String getBuilderClientCell();
    public String getBuilderClientHomePhone();
    public String getBuilderClientEmail();
    public String getBuilderClientWebsite();
    public String getBuilderClientEmail1();
    public String getBuilderClientWebsite1();
    public String getBuilderClientEmail2();
    public String getBuilderClientWebsite2();
    public String getBuilderClientEmail3();
    public String getBuilderClientWebsite3();
    public String getBuilderClientGovernmentCode();
    public String getBuilderClientCellCode();
    public int getBuilderClientNumFullTimeWorkers();
    public int getBuilderClientNumTempWorkers();
    public String getBuilderClientActiveAccountNum();
    public String getBuilderClientAccountBranch();
    public String getBuilderClientNotice();
    public String getBuilderClientRegistrationDate();
    public String getBuilderClientDelegate();
    public String getBuilderClientSocialStatus();
    public String getBuilderClientEducation();
    public String getBuilderClientElectronicWallet();
    public String getBuilderClientGeographicSector();
    public String getBuilderClientJobName();
    public String[] getBuilderClientJobAddress();
    public Boolean getBuilderClientIsFromCity();
    public String getBuilderClientWorkEmail();
    public String getBuilderClientWorkPhone();
    public String getBuilderClientLicenseNum();
    public String getBuilderClientLicenseRegistrationDate();
    public String getBuilderClientCommercialRecord();
    public String getBuilderClientIndustrialRecord();
    public String getBuilderClientTaxCard();
    public String getBuilderClientGovernment();
    public String getBuilderClientDistrict();
    public String getBuilderClientVillage();
    public String getBuilderClientGovernmentCodeWork();
    public String getBuilderClientWorkSector();
    public String getBuilderClientJobType();
    public String getBuilderClientSpeciality();
    public String getBuilderClientFaxNum();
    public String getBuilderClientAdmissionDate();
    public String getBuilderClientLicensingAddress();
    //////////////////////////////////////////Builders or Setters//////////////////////////////////////////////////////
    public void BuildID(String id);
    public void BuildOrgCode(String code);
    public void BuildBranchID(String id);
    public void BuildClientName(String name);
    public void BuildClientGender(String g);
    public void BuildClientType(String ut);
    public void BuildClientOtherLangName(String n);
    public void BuildClientNationalID(String id);
    public void BuildClientBirthdate(String date);
    public void BuildClientNationalIdDate(String date);
    public void BuildClientAddress(String[] a);
    public void BuildClientPostal(String p);
    public void BuildClientCell(String c);
    public void BuildClientHomePhone(String home);
    public void BuildClientEmail(String email);
    public void BuildClientWebsite(String w);
    public void BuildClientEmail1(String email);
    public void BuildClientWebsite1(String w);
    public void BuildClientEmail2(String email);
    public void BuildClientWebsite2(String w);
    public void BuildClientEmail3(String email);
    public void BuildClientWebsite3(String w);
    public void BuildClientGovernmentCode(String dc);
    public void BuildClientCellCode(String cc);
    public void BuildClientNumFullTimeWorkers(int n);
    public void BuildClientNumTempWorkers(int n);
    public void BuildClientActiveAccountNum(String n);
    public void BuildClientAccountBranch(String account_branch);
    public void BuildClientNotice(String n);
    public void BuildClientRegistrationDate(String date);
    public void BuildClientDelegate(String deleg);
    public void BuildClientSocialStatus(String social_stat);
    public void BuildClientEducation(String e);
    public void BuildClientElectronicWallet(String ew);
    public void BuildClientGeographicSector(String g);
    public void BuildClientJobName(String job);
    public void BuildClientJobAddress(String[] ja);
    public void BuildClientIsFromCity(Boolean f);
    public void BuildClientWorkEmail(String we);
    public void BuildClientWorkPhone(String wp);
    public void BuildClientLicenseNum(String ln);
    public void BuildClientLicenseRegistrationDate(String date);
    public void BuildClientCommercialRecord(String cr);
    public void BuildClientIndustrialRecord(String ir);
    public void BuildClientTaxCard(String tc);
    public void BuildClientGovernment(String district);
    public void BuildClientDistrict(String c);
    public void BuildClientVillage(String v);
    public void BuildClientGovernmentCodeWork(String dcw);
    public void BuildClientWorkSector(String ws);
    public void BuildClientJobType(String jt);
    public void BuildClientSpeciality(String s);
    public void BuildClientFaxNum(String s);
    public void BuildClientAdmissionDate(String s);
    public void BuildClientLicensingAddress(String s);

    /////////////////////////Print Functions/////////////////////////////
}
