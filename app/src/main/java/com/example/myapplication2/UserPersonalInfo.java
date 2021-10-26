package com.example.myapplication2;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
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

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;


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

                boolean is_valid=false;

                value = etextv2.getText().toString();

                client.BuildClientNationalID(etextv2.getText().toString());


                client.BuildClientNationalIdDate(etextv3.getText().toString());
                value1 = etextv3.getText().toString();

                client.BuildClientBirthdate(etextv4.getText().toString());
                value2 = etextv4.getText().toString();

                String natID=etextv2.getText().toString();
                String date1year=""+natID.charAt(1)+natID.charAt(2);

                String bdate=etextv4.getText().toString();
                Calendar bdateCal=convertStringToDate(bdate);

                String IDDate=etextv3.getText().toString();
                Calendar IDCalDate=convertStringToDate(IDDate);

                String currentdate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                Calendar currentCalDate=convertStringToDate(currentdate);

               if(natID.length()==14){
                   if(((currentCalDate.get(currentCalDate.YEAR)-IDCalDate.get(IDCalDate.YEAR))<=7)||(currentCalDate.get(currentCalDate.MONTH)<= IDCalDate.get(IDCalDate.MONTH)) || (currentCalDate.get(currentCalDate.DATE)<=IDCalDate.get(IDCalDate.DATE))) {
                       if (Integer.parseInt(""+natID.charAt(0)) >= 4) {
                           Toast.makeText(getContext(), "We haven't exceeded 2099!!", Toast.LENGTH_SHORT).show();
                       } else if (Integer.parseInt(date1year) < 100 && Integer.parseInt(date1year) >= 0) {
                           if ((natID.charAt(0) == '1' && bdate.charAt(0) == '1' && bdate.charAt(1) == '8') ||
                                   (natID.charAt(0) == '2' && bdate.charAt(0) == '1' && bdate.charAt(1) == '9') ||
                                   (natID.charAt(0) == '3' && bdate.charAt(0) == '2' && bdate.charAt(1) == '0')) {
                               String temp = "" + bdate.charAt(0) + bdate.charAt(1) + natID.charAt(1) + natID.charAt(2);
                               int natIdYear = Integer.parseInt(temp);
                               temp = "" + natID.charAt(3) + natID.charAt(4);
                               int natIdMonth = Integer.parseInt(temp);
                               temp = "" + natID.charAt(5) + natID.charAt(6);
                               int natIdDay = Integer.parseInt(temp);
                               if ((bdateCal.get(bdateCal.YEAR) == natIdYear) && ((bdateCal.get(bdateCal.MONTH) + 1) == natIdMonth) && (bdateCal.get(bdateCal.DATE) == natIdDay)) {

                                    temp=""+natID.charAt(12);
                                    String gender= client.getBuilderClientGender();
                                    if((gender.equals("Female") && (temp.equals("2")||temp.equals("4")||temp.equals("6")||temp.equals("8")))) {
                                                is_valid=true;
                                    }
                                    else if((gender.equals("Male") && (temp.equals("1")||temp.equals("3")||temp.equals("5")||temp.equals("7")||temp.equals("9")))){
                                       is_valid=true;
                                    }
                                    else{
                                        Toast.makeText(getContext(), "Your gender doesn't match your ID!!", Toast.LENGTH_SHORT).show();
                                    }

                               }
                               else {
                                   Toast.makeText(getContext(), "Your birth date doesn't match your ID!!", Toast.LENGTH_SHORT).show();
                               }
                           }
                           else {
                               Toast.makeText(getContext(), "Your birth date doesn't match your ID!!", Toast.LENGTH_SHORT).show();
                           }
                       } else {
                           Toast.makeText(getContext(), "Your date is wrong!!", Toast.LENGTH_SHORT).show();
                       }

                   }
                   else{
                       Toast.makeText(getContext(), "Your ID Expired!!", Toast.LENGTH_SHORT).show();
                   }
               }

               else {
                   Toast.makeText(getContext(), "Your ID is invalid!!", Toast.LENGTH_SHORT).show();
               }


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
                    if(!is_valid){
                        Toast.makeText(getContext(), "Your ID Data is Invalid!!", Toast.LENGTH_LONG).show();
                    }
                    else{

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
            }
        });



        return view;
    }


public Calendar convertStringToDate(String stringdate){
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date date = null;
    try {
        date = formatter.parse(stringdate);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    Calendar calender = Calendar.getInstance();
    calender.setTime(date);
    return calender;
}




}