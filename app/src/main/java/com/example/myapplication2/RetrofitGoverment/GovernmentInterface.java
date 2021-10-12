package com.example.myapplication2.RetrofitGoverment;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GovernmentInterface {
    @GET("GetAllGovernments")
    Call<GovernmentItem> getAllGovernments(@Header("Authorization") String credentials);
}
