package com.sametsokutlu.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sametsokutlu.dto.DtoAddress;
import com.sametsokutlu.dto.DtoGallerist;
import com.sametsokutlu.dto.DtoGalleristIU;
import com.sametsokutlu.exception.BaseException;
import com.sametsokutlu.exception.ErrorMessage;
import com.sametsokutlu.exception.MessageType;
import com.sametsokutlu.model.Address;
import com.sametsokutlu.model.Gallerist;
import com.sametsokutlu.repository.AddressRepository;
import com.sametsokutlu.repository.GalleristRepository;
import com.sametsokutlu.service.IGalleristService;

@Service
public class GalleristServiceImpl implements IGalleristService {

	@Autowired
	private GalleristRepository galleristRepository;

	@Autowired
	private AddressRepository addressRepository;

	private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {

		Optional<Address> optAddress = addressRepository.findById(dtoGalleristIU.getAddressId());
		if (optAddress.isEmpty()) {
			throw new BaseException(
					new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristIU.getAddressId().toString()));
		}

		Gallerist gallerist = new Gallerist();
		gallerist.setCreateTime(new Date());

		BeanUtils.copyProperties(dtoGalleristIU, gallerist);
		gallerist.setAddress(optAddress.get());

		return gallerist;

	}

	@Override
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();

		Gallerist savedGallerist = galleristRepository.save(createGallerist(dtoGalleristIU));

		BeanUtils.copyProperties(savedGallerist, dtoGallerist);
		BeanUtils.copyProperties(savedGallerist.getAddress(), dtoAddress);

		dtoGallerist.setAddress(dtoAddress);
		return dtoGallerist;
	}

}
