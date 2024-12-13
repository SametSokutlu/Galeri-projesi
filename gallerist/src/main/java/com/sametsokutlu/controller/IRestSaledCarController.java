package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoSaledCar;
import com.sametsokutlu.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
