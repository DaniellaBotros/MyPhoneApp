package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UserAdditionalInfo extends AppCompatActivity {
    Spinner spin_geo,spin_deleg,spin_social_stat,spin_edu;
    String[] geo={"أختر المكان","لا ينطبق","فرع امبابا","تقسيم أول","أخر"};
    String[] delegates={"أختر المندوب","داليا محمد","رفعة اسماعيل","نادين عمر","اندرو رأفت"};
    String[] social_stat={"أختر الحالة الاجتماعية","أعزب","متزوج","متزوج و يعول","مطلق","ارمل"};
    String[] education={"أختر التعليم","تعليم عالي","تعليم فوق المتوسط","تعليم متوسط","تعليم أساسي","أمي"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_additional_info);
        //Custom Spinner Geo
        spin_geo = (Spinner) findViewById(R.id.spin1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,geo);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_geo.setAdapter(adapter);
        spin_geo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Custom Spinner deleg

        spin_deleg = (Spinner) findViewById(R.id.spin2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,delegates);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_deleg.setAdapter(adapter1);
        spin_deleg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//Custom Spinner Social Status
        spin_social_stat = (Spinner) findViewById(R.id.spin3);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_social_stat.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,social_stat));
        spin_social_stat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //Custom Spinner Education
        spin_edu = (Spinner) findViewById(R.id.spin4);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,education);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_edu.setAdapter(adapter3);
        spin_edu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}