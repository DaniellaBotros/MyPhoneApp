package com.example.myapplication2.GenericRetrofit;




import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GenericInterface {

    //Add Client
    @POST("AddClient")
    Call<RecievedItem> addClient(@Header("Authorization") String credentials,@Body DummyClientToSend client);

    @GET("GetAllOfficers")
    Call<GenericItem<OfficerContent>> getAllOfficers(@Header("Authorization") String Scredentials);

    @POST("OfficerLogin")
    Call<OfficerLoginItem> OfficerLogin(@Header("Authorization") String credentials);

    @GET("GetAllMartialStatues")
    Call<GenericItem<GenericItemContent>> getAllMartialStatus(@Header("Authorization") String credentials);

    @GET("GetAllEducationLevels")
    Call<GenericItem<GenericItemContent>> getAllEducation(@Header("Authorization") String credentials);

    @GET("GetAllDistricts")
    Call<GenericItem<DistrictContent>> getAllDistricts(@Header("Authorization") String credentials);

    @GET("GetAllDistrictsByGovId/{id}")
    Call<GenericItem<DistrictContent>> getAllDistrictsByGovId(@Header("Authorization") String credentials,@Path("id") int id);

    @GET("GetAllGeoAreas")
    Call<GenericItem<GeoContent>> getAllGeoAreas(@Header("Authorization") String credentials);

    @GET("GetGeoAreasByBranchId/{id}")
    Call<GenericItem<GeoContent>> getGeoAreasByBranchId(@Header("Authorization") String credentials, @Path("id") int id);

    @GET("GetAllGovernments")
    Call<GenericItem<GovernmentContent>> getAllGovernments(@Header("Authorization") String credentials);

    @GET("GetAllVillages")
    Call<GenericItem<VillageContent>> getAllVillages(@Header("Authorization") String credentials);

    @GET("GetAllVillagesByDistId/{id}")
    Call<GenericItem<VillageContent>>getAllVillagesByDistId(@Header("Authorization") String credentials, @Path("id") int id);

    @GET("GetAllBusinessActivityTypes")
    Call<GenericItem<BusinessActionTypeContent>>getAllBusinessActivityTypes(@Header("Authorization") String credentials);

    @GET("GetBusinessActivityTypeByDivId/{id}")
    Call<GenericItem<BusinessActionTypeContent>> getBusinessActivityTypeByDivId(@Header("Authorization") String credentials, @Path("id") int id);

    @GET("GetAllBusinessDivision")
    Call<GenericItem<BusinessDevisionContent>> getAllBusinessDivision(@Header("Authorization") String credentials);

}
