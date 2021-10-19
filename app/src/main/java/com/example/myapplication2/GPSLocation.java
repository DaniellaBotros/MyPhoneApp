package com.example.myapplication2;

import android.location.Location;

import java.io.Serializable;

public class GPSLocation implements Serializable {

    private Double longitude;
    private Double latitude;

    public void setLongitude(Double longitude){
        this.longitude=longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude(){
        return this.longitude;
    }

    public Double getLatitude(){
        return this.latitude;
    }
}
