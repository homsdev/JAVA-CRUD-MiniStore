package com.homsdev.dao;

import java.util.List;

import com.homsdev.controller.entity.Client;


public interface IClientDAO {
	public List<Client> getClients();
	public void insertClient(Client client); 
	public Client getClient(int id);
}


