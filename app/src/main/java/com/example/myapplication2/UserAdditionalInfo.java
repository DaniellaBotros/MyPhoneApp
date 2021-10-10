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
import android.widget.TextView;
import android.widget.Toast;

public class UserAdditionalInfo extends Fragment {
    Spinner spin_geo,spin_deleg,spin_social_stat,spin_edu;
    String[] geo={"أختر المكان","لا ينطبق","فرع امبابا","تقسيم أول","أخر"};
    String[] delegates={"أختر المندوب","داليا محمد","رفعة اسماعيل","نادين عمر","اندرو رأفت"};
    String[] social_stat={"أختر الحالة الاجتماعية","أعزب","متزوج","متزوج و يعول","مطلق","ارمل"};
    String[] education={"أختر التعليم","تعليم عالي","تعليم فوق المتوسط","تعليم متوسط","تعليم أساسي","أمي"};
    Button btn,btn_submit;

    BasicClientBuilder client;

    TextView etxt10;

    EditText etxt3,etxt4,etxt5,etxt6,etxt7;
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,geo);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_geo.setAdapter(adapter);
        spin_geo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    client.BuildClientGeographicSector(value1);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner deleg

        spin_deleg = view.findViewById(R.id.spin2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,delegates);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_deleg.setAdapter(adapter1);
        spin_deleg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    client.BuildClientDelegate(value1);

                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//Custom Spinner Social Status
        spin_social_stat = view.findViewById(R.id.spin3);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_social_stat.setAdapter(new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,social_stat));
        spin_social_stat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    client.BuildClientSocialStatus(value1);

                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //Custom Spinner Education
        spin_edu = view.findViewById(R.id.spin4);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,education);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_edu.setAdapter(adapter3);
        spin_edu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                    String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                    client.BuildClientEducation(value1);

                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //button for Home
        btn=view.findViewById(R.id.btn_home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                IntroFrag nextFrag= new IntroFrag();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(UserAdditionalInfo.this)
                        .replace(((ViewGroup)getView().getParent()).getId(), nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        //button for Submit


        btn_submit=view.findViewById(R.id.submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Toast.makeText(getContext(),"Form Submitted!! :)", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
    public void fillEdits(){
        client.BuildClientNumFullTimeWorkers(Integer.parseInt(etxt4.getText().toString()));
        client.BuildClientNumTempWorkers(Integer.parseInt(etxt5.getText().toString()));
        client.BuildClientActiveAccountNum( etxt6.getText().toString());
        client.BuildClientAccountBranch(etxt7.getText().toString());
        client.BuildClientNotice( etxt10.getText().toString());
        client.BuildClientAdmissionDate(etxt3.getText().toString());


    }
}