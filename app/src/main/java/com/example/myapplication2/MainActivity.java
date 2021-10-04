package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spin_gender,spin_type;
    Button user_info_btn,add_info_btn;
    String[] type_of_user= {"أختر النوع الحساب","فردي","مجموعة","عضو في مجموعة"};
    String[] gender_of_user= {"أختر النوع","ذكر","أنثى"};
    Integer[] images = { 0, R.drawable.single, R.drawable.group, R.drawable.member_of_group_1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button for user info
        user_info_btn=findViewById(R.id.btnPersonalInfo);
        user_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user_info_intent = new Intent(MainActivity.this, UserPersonalInfo.class);
                startActivity(user_info_intent);
            }
        });




        //spinner for gender
        spin_gender = (Spinner) findViewById(R.id.spinnerGender);
        spin_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),"User Gender" , Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter aa_gender = new ArrayAdapter(this,android.R.layout.simple_spinner_item,gender_of_user);
        aa_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_gender.setAdapter(aa_gender);

        //spinner for account type
        spin_type = (Spinner) findViewById(R.id.spinnerType);
        spin_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),"User Type" , Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        CustomAdapterUserType customAdapter=new CustomAdapterUserType(getApplicationContext(),images,type_of_user);
        spin_type.setAdapter(customAdapter);


    }

}


