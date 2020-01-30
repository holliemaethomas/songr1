package com.holliemthomas.songr;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String artist;
    private String title;
    private int songCount;
    private int albumLength;
    private String imageUrl;

//    generic constructor
    public AddAlbum() {}

//    constructor

    public AddAlbum(String artist, String title, Integer songCount, Integer albumLength, String imageUrl) {
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

    public Long getId() {
        return id;
    }
}







