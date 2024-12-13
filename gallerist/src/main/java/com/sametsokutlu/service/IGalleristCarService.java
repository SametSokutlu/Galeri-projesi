package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoGalleristCar;
import com.sametsokutlu.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
