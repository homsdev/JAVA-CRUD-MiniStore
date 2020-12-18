package com.homsdev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homsdev.controller.entity.Client;
import com.homsdev.dao.IClientDAO;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private IClientDAO clientDAO;
	
	
	@RequestMapping("/list")
	public String clientList(Model model) {
		
		
		//getting Clients from DAO
		List<Client> clients = clientDAO.getClients();
		
		//Adding Clients to Model
		model.addAttribute("clientList", clients);
		
		return "clientList";
	}
	
	
}
