package com.example.android.quakereport;

/**
 * Created by Daniel on 2/19/2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;
    //Location of the earthquake
    private String mLocation;
    //Date of the earthquake
    private String mDate;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;



    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double  getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double  mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }
    public String getUrl() {
        return mUrl;
    }
}
