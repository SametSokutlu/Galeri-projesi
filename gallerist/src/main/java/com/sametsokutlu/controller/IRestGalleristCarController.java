package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoGalleristCar;
import com.sametsokutlu.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
