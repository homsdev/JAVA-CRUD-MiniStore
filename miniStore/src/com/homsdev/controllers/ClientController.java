package com.homsdev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homsdev.controller.entity.Client;
import com.homsdev.dao.IClientDAO;

@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private IClientDAO clientDAO;

	@RequestMapping("/list")
	public String clientList(Model model) {

		// getting Clients from DAO
		List<Client> clients = clientDAO.getClients();

		// Adding Clients to Model
		model.addAttribute("clientList", clients);

		return "clientList";
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		Client newClient = new Client();
		
		model.addAttribute("newClient", newClient);
		
		return "formClient";
	}
	
	@RequestMapping("/update-form")
	public String showUpdateForm(@RequestParam(name="idClient") int id, Model model ) {
		
		Client newClient= clientDAO.getClient(id);
		model.addAttribute("idClient", id);
		model.addAttribute("newClient", newClient);
		return "updateForm";
	}
	
	
	@PostMapping("/insert")
	public String insertClient(@ModelAttribute("Client")Client client) {
		
		clientDAO.insertClient(client);
		return "redirect:/client/list";
	}
	
	

}
