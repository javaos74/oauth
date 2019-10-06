package com.neocyon.sso.server.service;

import org.springframework.data.repository.CrudRepository;

import com.neocyon.sso.server.domain.Client;

public interface ClientRepository extends CrudRepository<Client, String> {
	//
}
