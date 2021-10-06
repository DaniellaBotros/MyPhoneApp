package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class UserJobInfo extends Fragment {
    Spinner s1,s2,s3,s4,s5,s6,s7,s8;
    String[] districts= {"اختر المحافظة","القاهرة","كفر الشيخ"};
    String[] centers={"اختر المركز","النزها","الجيزة"};
    String[] village={"اختر القرية","شبرا","الساحل"};
    String[] is_from_city={" ","حضري","ريفي"};
    String[] dist_code={" ","01","02","03"};
    String[] work_sector= {" ","لا ينطبق","تجاري","صناعي"};
    String[] work_type= {" ","لا ينطبق","حكومي","خاص"};
    String[] speciality= {" ","طب","هندسة","تجارة"};
    Button add_info_btn;
    String value="";

    EditText etext1,etext2,etext7,etext9,etext13,etext14,etext15,etext16,etext17,etext18;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user_job_info, container, false);

        ///////////////////Bundle/////////////////////////////////////////////////////

        value=getArguments().getString("df2");


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

        //Custom Spinner Districts
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,districts);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner Centers
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,centers);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter1);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner Village
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,village);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(adapter2);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner is_city_folk
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,is_from_city);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(adapter3);
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";}

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner District Code
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,dist_code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s5.setAdapter(adapter4);
        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner Work sector
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,work_sector);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s6.setAdapter(adapter5);
        s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //custom Spinner Work Type
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,work_type);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s7.setAdapter(adapter6);
        s7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner Speciality
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,speciality);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s8.setAdapter(adapter7);
        s8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    value=value+value1+" ";
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
                //System.out.println(value);
                UserAdditionalInfo nextFrag= new UserAdditionalInfo();
                Bundle args = new Bundle();
                args.putString("df3", value);
                nextFrag.setArguments(args);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(UserJobInfo.this)
                        .replace(((ViewGroup)getView().getParent()).getId(), nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });





        return view;
    }
}