package com.holliemthomas.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddSong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private String artist;
    private String title;


    //    generic constructor
    public AddSong() {}

//    constructor

    public AddSong(String artist, String title) {
        this.artist = artist;
        this.title = title;

    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }
}
