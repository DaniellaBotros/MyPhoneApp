package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class UserPersonalInfo extends AppCompatActivity {
    Spinner spinn1,spinn2;
    String[] dist_code={"01","02","03"};
    String[] phone_code={"010","012","011"};
    Button to_job;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_personal_info);
        spinn1=findViewById(R.id.spinn1);
        spinn2=findViewById(R.id.spinn2);


        //Custom Spinner for District Codes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,dist_code);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn1.setAdapter(adapter);
        spinn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

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

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //button for job or work info
        to_job=findViewById(R.id.btn_to_job);
        to_job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent job_info_intent = new Intent(UserPersonalInfo.this, UserJobInfo.class);
                startActivity(job_info_intent);
            }
        });

    }

}
