package com.dzeru.springloginformandoauth2tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DirectController {
    @GetMapping("/prj")
    public String openPrj() {
        return "prj";
    }

    @GetMapping("/lib")
    public String openLib() {
        return "lib";
    }
}
