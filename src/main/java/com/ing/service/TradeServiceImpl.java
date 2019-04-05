package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.model.Stock;
import com.ing.model.User;
import com.ing.repository.StockRepository;
import com.ing.repository.UserRepository;

@Service
public class TradeServiceImpl implements TradeService{
	
	@Autowired
	StockRepository stockRepository;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Stock> getStocks() {
		return stockRepository.findAll();
	}

	@Override
	public List getPurchaseHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	

}
