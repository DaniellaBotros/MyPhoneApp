package com.example.myapplication2.RepeatedRetroItemsSocialStatEducation;

import com.example.myapplication2.RetrofitGeo.GeoItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface RetroItemInterface<T extends Comparable<T> >{

    @GET("GetAllMartialStatues")
    Call<RetroItem> getAllMartialStatus(@Header("Authorization") String credentials);

    @GET("GetAllEducationLevels")
    Call<RetroItem> getAllEducation(@Header("Authorization") String credentials);





}
