package com.homsdev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@RequestMapping("/list")
	public String clientList(Model model) {
		return "clientList";
	}
	
	
}
