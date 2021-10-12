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



import com.example.myapplication2.RepeatedRetroItemsSocialStatEducation.RetroItem;
import com.example.myapplication2.RepeatedRetroItemsSocialStatEducation.RetroItemContent;
import com.example.myapplication2.RepeatedRetroItemsSocialStatEducation.RetroItemInterface;
import com.example.myapplication2.RetrofitGeo.GeoContent;
import com.example.myapplication2.RetrofitGeo.GeoInterface;
import com.example.myapplication2.RetrofitGeo.GeoItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserAdditionalInfo extends Fragment {
    private Spinner spin_geo,spin_deleg,spin_social_stat,spin_edu;
    private String[] geo;
    private String[] delegates={"أختر المندوب*","داليا محمد","رفعة اسماعيل","نادين عمر","اندرو رأفت"};
    private String[] social_stat;
    private String[] education;
    private Button btn,btn_submit;
    private String value="";
    private String value1="";
    private String value2="";
    private String value3="";
    private String value4="";

    private Boolean is_submitted=false;

    private BasicClientBuilder client;

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

        GeoInterface retroClienta =retrofit.create(GeoInterface.class);
        Call<GeoItem> calla=retroClienta.getAllGeoAreas(auth);

        calla.enqueue(new Callback<GeoItem>() {

            @Override
            public void onResponse(Call<GeoItem>  call, Response<GeoItem> response) {
                if(response.isSuccessful()) {
                    GeoItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<GeoContent> l=changesList.getList();
                    geo=new String[l.size()+1];
                    geo[0]="أختر المكان*";
                    for(int i=0;i<l.size();i++){
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
                                client.BuildClientGeographicSector(value11);
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
            public void onFailure(Call <GeoItem> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });




        //Custom Spinner deleg

        spin_deleg = view.findViewById(R.id.spin2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,delegates);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_deleg.setAdapter(adapter1);
        spin_deleg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value11 = String.valueOf(adapterView.getItemAtPosition(i));
                    value1=value11;
                    client.BuildClientDelegate(value11);

                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

/////////////////////////////////////////////////////////Custom Spinner Social Status
        spin_social_stat = view.findViewById(R.id.spin3);

        ///////Retrofit//////////////////////////////////////////////////////////////////////
        RetroItemInterface retroClient=retrofit.create(RetroItemInterface.class);
        Call<RetroItem> call=retroClient.getAllMartialStatus(auth);

        call.enqueue(new Callback<RetroItem>() {
            @Override
            public void onResponse(Call<RetroItem> call, Response<RetroItem> response) {
                if(response.isSuccessful()) {
                    RetroItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<RetroItemContent> l=changesList.getList();
                    social_stat=new String[l.size()+1];
                    social_stat[0]="أختر الحالة الاجتماعية*";
                    for(int i=0;i<l.size();i++){
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
                                client.BuildClientSocialStatus(value11);

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
            public void onFailure(Call<RetroItem> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////Custom Spinner Education
        spin_edu = view.findViewById(R.id.spin4);
///////Retrofit//////////////////////////////////////////////////////////////////////

        RetroItemInterface retroClient1 =retrofit.create(RetroItemInterface.class);
        Call<RetroItem> call1=retroClient.getAllEducation(auth);
        call1.enqueue(new Callback<RetroItem>() {
            @Override
            public void onResponse(Call<RetroItem> call, Response<RetroItem> response) {
                if(response.isSuccessful()) {
                    RetroItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    List<RetroItemContent> l=changesList.getList();
                    education=new String[l.size()+1];
                    education[0]="أختر التعليم*";
                    for(int i=0;i<l.size();i++){
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
                                client.BuildClientEducation(value11);

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
            public void onFailure(Call<RetroItem> call, Throwable t) {
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
                Toast.makeText(getContext(),"Form Submitted!! :)", Toast.LENGTH_SHORT).show();
                is_submitted=true;
            }
            }
        });

        return view;
    }




}