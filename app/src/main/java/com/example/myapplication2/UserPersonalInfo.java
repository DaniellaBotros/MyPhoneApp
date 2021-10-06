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


public class UserPersonalInfo extends Fragment {
    Spinner spinn1,spinn2;
    String[] dist_code={" ","01","02","03"};
    String[] phone_code={" ","010","012","011"};
    Button to_job;
    String value="";
    BasicClientBuilder client;

    EditText etextv1,etextv2,etextv3,etextv4,etextv5,etextv6,etextv8,etextv10,etextv11,etextv12,etextv13;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user_personal_info, container, false);

        spinn1=view.findViewById(R.id.spinn1);
        spinn2=view.findViewById(R.id.spinn2);

        /////////////Bundle//////////////////////////
        value =getArguments().getString("df1");
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
                    value=value+dist_code[i]+" ";
                client.BuildClientDistrictCode(dist_code[i]);
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
                    value=value+phone_code[i]+" ";
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
                value=value+etextv1.getText().toString()+" ";
                client.BuildClientOtherLangName(etextv1.getText().toString());

                value=value+etextv2.getText().toString()+" ";
                client.BuildClientNationalID(etextv2.getText().toString());

                value=value+etextv3.getText().toString()+" ";
                client.BuildClientNationalIdDate(etextv3.getText().toString());

                value=value+etextv4.getText().toString()+" ";
                client.BuildClientBirthdate(etextv4.getText().toString());

                value=value+etextv5.getText().toString()+" ";
                String[] address = {etextv5.getText().toString()};
                client.BuildClientAddress(address);

                value=value+etextv6.getText().toString()+" ";
                client.BuildClientPostal(etextv6.getText().toString());

                value=value+etextv8.getText().toString()+" ";
                client.BuildClientHomePhone(etextv8.getText().toString());

                value=value+etextv10.getText().toString()+" ";
                client.BuildClientCell(etextv10.getText().toString());

                value=value+etextv11.getText().toString()+" ";
                client.BuildClientFaxNum(etextv11.getText().toString());

                value=value+etextv12.getText().toString()+" ";
                String[] email={etextv12.getText().toString()};
                client.BuildClientEmail(email);

                value=value+etextv13.getText().toString()+" ";
                String[] web={etextv13.getText().toString()};
                client.BuildClientWebsite(web);

                //System.out.println(value);

                UserJobInfo nextFrag= new UserJobInfo();
                Bundle args = new Bundle();
                args.putString("df2", value);
                Bundle b = new Bundle();
                b.putSerializable("obj2", client);
                nextFrag.setArguments(b);

                nextFrag.setArguments(args);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(UserPersonalInfo.this)
                        .replace(((ViewGroup)getView().getParent()).getId(), nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });



        return view;
    }
}