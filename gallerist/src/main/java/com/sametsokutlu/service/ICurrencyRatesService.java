package com.sametsokutlu.service;

import com.sametsokutlu.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

	public CurrencyRatesResponse getCurrencyRates(String startDate , String endDate);
}
