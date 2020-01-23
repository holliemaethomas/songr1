package com.holliemthomas.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.ILazyContextVariable;

import java.util.ArrayList;

@Controller

public class HomeController {

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
Album[] metalAlbums = new Album[] {
        new Album("Chelsea Grin", "Ashes To Ashes", 13, 3333, "https://i.ytimg.com/vi/FArfEGiOoS0/maxresdefault.jpg"),

        new Album("Lorna Shore", "Flesh Coffin", 13, 3333, "https://images-na.ssl-images-amazon.com/images/I/8121xoI7goL._SY355_.jpg"),

        new Album("Oceano", "Incisions", 13, 3333, "http://s3.amazonaws.com/NRNArt/Oceano--Incisions-album-cover.jpg"),
};
m.addAttribute("metalAlbums", metalAlbums);
return "album";

    }

}