package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin_gender,spin_type;
    String value="";
    Button user_info_btn,add_info_btn;
    String[] type_of_user= {"أختر نوع الحساب","فردي","مجموعة","عضو في مجموعة"};
    String[] gender_of_user= {"أختر النوع","ذكر","أنثى"};
    Integer[] images = { 0, R.drawable.single, R.drawable.group, R.drawable.member_of_group_1};
    EditText user_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name=findViewById(R.id.name);


///////////////////////////////////////////////////////////////////////////////////////

        //button for user info
        user_info_btn=findViewById(R.id.btnPersonalInfo);
        user_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String test=user_name.getText().toString();
                value=value+test+" ";
               // System.out.println(value);
                Intent i = new Intent(MainActivity.this,UserPersonalInfo.class);
                Bundle bundle = new Bundle();
                bundle.putString("key", value);
                i.putExtras(bundle);
                startActivity(i);

            }
        });




        //spinner for gender
        spin_gender = (Spinner) findViewById(R.id.spinnerGender);
        spin_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0){
                Toast.makeText(getApplicationContext(),gender_of_user[i], Toast.LENGTH_SHORT).show();
                value=value+gender_of_user[i]+" ";
                }
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
                if(i!=0){
                Toast.makeText(getApplicationContext(),type_of_user[i], Toast.LENGTH_SHORT).show();
                value=value+type_of_user[i]+" ";
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        CustomAdapterUserType customAdapter=new CustomAdapterUserType(getApplicationContext(),images,type_of_user);
        spin_type.setAdapter(customAdapter);


    }

}


