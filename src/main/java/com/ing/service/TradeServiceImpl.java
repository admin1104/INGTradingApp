package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.model.Stock;
import com.ing.repository.StockRepository;

@Service
public class TradeServiceImpl implements TradeService{
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> getStocks() {
		return stockRepository.findAll();
	}

}
