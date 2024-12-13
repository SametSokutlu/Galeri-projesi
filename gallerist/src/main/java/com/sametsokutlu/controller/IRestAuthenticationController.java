package com.sametsokutlu.controller;

import com.sametsokutlu.dto.AuthRequest;
import com.sametsokutlu.dto.AuthResponse;
import com.sametsokutlu.dto.DtoUser;
import com.sametsokutlu.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
