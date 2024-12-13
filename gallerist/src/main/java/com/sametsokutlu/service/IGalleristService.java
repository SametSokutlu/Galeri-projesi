package com.sametsokutlu.service;

import com.sametsokutlu.dto.DtoGallerist;
import com.sametsokutlu.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
