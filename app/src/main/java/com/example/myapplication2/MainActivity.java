package com.example.myapplication2;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication2.GenericRetrofit.GenericInterface;
import com.example.myapplication2.GenericRetrofit.GenericItem;
import com.example.myapplication2.GenericRetrofit.OfficerContent;
import com.example.myapplication2.GenericRetrofit.OfficerLoginContent;
import com.example.myapplication2.GenericRetrofit.OfficerLoginItem;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity implements LocationListener {
    private String URL = "http://192.168.255.19:1233/MohassilService.svc/";
    Retrofit.Builder builder = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit = builder.build();
    private String username = "x";
    private String password = "x";
    private String base = username + ":" + password;
    private String auth = "Basic " + Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);
    String[] arr;
    private double latitude = 0.0;
    private double logitude = 0.0;
    private Location loc;
    private String test1;
    private String test2;

    ////Location via get locationUpdate
    private LocationManager locationManager;


    ///location via lastLocation
    private FusedLocationProviderClient fusedLocationClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////location Stuff///////////////////
        ActivityResultLauncher<String[]> locationPermissionRequest =
                registerForActivityResult(new ActivityResultContracts
                                .RequestMultiplePermissions(), result -> {
                            Boolean fineLocationGranted = result.getOrDefault(
                                    ACCESS_FINE_LOCATION, false);
                            Boolean coarseLocationGranted = result.getOrDefault(
                                    ACCESS_COARSE_LOCATION,false);
                            if (fineLocationGranted != null && fineLocationGranted) {
                                // Precise location access granted.
                                Toast.makeText(getApplicationContext(), "Precise location access granted!", Toast.LENGTH_LONG).show();
                                System.out.println("Precise location access granted!");
                            } else if (coarseLocationGranted != null && coarseLocationGranted) {
                                // Only approximate location access granted.
                                Toast.makeText(getApplicationContext(), "Only approximate location access granted!", Toast.LENGTH_LONG).show();
                                System.out.println("Only approximate location access granted!");
                            } else {
                                Toast.makeText(getApplicationContext(), "Give access to location please!", Toast.LENGTH_LONG).show();
                                System.out.println("Give access to location please!");
                            }
                        }
                );
        locationPermissionRequest.launch(new String[] {
                ACCESS_FINE_LOCATION,
                ACCESS_COARSE_LOCATION
        });

        //requestLastLocation();
        updateLocationMethod();
       //lastLocationAttempst2();




        ////////////////////////Officer Test//////////////////////////////////////////
            //getOfficer();

        ///////////////////////////////////////////////////////////////////////////*/


       /* Bundle bundle = new Bundle();
        bundle.putSerializable("location", gps);

        frag.setArguments(bundle);*/

       // IntroFrag frag=new IntroFrag();
        //System.out.println(latitude+"---------"+logitude);

      //  getSupportFragmentManager().beginTransaction().add(R.id.container1,frag).commit();

    }



    public void requestLastLocation(){

    fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
    if (ActivityCompat.checkSelfPermission(this, ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        System.out.println("Give access to location please!");
        Toast.makeText(getApplicationContext(), "Give access to location please!", Toast.LENGTH_LONG).show();

    }

    fusedLocationClient.getLastLocation()
            .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {
                    Toast.makeText(getApplicationContext(), "Precise location access granted!", Toast.LENGTH_LONG).show();
                    System.out.println("Precise location access granted!");
                    if (location != null) {
                        latitude=location.getLatitude();
                        logitude=location.getLongitude();
                        loc=location;
                        test1=Double.toString(latitude);
                        test2=Double.toString(logitude);
                       // System.out.println(test1+"\t"+test2);

                        IntroFrag frag=new IntroFrag();

                        Bundle bundle = new Bundle();
                        bundle.putString("latitude",test1);
                        bundle.putString("logitude",test2);

                        frag.setArguments(bundle);
                        getSupportFragmentManager().beginTransaction().add(R.id.container1,frag).commit();
                       //System.out.println("latitude: "+latitude+"\n"+"longitude: "+logitude+"\n"+"location: "+loc);
                    }

                }
            });
}


    public void updateLocationMethod(){
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            System.out.println("Give access to location please!");
            Toast.makeText(getApplicationContext(), "Give access to location please!", Toast.LENGTH_LONG).show();

        }
        else {

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 100, 100, this);
        }


    }


    @Override
    public void onLocationChanged(@NonNull Location location) {

        //System.out.println("Latit" + location.getLatitude() + ", Longit:" + location.getLongitude()+"\n"+"location: "+location);
        loc=location;
        latitude=location.getLatitude();
        logitude=location.getLongitude();
        test1=Double.toString(latitude);
        test2=Double.toString(logitude);
        //System.out.println(test1+"\t"+test2);

        IntroFrag frag=new IntroFrag();

        Bundle bundle = new Bundle();
        bundle.putString("latitude",test1);
        bundle.putString("logitude",test2);

        frag.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.container1,frag).commit();


    }

    @Override
    public void onProviderDisabled(String provider) {

        Log.d("Latit","disable");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Log.d("Latit","enable");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.d("Latit","status");
    }

    public void lastLocationAttempst2(){

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            if(locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
                fusedLocationClient.getLastLocation()
                        .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                            @Override
                            public void onSuccess(Location location) {
                                Toast.makeText(getApplicationContext(), "Precise location access granted!", Toast.LENGTH_LONG).show();
                                System.out.println("Precise location access granted!");
                                if (location != null) {
                                    latitude=location.getLatitude();
                                    logitude=location.getLongitude();
                                    loc=location;
                                    test1=Double.toString(latitude);
                                    test2=Double.toString(logitude);
                                    //System.out.println(test1+"\t"+test2);
                                    IntroFrag frag=new IntroFrag();

                                    Bundle bundle = new Bundle();
                                    bundle.putString("latitude",test1);
                                    bundle.putString("logitude",test2);

                                    frag.setArguments(bundle);
                                    getSupportFragmentManager().beginTransaction().add(R.id.container1,frag).commit();

                                }

                            }
                        });
            }
            else{

                Toast.makeText(this, "Please turn on" + " your location...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }


        }
        else{
            System.out.println("Give access to location please!");
            Toast.makeText(getApplicationContext(), "Give access to location please!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        //requestLastLocation();
        updateLocationMethod();
        //lastLocationAttempst2();
    }

    public void getOfficer(){
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
                System.out.println("I failed Login officer!!:(");
                t.printStackTrace();
            }
        });


    }


}

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








