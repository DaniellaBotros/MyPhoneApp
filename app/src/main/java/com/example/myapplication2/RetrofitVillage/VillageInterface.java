package com.example.myapplication2.RetrofitVillage;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface VillageInterface {
    @GET("GetAllVillages")
    Call<VillageItem> getAllVillages(@Header("Authorization") String credentials);
    @GET("GetAllVillagesByDistId/{id}")
    Call<VillageItem> getAllVillagesByDistId(@Header("Authorization") String credentials, @Path("id") int id);
}
