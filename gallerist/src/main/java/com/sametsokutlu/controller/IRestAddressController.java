package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoAddress;
import com.sametsokutlu.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
