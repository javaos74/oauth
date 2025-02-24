package com.neocyon.sso.server.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.neocyon.sso.server.domain.AccessToken;

public interface AccessTokenRepository extends CrudRepository<AccessToken, String> {
	//
	AccessToken findByTokenIdAndClientId(String tokenId, String clientId);
	
	int deleteByUserName(String userName);
	
	List<AccessToken> findByUserName(String userName);
}
