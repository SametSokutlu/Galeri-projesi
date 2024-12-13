package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoCar;
import com.sametsokutlu.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
