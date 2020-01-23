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
//        Album[] metalAlbums = new Album[]{
//                new Album("Chelsea Grin",
//                        "Ashes To Ashes",
//                        13,
//                        3333,
//                        "https://i.ytimg.com/vi/FArfEGiOoS0/maxresdefault.jpg"),
//
//                new Album("Lorna Shore",
//                        "Flesh Coffin",
//                        13,
//                        3333,
//                        "https://images-na.ssl-images-amazon.com/images/I/8121xoI7goL._SY355_.jpg"),
//
//                new Album("Oceano",
//                        "Incisions",
//                        13,
//                        3333,
//                        "http://s3.amazonaws.com/NRNArt/Oceano--Incisions-album-cover.jpg"),
//        };
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

}