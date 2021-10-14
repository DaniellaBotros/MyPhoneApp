package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;

import com.example.myapplication2.GenericRetrofit.GenericInterface;
import com.example.myapplication2.GenericRetrofit.GenericItem;
import com.example.myapplication2.GenericRetrofit.OfficerContent;
import com.example.myapplication2.GenericRetrofit.OfficerLoginContent;
import com.example.myapplication2.GenericRetrofit.OfficerLoginItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    private String URL="http://192.168.255.19:1233/MohassilService.svc/";
    Retrofit.Builder builder=new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit=builder.build();
    private String username="x";
    private String password="x";
    private String base=username+":"+password;
    private String auth="Basic "+ Base64.encodeToString(base.getBytes(),Base64.NO_WRAP);
    String[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  ///////Retrofit//////////////////////////////////////////////////////////////////////





        GenericInterface retroClient=retrofit.create(GenericInterface.class);
        Call<GenericItem<OfficerContent>> call=retroClient.getAllOfficers(auth);

        call.enqueue(new Callback<GenericItem<OfficerContent>>() {

            @Override
            public void onResponse(Call<GenericItem<OfficerContent>>  call, Response<GenericItem<OfficerContent>> response) {
                if(response.isSuccessful()) {
                    GenericItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    System.out.println(changesList);
                    List<OfficerContent> l=changesList.getList();
                    arr=new String[l.size()];
                    for(int i=0;i<l.size();i++){
                        arr[i]=l.get(i).getOfficerName();

                    }



                } else {
                    System.out.println(response.errorBody());

                }
            }

            @Override
            public void onFailure(Call <GenericItem<OfficerContent>> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });

        ////////////////////////////////////////////////////////////////////////*/


        ////////////////////////Test POST//////////////////////////////////////////

        GenericInterface retroClient=retrofit.create(GenericInterface.class);
        Call<OfficerLoginItem> call=retroClient.OfficerLogin(auth);

        call.enqueue(new Callback<OfficerLoginItem>() {

            @Override
            public void onResponse(Call<OfficerLoginItem>  call, Response<OfficerLoginItem>response) {
                if(response.isSuccessful()) {
                    OfficerLoginItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    //System.out.println(changesList);
                    OfficerLoginContent l=changesList.getList();
                    //System.out.println(l);
                    //c.BuildBranchID(l.getBranchCode());

                    ;
                   /* arr=new String[l.size()];
                    for(int i=0;i<l.size();i++){
                        arr[i]=l.get(i).getBranchCode();

                    }*/



                } else {
                    System.out.println(response.errorBody());

                }
            }

            @Override
            public void onFailure(Call <OfficerLoginItem> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });

        ///////////////////////////////////////////////////////////////////////////*/

        getSupportFragmentManager().beginTransaction().add(R.id.container1,new IntroFrag()).commit();

    }



}










