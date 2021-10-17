package com.example.myapplication2;

public class BasicClientBuilder implements  ClientBuilder{
    private ClientObj client;

    //////////////////////Constructor//////////////////////////////////////////////////////////////////////////////////////
    public BasicClientBuilder(){
        this.client=new ClientObj();
    }


    /////////////////////////////////////////////Setters or Builders//////////////////////////////////////////////////////

    @Override
    public ClientObj getClient() {
        return this.client;
    }

    @Override
    public String getBuilderID() {
        return client.getID();
    }

    @Override
    public String getBuilderBranchID() {
        return client.getBranchID();
    }

    @Override
    public String getBuilderClientName() {
        return client.getClientName();
    }

    @Override
    public String getBuilderClientGender() {
        return client.getClientGender();
    }

    @Override
    public String getBuilderClientType() {
        return client.getClientType();
    }

    @Override
    public String getBuilderClientOtherLangName() {
        return client.getClientOtherLangName();
    }

    @Override
    public String getBuilderClientNationalID() {
        return client.getClientNationalID();
    }

    @Override
    public String getBuilderClientBirthdate() {
        return client.getClientBirthdate();
    }

    @Override
    public String getBuilderClientNationalIdDate() {
        return client.getClientNationalIdDate();
    }

    @Override
    public String[] getBuilderClientAddress() {
        return client.getClientAddress();
    }

    @Override
    public String getBuilderClientPostal() {
        return client.getClientPostal();
    }

    @Override
    public String getBuilderClientCell() {
        return client.getClientCell();
    }

    @Override
    public String getBuilderClientHomePhone() {
        return client.getClientHomePhone();
    }

    @Override
    public String getBuilderClientEmail() {
        return client.getClientEmail();
    }

    @Override
    public String getBuilderClientWebsite() {
        return client.getClientWebsite();
    }

    @Override
    public String getBuilderClientEmail1() {
        return client.getClientEmail1();
    }

    @Override
    public String getBuilderClientWebsite1() {
        return client.getClientWebsite1();
    }

    @Override
    public String getBuilderClientEmail2() {
        return client.getClientEmail2();
    }

    @Override
    public String getBuilderClientWebsite2() {
        return client.getClientWebsite2();
    }

    @Override
    public String getBuilderClientEmail3() {
        return client.getClientEmail3();
    }

    @Override
    public String getBuilderClientWebsite3() {
        return client.getClientWebsite3();
    }

    @Override
    public String getBuilderClientGovernmentCode() {
        return client.getClientGovernmentCode();
    }

    @Override
    public String getBuilderClientCellCode() {
        return client.getClientCellCode();
    }

    @Override
    public int getBuilderClientNumFullTimeWorkers() {
        return client.getClientNumFullTimeWorkers();
    }

    @Override
    public int getBuilderClientNumTempWorkers() {
        return client.getClientNumTempWorkers();
    }

    @Override
    public String getBuilderClientActiveAccountNum() {
        return client.getClientActiveAccountNum();
    }

    @Override
    public String getBuilderClientAccountBranch() {
        return client.getClientAccountBranch();
    }

    @Override
    public String getBuilderClientNotice() {
        return client.getClientNotice();
    }

    @Override
    public String getBuilderClientRegistrationDate() {
        return client.getClientRegistrationDate();
    }

    @Override
    public String getBuilderClientDelegate() {
        return client.getClientDelegate();
    }

    @Override
    public String getBuilderClientSocialStatus() {
        return client.getClientSocialStatus();
    }

    @Override
    public String getBuilderClientEducation() {
        return client.getClientEducation();
    }

    @Override
    public String getBuilderClientElectronicWallet() {
        return client.getClientElectronicWallet();
    }

    @Override
    public String getBuilderClientGeographicSector() {
        return client.getClientGeographicSector();
    }

    @Override
    public String getBuilderClientJobName() {
        return client.getClientJobName();
    }

    @Override
    public String[] getBuilderClientJobAddress() {
        return client.getClientJobAddress();
    }

    @Override
    public Boolean getBuilderClientIsFromCity() {
        return client.getClientIsFromCity();
    }

    @Override
    public String getBuilderClientWorkEmail() {
        return client.getClientWorkEmail();
    }

    @Override
    public String getBuilderClientWorkPhone() {
        return client.getClientWorkPhone();
    }

    @Override
    public String getBuilderClientLicenseNum() {
        return client.getClientLicenseNum();
    }

    @Override
    public String getBuilderClientLicenseRegistrationDate() {
        return client.getClientLicenseRegistrationDate();
    }

    @Override
    public String getBuilderClientCommercialRecord() {
        return client.getClientCommercialRecord();
    }

    @Override
    public String getBuilderClientIndustrialRecord() {
        return client.getClientIndustrialRecord();
    }

    @Override
    public String getBuilderClientTaxCard() {
        return client.getClientTaxCard();
    }

    @Override
    public String getBuilderClientGovernment() {
        return client.getClientGovernment();
    }

    @Override
    public String getBuilderClientDistrict() {
        return client.getClientDistrict();
    }

    @Override
    public String getBuilderClientVillage() {
        return client.getClientVillage();
    }

    @Override
    public String getBuilderClientGovernmentCodeWork() {
        return client.getClientGovernmentCodeWork();
    }

    @Override
    public String getBuilderClientWorkSector() {
        return client.getClientWorkSector();
    }

    @Override
    public String getBuilderClientJobType() {
        return client.getClientJobType();
    }

    @Override
    public String getBuilderClientSpeciality() {
        return client.getClientSpeciality();
    }

    @Override
    public String getBuilderClientFaxNum() {
        return client.getClientFaxNum();
    }

    @Override
    public String getBuilderClientAdmissionDate() {
        return client.getClientAdmissionDate();
    }

    @Override
    public String getBuilderClientLicensingAddress() {
        return client.getClientLicensingAddress();
    }

    /////////////////////////////////////////////Setters or Builders//////////////////////////////////////////////////////
    @Override
    public void BuildID(int id) {
        this.client.setID(id);
    }

    @Override
    public void BuildBranchID(String id) {
        this.client.setBranchID(id);
    }

    @Override
    public void BuildClientName(String name) {
        this.client.setClientName(name);
    }

    @Override
    public void BuildClientGender(String g) {
        this.client.setClientGender(g);
    }

    @Override
    public void BuildClientType(String ut) {
        this.client.setClientType(ut);
    }

    @Override
    public void BuildClientOtherLangName(String n) {
        this.client.setClientOtherLangName(n);
    }

    @Override
    public void BuildClientNationalID(String id) {
        this.client.setClientNationalID(id);
    }

    @Override
    public void BuildClientBirthdate(String date) {
        this.client.setClientBirthdate(date);
    }

    @Override
    public void BuildClientNationalIdDate(String date) {
        this.client.setClientNationalIdDate(date);
    }

    @Override
    public void BuildClientAddress(String[] a) {
        this.client.setClientAddress(a);
    }

    @Override
    public void BuildClientPostal(String p) {
        this.client.setClientPostal(p);
    }

    @Override
    public void BuildClientCell(String c) {
        this.client.setClientCell(c);
    }

    @Override
    public void BuildClientHomePhone(String home) {
        this.client.setClientHomePhone(home);
    }

    @Override
    public void BuildClientEmail(String email) {
        this.client.setClientEmail(email);
    }

    @Override
    public void BuildClientWebsite(String w) {
        this.client.setClientWebsite(w);
    }

    @Override
    public void BuildClientEmail1(String email) {
        this.client.setClientEmail1(email);
    }

    @Override
    public void BuildClientWebsite1(String w) {
        this.client.setClientWebsite1(w);
    }

    @Override
    public void BuildClientEmail2(String email) {
        this.client.setClientEmail2(email);
    }

    @Override
    public void BuildClientWebsite2(String w) {
        this.client.setClientWebsite2(w);
    }

    @Override
    public void BuildClientEmail3(String email) {
        this.client.setClientEmail3(email);
    }

    @Override
    public void BuildClientWebsite3(String w) {
        this.client.setClientWebsite3(w);
    }

    @Override
    public void BuildClientGovernmentCode(String dc) {
        this.client.setClientGovernmentCode(dc);
    }

    @Override
    public void BuildClientCellCode(String cc) {
        this.client.setClientCellCode(cc);
    }

    @Override
    public void BuildClientNumFullTimeWorkers(int n) {
        this.client.setClientNumFullTimeWorkers(n);
    }

    @Override
    public void BuildClientNumTempWorkers(int n) {
        this.client.setClientNumTempWorkers(n);
    }

    @Override
    public void BuildClientActiveAccountNum(String n) {
        this.client.setClientActiveAccountNum(n);
    }

    @Override
    public void BuildClientAccountBranch(String account_branch) {
        this.client.setClientAccountBranch(account_branch);
    }

    @Override
    public void BuildClientNotice(String n) {
        this.client.setClientNotice(n);
    }

    @Override
    public void BuildClientRegistrationDate(String date) {
        this.client.setClientRegistrationDate(date);
    }

    @Override
    public void BuildClientDelegate(String deleg) {
        this.client.setClientDelegate(deleg);
    }

    @Override
    public void BuildClientSocialStatus(String social_stat) {
        this.client.setClientSocialStatus(social_stat);
    }

    @Override
    public void BuildClientEducation(String e) {
        this.client.setClientEducation(e);
    }

    @Override
    public void BuildClientElectronicWallet(String ew) {
        this.client.setClientElectronicWallet(ew);
    }

    @Override
    public void BuildClientGeographicSector(String g) {
        this.client.setClientGeographicSector(g);
    }

    @Override
    public void BuildClientJobName(String job) {
        this.client.setClientJobName(job);
    }

    @Override
    public void BuildClientJobAddress(String[] ja) {
        this.client.setClientJobAddress(ja);
    }

    @Override
    public void BuildClientIsFromCity(Boolean f) {
        this.client.setClientIsFromCity(f);
    }

    @Override
    public void BuildClientWorkEmail(String we) {
        this.client.setClientWorkEmail(we);
    }

    @Override
    public void BuildClientWorkPhone(String wp) {
        this.client.setClientWorkPhone(wp);
    }

    @Override
    public void BuildClientLicenseNum(String ln) {
        this.client.setClientLicenseNum(ln);
    }

    @Override
    public void BuildClientLicenseRegistrationDate(String date) {
        this.client.setClientLicenseRegistrationDate(date);
    }

    @Override
    public void BuildClientCommercialRecord(String cr) {
        this.client.setClientCommercialRecord(cr);
    }

    @Override
    public void BuildClientIndustrialRecord(String ir) {
        this.client.setClientIndustrialRecord(ir);
    }

    @Override
    public void BuildClientTaxCard(String tc) {
        this.client.setClientTaxCard(tc);
    }

    @Override
    public void BuildClientGovernment(String Government) {
        this.client.setClientGovernment(Government);
    }

    @Override
    public void BuildClientDistrict(String c) {
        this.client.setClientDistrict(c);
    }

    @Override
    public void BuildClientVillage(String v) {
        this.client.setClientVillage(v);
    }

    @Override
    public void BuildClientGovernmentCodeWork(String dcw) {
        this.client.setClientGovernmentCodeWork(dcw);
    }

    @Override
    public void BuildClientWorkSector(String ws) {
        this.client.setClientWorkSector(ws);
    }

    @Override
    public void BuildClientJobType(String jt) {
        this.client.setClientJobType(jt);
    }

    @Override
    public void BuildClientSpeciality(String s) {
        this.client.setClientSpeciality(s);
    }

    @Override
    public void BuildClientFaxNum(String s) {
        this.client.setClientFaxNum(s);
    }

    @Override
    public void BuildClientAdmissionDate(String s) {
        this.client.setClientAdmissionDate(s);
    }

    @Override
    public void BuildClientLicensingAddress(String s) {
        client.setClientLicensingAddress(s);
    }

    /////////////////////////Print Functions//////////////////////////
    @Override
    public String toString(){
        return "Branch Code: "+client.getBranchID()+"\n"+"Client Name: "+client.getClientName()+"\n"+"User Account Type: "+client.getClientType()+"\n"+"Gender: "+client.getClientGender()+"\n"+
                "National ID: "+client.getClientNationalID()+"\n"+"National ID Registration Date: "+client.getClientNationalIdDate()+"\n"+"Birthdate: "+client.getClientBirthdate()
                +"Government: "+client.getClientGovernment()+"\n"+"District: "+client.getClientDistrict()+"\n"+"village: "+client.getClientVillage()+"\n"+
                "Work Sector: "+client.getClientWorkSector()+'\n'+"Work Type: "+client.getClientJobType()+"\n"+"Geographic Sector: "+client.getClientGeographicSector()+"\n"+
                "Delegate: "+client.getClientDelegate()+"\n"+"Social Status: "+client.getClientSocialStatus()+"\n"+"Education: "+client.getClientEducation()+"\n";
    }


}
