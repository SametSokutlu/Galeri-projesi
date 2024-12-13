package com.sametsokutlu.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sametsokutlu.dto.DtoAccount;
import com.sametsokutlu.dto.DtoAddress;
import com.sametsokutlu.dto.DtoCustomer;
import com.sametsokutlu.dto.DtoCustomerIU;
import com.sametsokutlu.exception.BaseException;
import com.sametsokutlu.exception.ErrorMessage;
import com.sametsokutlu.exception.MessageType;
import com.sametsokutlu.model.Account;
import com.sametsokutlu.model.Address;
import com.sametsokutlu.model.Customer;
import com.sametsokutlu.repository.AccountRepository;
import com.sametsokutlu.repository.AddressRepository;
import com.sametsokutlu.repository.CustomerRepository;
import com.sametsokutlu.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	private Customer createCustomer(DtoCustomerIU dtoCustomerIU) {
		Optional<Address> optAddress = addressRepository.findById(dtoCustomerIU.getAddressId());
		if(optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoCustomerIU.getAddressId().toString()));
		}
		
		Optional<Account> optAccount = accountRepository.findById(dtoCustomerIU.getAccountId());
		if(optAccount.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoCustomerIU.getAccountId().toString()));
		}
		
		
		Customer customer = new Customer();
		customer.setCreateTime(new Date());
		BeanUtils.copyProperties(dtoCustomerIU, customer);
		
		customer.setAddress(optAddress.get());
		customer.setAccount(optAccount.get());
		
		return customer;
	}
	
	@Override
	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU) {
		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		DtoAccount dtoAccount = new DtoAccount();
		
		Customer savedCustomer = customerRepository.save(createCustomer(dtoCustomerIU));
		
		BeanUtils.copyProperties(savedCustomer, dtoCustomer);
		BeanUtils.copyProperties(savedCustomer.getAddress(), dtoAddress);
		BeanUtils.copyProperties(savedCustomer.getAccount(), dtoAccount);
		
		dtoCustomer.setAddress(dtoAddress);
		dtoCustomer.setAccount(dtoAccount);
		
		return dtoCustomer;
	}

	
}
