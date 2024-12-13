package com.sametsokutlu.service;

import com.sametsokutlu.dto.AuthRequest;
import com.sametsokutlu.dto.AuthResponse;
import com.sametsokutlu.dto.DtoUser;
import com.sametsokutlu.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
