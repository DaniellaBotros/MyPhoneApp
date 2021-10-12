package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;

import com.example.myapplication2.RetrofitGeo.GeoContent;
import com.example.myapplication2.RetrofitGeo.GeoInterface;
import com.example.myapplication2.RetrofitGeo.GeoItem;

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


        /*///////Retrofit//////////////////////////////////////////////////////////////////////

        GeoInterface retroClient=retrofit.create(GeoInterface.class);
        Call<GeoItem> call=retroClient.getGeoAreasByBranchId(auth,1);

        call.enqueue(new Callback<GeoItem>() {

            @Override
            public void onResponse(Call<GeoItem>  call, Response<GeoItem> response) {
                if(response.isSuccessful()) {
                    GeoItem changesList = response.body();

                    //System.out.println("It worked !!:)");
                    System.out.println(changesList);
                    List<GeoContent> l=changesList.getList();
                    arr=new String[l.size()];
                    for(int i=0;i<l.size();i++){
                        arr[i]=l.get(i).getGeoAreaName();
                    }



                } else {
                    System.out.println(response.errorBody());

                }
            }

            @Override
            public void onFailure(Call <GeoItem> call, Throwable t) {
                System.out.println("I failed!!:(");
                t.printStackTrace();
            }
        });

        ////////////////////////////////////////////////////////////////////////*/



        getSupportFragmentManager().beginTransaction().add(R.id.container1,new IntroFrag()).commit();

    }



}










