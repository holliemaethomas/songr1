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
        new Album("Chelsea Grin1", "Eternal Nightmares", 13, 3333, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2F6%2F62%2FChelsea_Grin_Ashes_to_Ashes.jpg&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FAshes_to_Ashes_(Chelsea_Grin_album)&docid=RgaRMguskX9M5M&tbnid=XEpIBeY4ZByXaM%3A&vet=10ahUKEwjkyOLb95fnAhXiHTQIHcXFAPwQMwhLKAEwAQ..i&w=316&h=316&safe=active&bih=821&biw=1440&q=chelsea%20grin%20ashes%20to%20ashes%20songs&ved=0ahUKEwjkyOLb95fnAhXiHTQIHcXFAPwQMwhLKAEwAQ&iact=mrc&uact=8"),

        new Album("Chelsea Grin2", "Eternal Nightmares", 13, 3333, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2F6%2F62%2FChelsea_Grin_Ashes_to_Ashes.jpg&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FAshes_to_Ashes_(Chelsea_Grin_album)&docid=RgaRMguskX9M5M&tbnid=XEpIBeY4ZByXaM%3A&vet=10ahUKEwjkyOLb95fnAhXiHTQIHcXFAPwQMwhLKAEwAQ..i&w=316&h=316&safe=active&bih=821&biw=1440&q=chelsea%20grin%20ashes%20to%20ashes%20songs&ved=0ahUKEwjkyOLb95fnAhXiHTQIHcXFAPwQMwhLKAEwAQ&iact=mrc&uact=8"),

        new Album("Chelsea Grin3", "Eternal Nightmares", 13, 3333, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2F6%2F62%2FChelsea_Grin_Ashes_to_Ashes.jpg&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FAshes_to_Ashes_(Chelsea_Grin_album)&docid=RgaRMguskX9M5M&tbnid=XEpIBeY4ZByXaM%3A&vet=10ahUKEwjkyOLb95fnAhXiHTQIHcXFAPwQMwhLKAEwAQ..i&w=316&h=316&safe=active&bih=821&biw=1440&q=chelsea%20grin%20ashes%20to%20ashes%20songs&ved=0ahUKEwjkyOLb95fnAhXiHTQIHcXFAPwQMwhLKAEwAQ&iact=mrc&uact=8"),
};
m.addAttribute("metalAlbums", metalAlbums);
return "album";

    }

}