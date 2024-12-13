package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoCar;
import com.sametsokutlu.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
