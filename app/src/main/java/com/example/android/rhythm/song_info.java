package com.example.android.rhythm;

public class song_info {
    private String mArtistName;
    private String mAlbumName;
    private String mSongName;
    private double mSongLen;
    public song_info(String songName , String artistName, String albumName,double songLen){
        mSongName=songName;
        mArtistName=artistName;
        mAlbumName=albumName;
        mSongLen=songLen;
    }
    public String getmSongName(){
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }

    public double getmSongLen() {
        return mSongLen;
    }
}
