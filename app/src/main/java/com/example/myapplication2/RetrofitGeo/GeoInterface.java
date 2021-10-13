package com.example.myapplication2.RetrofitGeo;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GeoInterface {
    @GET("GetAllGeoAreas")
    Call<GeoItem> getAllGeoAreas(@Header("Authorization") String credentials);

    @GET("GetGeoAreasByBranchId/{id}")
    Call<GeoItem> getGeoAreasByBranchId(@Header("Authorization") String credentials, @Path("id") int id);
}