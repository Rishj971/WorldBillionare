package com.example.android.worldbillionare;

public class Billionares {



    private String name, thumbnailUrl;
    private int year;
    private String source;
    private String worth;

    public Billionares(String mName , String mThumbnailUrl , String mWorth , int mYear , String mSource)
    {
        name = mName;
        thumbnailUrl = mThumbnailUrl;
        year = mYear;
        source = mSource;
        worth = mWorth;
    }




    public  String getName()
    {return name;}

    public  String getThumbnailUrl()
    {return thumbnailUrl;}

    public int getYear()
    {return  year;}

    public String getSource()
    {return source;}

    public String getWorth()
    {return worth;}







}
