package com.example.myapplication2.BusinessDevision;

import com.example.myapplication2.RetrofitGeo.GeoItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface BusinessDevisionInterface {
    @GET("GetAllBusinessDivision")
    Call<BusinessDevision> getAllBusinessDivision(@Header("Authorization") String credentials);
}
