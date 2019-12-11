package com.example.shaketomap;

import com.google.android.gms.maps.model.LatLng;

public class Pin {
    public String latitude;
    public String longitude;
    public String name;

    public Pin(String latitude,String longitude, String name){
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;

    }
    public Pin(){

    }

}
