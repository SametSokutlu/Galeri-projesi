package com.sametsokutlu.controller;

import com.sametsokutlu.dto.DtoGallerist;
import com.sametsokutlu.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
