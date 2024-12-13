package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoAccount;
import com.sametsokutlu.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
