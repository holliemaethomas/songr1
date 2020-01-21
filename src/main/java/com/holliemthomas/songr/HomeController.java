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
        return "Index";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }


}