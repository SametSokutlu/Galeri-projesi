package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoAddress;
import com.sametsokutlu.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
