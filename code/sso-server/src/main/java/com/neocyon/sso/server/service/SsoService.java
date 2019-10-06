package com.neocyon.sso.server.service;

import com.neocyon.sso.server.domain.AccessToken;

public interface SsoService {
	//
	AccessToken getAccessToken(String token, String clientId);
	
	String logoutAllClients(String clientId, String userName);
}
