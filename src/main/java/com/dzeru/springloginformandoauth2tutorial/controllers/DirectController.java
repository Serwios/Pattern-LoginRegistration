package com.dzeru.springloginformandoauth2tutorial.controllers;

import com.dzeru.springloginformandoauth2tutorial.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

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
