package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.Client;

public interface ClientDAO{
	List<Client> findClientList();
	int insertClient(Client client);
	int updateClient(Client client);
	Client findClientById(int id);
	int deleteClient(int id);
}