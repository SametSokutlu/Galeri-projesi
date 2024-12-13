package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoAccount;
import com.sametsokutlu.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
