package com.holliemthomas.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String artist;
    public String title;
    public String imageUrl;
    public int songCount;
    public int albumLength;

    public Album() {}


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
