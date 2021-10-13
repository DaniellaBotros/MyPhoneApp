package com.example.myapplication2.Officer;

import com.example.myapplication2.RepeatedRetroItemsSocialStatEducation.RetroItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface OfficerInterface {

    @GET("GetAllOfficers")
    Call<Officer> getAllOfficers(@Header("Authorization") String credentials);
}
