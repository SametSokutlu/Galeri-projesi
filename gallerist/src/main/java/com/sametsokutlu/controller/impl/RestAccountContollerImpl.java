package com.sametsokutlu.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sametsokutlu.controller.IRestAccountController;
import com.sametsokutlu.controller.RestBaseController;
import com.sametsokutlu.controller.RootEntity;
import com.sametsokutlu.dto.DtoAccount;
import com.sametsokutlu.dto.DtoAccountIU;
import com.sametsokutlu.service.IAccountService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/account")
public class RestAccountContollerImpl extends RestBaseController implements IRestAccountController {

	@Autowired
	private IAccountService accountService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {
		return ok(accountService.saveAccount(dtoAccountIU));
	}

}
