package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoCustomer;
import com.sametsokutlu.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
