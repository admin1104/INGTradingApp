package com.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.model.StockDetails;
import com.ing.repository.StockDetailsRepository;

@Service
public class StockDetailServiceImpl implements StockDetailsService {

	@Autowired
	StockDetailsRepository stockDetailsRepository;
	
	@Override
	public StockDetails purchseStock(StockDetails stockDetails) {
		// TODO Auto-generated method stub
		return stockDetailsRepository.save(stockDetails);
		
	}

}
