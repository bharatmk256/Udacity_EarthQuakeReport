package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private Long mTimeInMilliseconds;



    public Earthquake(String magnitude,String location,Long TimeInMilliseconds){
        mMagnitude= magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
