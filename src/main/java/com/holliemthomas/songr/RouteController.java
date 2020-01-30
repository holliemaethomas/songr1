package com.holliemthomas.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.thymeleaf.context.ILazyContextVariable;

import java.util.ArrayList;
import java.util.List;

@Controller


public class RouteController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/")
    public String getRoot() {
        return "splash";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }


    @GetMapping("/capitalize/{input}")
    public String getcapitalize(@PathVariable String input,
                                Model m) {
        m.addAttribute("input",
                setCapitalize(input));
        return "capitalize";
    }

//    capitalize method for capitalized route

    public static String setCapitalize(String input) {
        return input.toUpperCase();
    }


    @GetMapping("/album")
    public String getAlbums(Model m) {

        List<Album> albumEntry = albumRepository.findAll();
        m.addAttribute("metalAlbums", albumEntry);

        return "album";

    }

    @PostMapping("/album")
    public RedirectView postAlbums(String artist,
                                   String title,
                                   Integer songCount,
                                   Integer albumLength,
                                   String imageUrl) {
        Album newAlbum = new Album(artist,
                title,
                songCount,
                albumLength,
                imageUrl);
        albumRepository.save(newAlbum);

        return new RedirectView("/album");
    }

    @GetMapping("/songs")
    public String getSongs(Model m) {

        List<AddSong> SongEntry = songRepository.findAll();
        m.addAttribute("metalSongs", SongEntry);

        return "songs";

    }

    @PostMapping("/songs")
    public RedirectView postSongs(String artist, String title) {
        AddSong newSong = new AddSong(artist, title);
        songRepository.save(newSong);

        return new RedirectView("/songs");
    }

}