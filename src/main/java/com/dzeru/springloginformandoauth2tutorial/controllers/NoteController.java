package com.dzeru.springloginformandoauth2tutorial.controllers;

import com.dzeru.springloginformandoauth2tutorial.entities.Note;
import com.dzeru.springloginformandoauth2tutorial.entities.User;
import com.dzeru.springloginformandoauth2tutorial.repos.NoteRepo;
import com.dzeru.springloginformandoauth2tutorial.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class NoteController {
	@Autowired
	private UserService userService;

	@GetMapping("/ykw")
	public String notes(Principal principal, Model model) {
		User user = (User) userService.loadUserByUsername(principal.getName());
		return "ykw";
	}
}
