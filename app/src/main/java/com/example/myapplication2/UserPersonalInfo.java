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
import android.widget.Toast;


public class UserPersonalInfo extends Fragment {
    private Spinner spinn1,spinn2;
    private String[] dist_code={" أختر كود المحافظة","01","02","03"};
    private String[] phone_code={" أختر كود المحمول","010","012","011"};
    private Button to_job;
    private BasicClientBuilder client;

    private String value="";
    private String value1="";
    private String value2="";

    private EditText etextv1,etextv2,etextv3,etextv4,etextv5,etextv6,etextv8,etextv10,etextv11,etextv12,etextv13;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user_personal_info, container, false);

        spinn1=view.findViewById(R.id.spinn1);
        spinn2=view.findViewById(R.id.spinn2);

        /////////////Bundle//////////////////////////

        Bundle bundle = getArguments();
        client=(BasicClientBuilder) bundle.getSerializable("obj1");


        //////////////////////////////////////////////EditTexts/////////////////////////////////////
        etextv1=view.findViewById(R.id.etextv1);
        etextv2=view.findViewById(R.id.etextv2);
        etextv3=view.findViewById(R.id.etextv3);
        etextv4=view.findViewById(R.id.etextv4);
        etextv5=view.findViewById(R.id.etextv5);
        etextv6=view.findViewById(R.id.etextv6);
        etextv8=view.findViewById(R.id.etextv8);
        etextv10=view.findViewById(R.id.etextv10);
        etextv11=view.findViewById(R.id.etextv11);
        etextv12=view.findViewById(R.id.etextv12);
        etextv13=view.findViewById(R.id.etextv13);





        ///////////////////////////////////////////////Spinners/////////////////////////////////////
        //Custom Spinner for District Codes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,dist_code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn1.setAdapter(adapter);
        spinn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){

                client.BuildClientGovernmentCode(dist_code[i]);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        //Custom spinner for Phone codes

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,phone_code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn2.setAdapter(adapter1);
        spinn2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){

                    client.BuildClientCellCode(phone_code[i]);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //button for job or work info
        to_job=view.findViewById(R.id.btn_to_job);
        to_job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                client.BuildClientOtherLangName(etextv1.getText().toString());


                client.BuildClientNationalID(etextv2.getText().toString());
                value = etextv2.getText().toString();


                client.BuildClientNationalIdDate(etextv3.getText().toString());
                value1 = etextv3.getText().toString();

                client.BuildClientBirthdate(etextv4.getText().toString());
                value2 = etextv4.getText().toString();

                String[] address = {etextv5.getText().toString()};
                client.BuildClientAddress(address);


                client.BuildClientPostal(etextv6.getText().toString());


                client.BuildClientHomePhone(etextv8.getText().toString());


                client.BuildClientCell(etextv10.getText().toString());


                client.BuildClientFaxNum(etextv11.getText().toString());


                String email = etextv12.getText().toString();
                client.BuildClientEmail(email);


                String web = etextv13.getText().toString();
                client.BuildClientWebsite(web);

                if (value.equals("")||value1.equals("")||value2.equals("")) {
                    Toast.makeText(getContext(),"You must fill the الرقم القومي entry, the تاريخ اصدار البطاقة entry, and the تاريخ الميلاد!!", Toast.LENGTH_SHORT).show();

                }
                else {


                    UserJobInfo nextFrag = new UserJobInfo();

                    Bundle b = new Bundle();
                    b.putSerializable("obj2", client);
                    nextFrag.setArguments(b);

                    // nextFrag.setArguments(args);
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .remove(UserPersonalInfo.this)
                            .replace(((ViewGroup) getView().getParent()).getId(), nextFrag, "findThisFragment")
                            .addToBackStack(null)
                            .commit();

                }
            }
        });



        return view;
    }







}