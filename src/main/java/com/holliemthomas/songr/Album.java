package com.holliemthomas.songr;

public class Album {
    public String artist;
    public String title;
    public String imageUrl;
    private int songCount;
    private int albumLength;


    public Album(String artist, String title, Integer songCount, Integer albumLength, String imageUrl) {
        this.artist = artist;
        this.title = title;
        this.songCount = songCount;
        this.albumLength = albumLength;
        this.imageUrl = imageUrl;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getAlbumLength() {
        return albumLength;
    }

    public int getSongCount() {
        return songCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
