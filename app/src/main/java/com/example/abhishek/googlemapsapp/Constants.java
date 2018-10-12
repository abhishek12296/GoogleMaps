package com.example.abhishek.googlemapsapp;

import android.net.Uri;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public class Constants {


    public static final String GEOFENCE_ID_MY_HOME = "HOME";
    public static final float GEOFENCE_RADIUS_IN_METERS = 100;

    public static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<String, LatLng>();

    static {
        AREA_LANDMARKS.put(GEOFENCE_ID_MY_HOME, new LatLng(25.2498573, 82.9569106));
    }
}
