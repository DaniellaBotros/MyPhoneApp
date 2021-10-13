package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication2.BusinessActionType.BusinessActionType;
import com.example.myapplication2.BusinessActionType.BusinessActionTypeContent;
import com.example.myapplication2.BusinessActionType.BusinessActionTypeInterface;
import com.example.myapplication2.BusinessDevision.BusinessDevision;
import com.example.myapplication2.BusinessDevision.BusinessDevisionContent;
import com.example.myapplication2.BusinessDevision.BusinessDevisionInterface;
import com.example.myapplication2.GenericRetrofit.DistrictContent;
import com.example.myapplication2.GenericRetrofit.GenericInterface;
import com.example.myapplication2.GenericRetrofit.GenericItem;
import com.example.myapplication2.GenericRetrofit.GovernmentContent;
import com.example.myapplication2.GenericRetrofit.VillageContent;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserJobInfo extends Fragment {
    private Spinner s1,s2,s3,s4,s5,s6,s7,s8;
    private GovernmentContent[] governments;
    private String Gov_test[];
    private String gcode="0";
    private DistrictContent[] districts ;
    private String[] Dist_test;
    private String dcode="0";
    private String[] village;
    private String[] is_from_city={" حضري/ريفي","حضري","ريفي"};
    private String[] government_code;
    Boolean work_sector_picked=false;
    private String[] work_sector_test;
    private BusinessDevisionContent[] work_sector;
    private String work_sector_code;
    private String[] work_type;
    private String[] speciality= {" ","طب","هندسة","تجارة"};
    private String value="";
    private String value1="";
    private String value2="";
    private String value3="";
    private String value4="";
    private Button add_info_btn;

    Boolean gov_picked=false;
    Boolean dist_picked=false;



    private EditText etext1,etext2,etext7,etext9,etext13,etext14,etext15,etext16,etext17,etext18;
    private BasicClientBuilder client;

    ///////////////////////////////Retrofit Constants//////////////////////////////////////////////////////////////////
    private String URL="http://192.168.255.19:1233/MohassilService.svc/";
    Retrofit.Builder builder=new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit=builder.build();
    private String username="x";
    private String password="x";
    private String base=username+":"+password;
    private String auth="Basic "+ Base64.encodeToString(base.getBytes(),Base64.NO_WRAP);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user_job_info, container, false);

        ///////////////////Bundle/////////////////////////////////////////////////////

       // value=getArguments().getString("df2");
        Bundle bundle = getArguments();
        client=(BasicClientBuilder) bundle.getSerializable("obj2");


///////////////////////////////////////EditTexts////////////////////////////////////////////////////////////////////////////////////////////
        etext1=view.findViewById(R.id.etext1);
        etext2=view.findViewById(R.id.etext2);
        etext7=view.findViewById(R.id.etext7);
        etext9=view.findViewById(R.id.etext9);
        etext13=view.findViewById(R.id.etext13);
        etext14=view.findViewById(R.id.etext14);
        etext15=view.findViewById(R.id.etext15);
        etext16=view.findViewById(R.id.etext16);
        etext17=view.findViewById(R.id.etext17);
        etext18=view.findViewById(R.id.etext18);



///////////////////////////////////////////////////Spinners//////////////////////////////////////////////////////////////////////
        s1=view.findViewById(R.id.s1);
        s2=view.findViewById(R.id.s2);
        s3=view.findViewById(R.id.s3);
        s4=view.findViewById(R.id.s4);
        s5=view.findViewById(R.id.s5);
        s6=view.findViewById(R.id.s6);
        s7=view.findViewById(R.id.s7);
        s8=view.findViewById(R.id.s8);

        //Custom Spinner Governments

        ///////Retrofit//////////////////////////////////////////////////////////////////////

                GovSpinnerAPI();

        ////////////////////////////////////////////////////////////////////////


        //Custom Spinner Districts

        ///////Retrofit//////////////////////////////////////////////////////////////////////

        Handler handler1 = new Handler();

        final Runnable r1 = new Runnable() {
            public void run() {


                handler1.postDelayed(this, 1000);
                DistSpinnerAPI();
            }
        };

        handler1.postDelayed(r1, 1000);


        //Custom Spinner Village
        ///////Retrofit//////////////////////////////////////////////////////////////////////
        Handler handler = new Handler();

        final Runnable r = new Runnable() {
            public void run() {


                handler.postDelayed(this, 1000);
                VillageSpinnerAPI();
            }
        };

        handler.postDelayed(r, 1000);


        /////////////////////////////////////////////////////////////////////////////////////
        //Custom Spinner is_city_folk
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,is_from_city);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(adapter3);
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i!=0){
                    String value22 = is_from_city[i];
                            //String.valueOf(adapterView.getItemAtPosition(i));
                    Boolean flag=false;
                    if(value22.equals("حضري")){
                        flag=true;
                    }

                    client.BuildClientIsFromCity(flag);
                    }

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner government Code

       GovSpinnerAPI();

        //Custom Spinner Work sector

        BusinessDevisionAPI();


        //custom Spinner Work Type
        Handler handler3 = new Handler();

        final Runnable r3 = new Runnable() {
            public void run() {
                handler3.postDelayed(this, 1000);
                BusinessActivityTypeAPI();

            }
        };

       handler1.postDelayed(r3, 1000);



        //Custom Spinner Speciality
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,speciality);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s8.setAdapter(adapter7);
        s8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){

                    client.BuildClientSpeciality(speciality[i]);

                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

////////////////////Button///////////////////////////////////////
        //button for additional info
        add_info_btn=view.findViewById(R.id.btnAddData);
        add_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                client.BuildClientJobName(etext1.getText().toString());
                String[] arr={etext2.getText().toString()};
                client.BuildClientJobAddress(arr);
                client.BuildClientWorkEmail(etext7.getText().toString());
                client.BuildClientWorkPhone(etext9.getText().toString());
                client.BuildClientLicenseNum(etext13.getText().toString());
                client.BuildClientLicensingAddress(etext14.getText().toString());
                client.BuildClientLicenseRegistrationDate(etext15.getText().toString());
                client.BuildClientCommercialRecord(etext16.getText().toString());
                client.BuildClientIndustrialRecord(etext17.getText().toString());
                client.BuildClientTaxCard(etext18.getText().toString());



                if(value.equals("")||value1.equals("")||value2.equals("")||value3.equals("")||value4.equals("")){

                    Toast.makeText(getContext(),"You must fill the entries marked with *!!", Toast.LENGTH_SHORT).show();

                }
                else{


                UserAdditionalInfo nextFrag= new UserAdditionalInfo();


                Bundle b = new Bundle();
                b.putSerializable("obj3", client);
                nextFrag.setArguments(b);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(UserJobInfo.this)
                        .replace(((ViewGroup)getView().getParent()).getId(), nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
            }
        });





        return view;
    }
    public void GovSpinnerAPI()
    {
        GenericInterface retroClient=retrofit.create(GenericInterface.class);
        Call<GenericItem<GovernmentContent>> call=retroClient.getAllGovernments(auth);

        call.enqueue(new Callback<GenericItem<GovernmentContent>>() {


            @Override
            public void onResponse(Call<GenericItem<GovernmentContent>>  call, Response<GenericItem<GovernmentContent>> response) {
                if(response.isSuccessful()) {
                    GenericItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<GovernmentContent> l=changesList.getList();
                    governments=new GovernmentContent[l.size()];
                    Gov_test=new String[l.size()+1];
                    Gov_test[0]="اختر المحافظة*";
                    for(int i=0;i<l.size();i++){
                        governments[i]=l.get(i);
                        Gov_test[i+1]=l.get(i).getGovernmentName();
                    }
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_spinner_item,Gov_test);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s1.setAdapter(adapter);
                    s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i!=0){
                                value=Gov_test[i];
                                gcode=governments[i-1].getGovernmentCode();
                                client.BuildClientGovernment(Gov_test[i]);
                                gov_picked=true;
                            }
                        }

                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                } else {
                    System.out.println(response.errorBody());

                }
            }

            @Override
            public void onFailure(Call<GenericItem<GovernmentContent>> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });
    }
    public void DistSpinnerAPI(){
        if(gov_picked) {
            GenericInterface retroClient1 = retrofit.create(GenericInterface.class);
            Call<GenericItem<DistrictContent>> call1 = retroClient1.getAllDistrictsByGovId(auth, Integer.parseInt(gcode));

            call1.enqueue(new Callback<GenericItem<DistrictContent>>() {

                @Override
                public void onResponse(Call<GenericItem<DistrictContent>> call, Response<GenericItem<DistrictContent>> response) {
                    if (response.isSuccessful()) {
                        GenericItem changesList = response.body();

                        //System.out.println("It worked !!:)");
                        //System.out.println(changesList);
                        List<DistrictContent> l = changesList.getList();
                        districts = new DistrictContent[l.size()];
                        Dist_test = new String[l.size() + 1];
                        Dist_test[0] = "اختر المركز*";
                        for (int i = 0; i < l.size(); i++) {
                            districts[i] = l.get(i);
                            Dist_test[i + 1] = l.get(i).getDistrictName();
                        }


                        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
                                android.R.layout.simple_spinner_item, Dist_test);
                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s2.setAdapter(adapter1);
                        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                if (i != 0) {
                                    dcode = districts[i - 1].getDistrictCode();
                                    value1=Dist_test[i];
                                    client.BuildClientDistrict(Dist_test[i]);
                                    dist_picked=true;
                                    gov_picked=false;
                                }
                            }

                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });


                    } else {
                        System.out.println(response.errorBody());

                    }
                }

                @Override
                public void onFailure(Call<GenericItem<DistrictContent>> call, Throwable t) {
                    System.out.println("I failed!!:(");
                    t.printStackTrace();
                }
            });

        }
    }
    public void VillageSpinnerAPI(){
        if(dist_picked) {
            GenericInterface retroClient2 = retrofit.create(GenericInterface.class);
            Call<GenericItem<VillageContent>> call2 = retroClient2.getAllVillagesByDistId(auth, Integer.parseInt(dcode));

            call2.enqueue(new Callback<GenericItem<VillageContent>>() {

                @Override
                public void onResponse(Call<GenericItem<VillageContent>> call, Response<GenericItem<VillageContent>> response) {
                    if (response.isSuccessful()) {
                        GenericItem changesList = response.body();

                        //System.out.println("It worked !!:)");
                        //System.out.println(changesList);
                        List<VillageContent> l = changesList.getList();
                        village = new String[l.size() + 1];
                        village[0] = "اختر القرية*";
                        for (int i = 0; i < l.size(); i++) {

                            village[i + 1] = l.get(i).getVillagelName();

                        }
                        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getContext(),
                                android.R.layout.simple_spinner_item, village);
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s3.setAdapter(adapter2);
                        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                                if (i != 0) {
                                    value2 = village[i];
                                    client.BuildClientVillage(village[i]);
                                    dist_picked=false;

                                }
                            }

                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });


                    } else {
                        System.out.println(response.errorBody());

                    }
                }

                @Override
                public void onFailure(Call<GenericItem<VillageContent>> call, Throwable t) {
                    System.out.println("I failed!!:(");
                    t.printStackTrace();
                }
            });


        }

    }

    public void BusinessDevisionAPI(){

        BusinessDevisionInterface retroClient=retrofit.create(BusinessDevisionInterface.class);
        Call<BusinessDevision> call=retroClient.getAllBusinessDivision(auth);

        call.enqueue(new Callback<BusinessDevision>() {

            @Override
            public void onResponse(Call<BusinessDevision>  call, Response<BusinessDevision> response) {
                if(response.isSuccessful()) {
                    BusinessDevision changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<BusinessDevisionContent> l=changesList.getList();
                    work_sector=new BusinessDevisionContent[l.size()];
                    work_sector_test=new String[l.size()+1];
                    work_sector_test[0]="أختر قطاع العمل*";
                    for(int i=0;i<l.size();i++){
                        work_sector[i]=l.get(i);
                        work_sector_test[i+1]=l.get(i).getBusinessDivisionName();
                    }
                    ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_spinner_item,work_sector_test);
                    adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s6.setAdapter(adapter5);
                    s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i!=0){
                                value3=work_sector_test[i];
                                work_sector_code=work_sector[i-1].getBusinessDivisionCode();
                                work_sector_picked=true;
                                client.BuildClientWorkSector(work_sector_test[i]);


                            }
                        }

                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                } else {
                    System.out.println(response.errorBody());

                }
            }

            @Override
            public void onFailure(Call <BusinessDevision> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });




    }

    public void BusinessActivityTypeAPI(){
        if(work_sector_picked) {
            BusinessActionTypeInterface retroClient=retrofit.create(BusinessActionTypeInterface.class);
            Call<BusinessActionType> call=retroClient.getBusinessActivityTypeByDivId(auth,Integer.parseInt(work_sector_code));

            call.enqueue(new Callback<BusinessActionType>() {

                @Override
                public void onResponse(Call<BusinessActionType>  call, Response<BusinessActionType> response) {
                    if(response.isSuccessful()) {
                        BusinessActionType changesList = response.body();

                        //System.out.println("It worked !!:)");
                        System.out.println(changesList);
                        List<BusinessActionTypeContent> l=changesList.getList();
                        work_type=new String[l.size()+1];
                        work_type[0]="أختر نوع العمل*";
                        for(int i=0;i<l.size();i++){
                            work_type[i+1]=l.get(i).getBusinessActivityTypeName();
                        }
                        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getContext(),
                                android.R.layout.simple_spinner_item, work_type);
                        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s7.setAdapter(adapter6);
                        s7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                if (i != 0) {
                                    value4 = work_type[i];
                                    client.BuildClientJobType(work_type[i]);
                                    work_sector_picked=false;

                                }
                            }

                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });



                    } else {
                        System.out.println(response.errorBody());

                    }
                }

                @Override
                public void onFailure(Call <BusinessActionType> call, Throwable t) {
                    System.out.println("I failed!!:(");
                    t.printStackTrace();
                }
            });

        }
    }




}