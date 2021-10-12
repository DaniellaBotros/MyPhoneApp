package com.example.myapplication2.RetrofitDistrict;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DistrictInterface {
    @GET("GetAllDistricts")
    Call<DistrictItem> getAllDistricts(@Header("Authorization") String credentials);
    @GET("GetAllDistrictsByGovId/{id}")
    Call<DistrictItem> getAllDistrictsByGovId(@Header("Authorization") String credentials,@Path("id") int id);
}
