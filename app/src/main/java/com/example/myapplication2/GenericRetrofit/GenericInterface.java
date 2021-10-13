package com.example.myapplication2.GenericRetrofit;




import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface GenericInterface {
    @GET("GetAllOfficers")
    Call<GenericItem<OfficerContent>> getAllOfficers(@Header("Authorization") String credentials);

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
}
