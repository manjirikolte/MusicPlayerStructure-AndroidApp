package com.example.musicplayer_app;

public class MusicList {
    private String mSongName;
    private String mSongArtist;
    private String mImageResourceId;

    public MusicList(String mSongName, String mSongArtist, String mImageResourceId) {
        this.mSongName = mSongName;
        this.mSongArtist = mSongArtist;
        this.mImageResourceId = mImageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getSongArtist() {
        return mSongArtist;
    }

    public String getImageResourceId() {
        return mImageResourceId;
    }
}
