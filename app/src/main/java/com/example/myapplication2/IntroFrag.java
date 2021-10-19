package com.example.myapplication2;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;
import java.util.UUID;


public class IntroFrag extends Fragment {

    private BasicClientBuilder client;
    private View view;
    private Spinner spin_gender,spin_type;
    private String value="";
    private String value1="";
    private String value2="";
    private Button next;
    private String[] type_of_user= {"أختر نوع الحساب*","فردي","مجموعة","عضو في مجموعة"};
    private String[] gender_of_user= {"أختر النوع*","ذكر","أنثى"};
    private Integer[] images = { 0, R.drawable.single, R.drawable.group, R.drawable.member_of_group_1};
    private EditText user_name;
    private GPSLocation gps;
    private Double longitude;
    private Double latitude;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_intro, container, false);
        gps=new GPSLocation();
        client=new BasicClientBuilder();
       /* gps=(GPSLocation)getArguments().getSerializable("location");
        latitude=gps.getLatitude(latitude);
        longitude=gps.getLongitude(logitude);
        System.out.println(latitude+"--"+longitude);*/

        //////////////////////////EditText//////////////////////////
        user_name=view.findViewById(R.id.name);

        /////////////////////Spinners///////////////////////////////
        spin_gender=view.findViewById(R.id.spinnerGender);
        spin_type=view.findViewById(R.id.spinnerType);

        spin_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    value=gender_of_user[i]+" ";
                    String g;
                    if(gender_of_user[i].equals("أنثى")){
                        g="1";
                    }
                    else{
                        g="2";
                    }

                    client.BuildClientGender(g);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter aa_gender = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_item,gender_of_user);
        aa_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_gender.setAdapter(aa_gender);

        spin_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    value1=type_of_user[i]+" ";
                    String ut;
                    if(type_of_user[i].equals("فردي")){
                        ut= "1";
                    }
                    else if(type_of_user[i].equals("مجموعة")){
                        ut="2";
                    }
                    else{
                        ut="3";
                    }
                    client.BuildClientType(ut);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        CustomAdapterUserType customAdapter=new CustomAdapterUserType(getContext(),images,type_of_user);
        spin_type.setAdapter(customAdapter);



////////////////////////////////Button/////////////////////////////////////////////
        next=view.findViewById(R.id.btnPersonalInfo);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value2=user_name.getText().toString()+" ";
                client.BuildClientName(user_name.getText().toString());

                UserPersonalInfo nextFrag= new UserPersonalInfo();
                if(value.equals("")||value1.equals("")||value2.equals("")) {
                    Toast.makeText(getContext(),"All entries in this page must be filled!!", Toast.LENGTH_SHORT).show();
                }
                else{
                Bundle bundle = new Bundle();
                bundle.putSerializable("obj1", client);
                nextFrag.setArguments(bundle);


                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(IntroFrag.this)
                        .replace(((ViewGroup)getView().getParent()).getId(), nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
            }

        });
        return view;
    }


}