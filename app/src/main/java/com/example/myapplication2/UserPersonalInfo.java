package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class UserPersonalInfo extends AppCompatActivity {
    Spinner spinn1,spinn2;
    String[] dist_code={"01","02","03"};
    String[] phone_code={"010","012","011"};
    Button to_job;
    String value="";

    EditText etextv1,etextv2,etextv3,etextv4,etextv5,etextv6,etextv8,etextv10,etextv11,etextv12,etextv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_personal_info);
        spinn1=findViewById(R.id.spinn1);
        spinn2=findViewById(R.id.spinn2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value =value+ extras.getString("key");

        }
        /*
        //////////////////////////////////////////////EditTexts/////////////////////////////////////
        etextv1=findViewById(R.id.etextv1);
        etextv2=findViewById(R.id.etextv2);
        etextv3=findViewById(R.id.etextv3);
        etextv4=findViewById(R.id.etextv4);
        etextv5=findViewById(R.id.etextv5);
        etextv6=findViewById(R.id.etextv6);
        etextv8=findViewById(R.id.etextv8);
        etextv10=findViewById(R.id.etextv10);
        etextv11=findViewById(R.id.etextv11);
        etextv12=findViewById(R.id.etextv12);
        etextv13=findViewById(R.id.etextv13);

        etextv1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv1.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv2.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv3.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv4.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv5.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv6.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv8.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv10.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv11.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv12.getText().toString();
                value=value+value1+" ";
            }

        });

        etextv13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value1=etextv13.getText().toString();
                value=value+value1+" ";
            }

        });


        ///////////////////////////////////////////////Spinners/////////////////////////////////////
        //Custom Spinner for District Codes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,dist_code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn1.setAdapter(adapter);
        spinn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                value=value+value1+" ";
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        //Custom spinner for Phone codes

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,phone_code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn2.setAdapter(adapter1);
        spinn2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String value1 = String.valueOf(adapterView.getItemAtPosition(i));
                value=value+value1+" ";
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

        //button for job or work info
        to_job=findViewById(R.id.btn_to_job);
        to_job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent job_info_intent = new Intent(UserPersonalInfo.this, UserJobInfo.class);
               // job_info_intent.putExtra("key1",value);
                startActivity(job_info_intent);

            }
        });

    }

}
