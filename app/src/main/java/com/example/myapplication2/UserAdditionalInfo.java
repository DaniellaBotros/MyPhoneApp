package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.example.myapplication2.GenericRetrofit.DummyClient;
import com.example.myapplication2.GenericRetrofit.GenericInterface;
import com.example.myapplication2.GenericRetrofit.GenericItem;
import com.example.myapplication2.GenericRetrofit.GenericItemContent;
import com.example.myapplication2.GenericRetrofit.GeoContent;
import com.example.myapplication2.GenericRetrofit.OfficerContent;



import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserAdditionalInfo extends Fragment {
    private Spinner spin_geo,spin_deleg,spin_social_stat,spin_edu;
    private String[] geo;
    private String[] delegates;
    private String[] social_stat;
    private String[] education;
    private Button btn,btn_submit;
    private String value="";
    private String value1="";
    private String value2="";
    private String value3="";
    private String value4="";
    private GenericItemContent[] ss_code;
    private GenericItemContent[] edu_code;
    private GeoContent[] geo_code;
    private OfficerContent[] off_code;



    private Boolean is_submitted=false;

    private BasicClientBuilder client;

    private DummyClient tosend;

    private TextView etxt10;

    private EditText etxt3,etxt4,etxt5,etxt6,etxt7;







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
        View view= inflater.inflate(R.layout.fragment_user_aditional_info, container, false);

        ////////////////////////////////Bundle////////////////////////////////////////////////

        Bundle bundle = getArguments();
        client=(BasicClientBuilder) bundle.getSerializable("obj3");
        ///////////////////////////////EditTexts//////////////////////////////////////////////
        etxt3=view.findViewById(R.id.etxt3);
        etxt4=view.findViewById(R.id.etxt4);
        etxt5=view.findViewById(R.id.etxt5);
        etxt6=view.findViewById(R.id.etxt6);
        etxt7=view.findViewById(R.id.etxt7);


///////////////////////////////////////////TextView/////////////////////////////////////////////////

        etxt10=view.findViewById(R.id.etxt10);

////////////////////////////////////////////Spinners//////////////////////////////////////////////
        //Custom Spinner Geo
        spin_geo = view.findViewById(R.id.spin1);

        ///////Retrofit//////////////////////////////////////////////////////////////////////

        GenericInterface retroClienta =retrofit.create(GenericInterface.class);
        Call<GenericItem<GeoContent>> calla=retroClienta.getGeoAreasByBranchId(auth,Integer.parseInt(client.getBuilderBranchID()));

        calla.enqueue(new Callback<GenericItem<GeoContent>>() {

            @Override
            public void onResponse(Call<GenericItem<GeoContent>>  call, Response<GenericItem<GeoContent>> response) {
                if(response.isSuccessful()) {
                    GenericItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<GeoContent> l=changesList.getList();
                    geo=new String[l.size()+1];
                    geo[0]="أختر المكان*";
                    geo_code=new GeoContent[l.size()];
                    for(int i=0;i<l.size();i++){
                        geo_code[i]=l.get(i);
                        geo[i+1]=l.get(i).getGeoAreaName();
                    }

                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_spinner_item,geo);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin_geo.setAdapter(adapter);
                    spin_geo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i!=0){
                                String value11 = String.valueOf(adapterView.getItemAtPosition(i));
                                value=value11;
                                client.BuildClientGeographicSector(geo_code[i-1].getGeoAreaCode());
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
            public void onFailure(Call<GenericItem<GeoContent>> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });




        //Custom Spinner deleg
        spin_deleg = view.findViewById(R.id.spin2);
        officerSpinnerAPI();


/////////////////////////////////////////////////////////Custom Spinner Social Status
        spin_social_stat = view.findViewById(R.id.spin3);

        ///////Retrofit//////////////////////////////////////////////////////////////////////
        GenericInterface retroClient=retrofit.create(GenericInterface.class);
        Call<GenericItem<GenericItemContent>> call=retroClient.getAllMartialStatus(auth);

        call.enqueue(new Callback<GenericItem<GenericItemContent>>() {
            @Override
            public void onResponse(Call<GenericItem<GenericItemContent>> call, Response<GenericItem<GenericItemContent>> response) {
                if(response.isSuccessful()) {
                    GenericItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<GenericItemContent> l=changesList.getList();
                    social_stat=new String[l.size()+1];
                    social_stat[0]="أختر الحالة الاجتماعية*";
                    ss_code=new GenericItemContent[l.size()];
                    for(int i=0;i<l.size();i++){
                        ss_code[i]=l.get(i);
                        social_stat[i+1]=l.get(i).getDescription();

                    }
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_spinner_item,social_stat);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin_social_stat.setAdapter(adapter2);
                    spin_social_stat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i!=0){
                                String value11 = String.valueOf(adapterView.getItemAtPosition(i));
                                value2=value11;
                                client.BuildClientSocialStatus(ss_code[i-1].getCode());

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
            public void onFailure(Call<GenericItem<GenericItemContent>> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////Custom Spinner Education
        spin_edu = view.findViewById(R.id.spin4);
///////Retrofit//////////////////////////////////////////////////////////////////////

        GenericInterface retroClient1 =retrofit.create(GenericInterface.class);
        Call<GenericItem<GenericItemContent>> call1=retroClient.getAllEducation(auth);
        call1.enqueue(new Callback<GenericItem<GenericItemContent>>() {
            @Override
            public void onResponse(Call<GenericItem<GenericItemContent>> call, Response<GenericItem<GenericItemContent>> response) {
                if(response.isSuccessful()) {
                    GenericItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<GenericItemContent> l=changesList.getList();
                    education=new String[l.size()+1];
                    edu_code=new GenericItemContent[l.size()];
                    education[0]="أختر التعليم*";
                    for(int i=0;i<l.size();i++){
                        edu_code[i]=l.get(i);
                        education[i+1]=l.get(i).getDescription();
                    }
                    ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getContext(),
                            android.R.layout.simple_spinner_item,education);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin_edu.setAdapter(adapter3);
                    spin_edu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i!=0){
                                String value11 = String.valueOf(adapterView.getItemAtPosition(i));
                                value3=value11;
                                client.BuildClientEducation(edu_code[i-1].getCode());

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
            public void onFailure(Call<GenericItem<GenericItemContent>> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });




        ////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////Button//////////////////////////////////////////////////

        //button for Home
        btn=view.findViewById(R.id.btn_home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!(is_submitted)){
                    Toast.makeText(getContext(),"Submit First!!", Toast.LENGTH_SHORT).show();
                }

                else{


                IntroFrag nextFrag= new IntroFrag();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(UserAdditionalInfo.this)
                        .replace(((ViewGroup)getView().getParent()).getId(), nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
            }
        });

        //button for Submit


        btn_submit=view.findViewById(R.id.submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(etxt4.getText().toString().equals("")){
                    client.BuildClientNumFullTimeWorkers(0);
                }
                else {
                    client.BuildClientNumFullTimeWorkers(Integer.parseInt(etxt4.getText().toString()));
                }
                if(etxt5.getText().toString().equals("")){
                    client.BuildClientNumTempWorkers(0);
                }
                else {
                    client.BuildClientNumFullTimeWorkers(Integer.parseInt(etxt5.getText().toString()));
                }
                client.BuildClientActiveAccountNum( etxt6.getText().toString());
                client.BuildClientAccountBranch(etxt7.getText().toString());
                client.BuildClientNotice( etxt10.getText().toString());
                client.BuildClientAdmissionDate(etxt3.getText().toString());
                value4=etxt3.getText().toString();


                if(value.equals("")||value1.equals("")||value2.equals("")||value3.equals("")||value4.equals("")){
                    Toast.makeText(getContext(),"You must fill the entries marked with *!!", Toast.LENGTH_SHORT).show();
                }
                else{
                System.out.println(client.toString());
                tosend=new DummyClient(client);
                Toast.makeText(getContext(),"Form Submitted!! :)", Toast.LENGTH_SHORT).show();
                is_submitted=true;
            }
            }
        });

        return view;
    }
public void officerSpinnerAPI(){

    GenericInterface retroClient=retrofit.create(GenericInterface.class);
    Call<GenericItem<OfficerContent>> call=retroClient.getAllOfficers(auth);

    call.enqueue(new Callback<GenericItem<OfficerContent>>() {

        @Override
        public void onResponse(Call<GenericItem<OfficerContent>>  call, Response<GenericItem<OfficerContent>> response) {
            if(response.isSuccessful()) {
                GenericItem changesList = response.body();

                //System.out.println("It worked !!:)");
               // System.out.println(changesList);
                List<OfficerContent> l=changesList.getList();
                delegates=new String[l.size()+1];
                delegates[0]="أختر المندوب*";
                off_code=new OfficerContent[l.size()];
                for(int i=0;i<l.size();i++){
                    off_code[i]=l.get(i);
                    delegates[i+1]=l.get(i).getOfficerName();

                }

                ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
                        android.R.layout.simple_spinner_item,delegates);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin_deleg.setAdapter(adapter1);
                spin_deleg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if(i!=0){
                            String value11 = String.valueOf(adapterView.getItemAtPosition(i));
                            value1=value11;
                            client.BuildClientDelegate(off_code[i-1].getOfficerKey());

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
        public void onFailure(Call <GenericItem<OfficerContent>> call, Throwable t) {
            System.out.println("I failed!!:(");
            t.printStackTrace();
        }
    });
}



}