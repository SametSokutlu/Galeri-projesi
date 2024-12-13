package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoSaledCar;
import com.sametsokutlu.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
