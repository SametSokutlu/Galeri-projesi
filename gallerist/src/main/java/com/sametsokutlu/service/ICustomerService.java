package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoCustomer;
import com.sametsokutlu.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
