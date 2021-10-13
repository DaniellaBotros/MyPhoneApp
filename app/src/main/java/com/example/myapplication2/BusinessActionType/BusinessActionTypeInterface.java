package com.example.myapplication2.BusinessActionType;

import com.example.myapplication2.RepeatedRetroItemsSocialStatEducation.RetroItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface BusinessActionTypeInterface {

    @GET("GetAllBusinessActivityTypes")
    Call<BusinessActionType> getAllBusinessActivityTypes(@Header("Authorization") String credentials);

    @GET("GetBusinessActivityTypeByDivId/{id}")
    Call<BusinessActionType> getBusinessActivityTypeByDivId(@Header("Authorization") String credentials, @Path("id") int id);
}
