package com.homsdev.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.homsdev.controller.entity.Client;

@Repository
public class ClientDAO implements IClientDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Client> getClients() {
		// Getting the session
		Session newSession= sessionFactory.getCurrentSession();
		// Getting the Query
		Query<Client> newQuery= newSession.createQuery("from Client",Client.class);
		
		// Exceuting Query
		List <Client> clients= newQuery.getResultList();
		
		// return data
		return clients;
	}


	@Override
	@Transactional
	public void insertClient(Client client) {
		// TODO Auto-generated method stub
		Session newSession= sessionFactory.getCurrentSession();
		newSession.save(client);
	}



}
