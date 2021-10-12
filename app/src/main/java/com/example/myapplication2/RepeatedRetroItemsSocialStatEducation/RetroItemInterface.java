package com.example.myapplication2.RepeatedRetroItemsSocialStatEducation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface RetroItemInterface {

    @GET("GetAllMartialStatues")
    Call<RetroItem> getAllMartialStatus(@Header("Authorization") String credentials);

    @GET("GetAllEducationLevels")
    Call<RetroItem> getAllEducation(@Header("Authorization") String credentials);

}
