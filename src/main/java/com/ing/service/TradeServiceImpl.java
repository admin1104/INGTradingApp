package com.ing.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.DailyStockAnalyticsResponse;
import com.ing.model.Stock;
import com.ing.model.StockDetails;
import com.ing.model.User;
import com.ing.repository.StockDetailsRepository;
import com.ing.repository.StockRepository;
import com.ing.repository.UserRepository;

@Service
public class TradeServiceImpl implements TradeService{
	
	@Autowired
	StockRepository stockRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	StockDetailsRepository stockDetailsRepository;

	@Override
	public List<Stock> getStocks() {
		return stockRepository.findAll();
	}

	@Override
	public List<StockDetails> getPurchaseHistory(long userId) {
		return stockDetailsRepository.findByUserId(userId);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<DailyStockAnalyticsResponse> getDailyStockAnalytics() {
		
		List<Object[]> list = stockDetailsRepository.getDailyStockDetails();
		if(null != list) {
			return list.stream().map(li->createDailyStockAnalyticsResponse(li)).collect(Collectors.toList())  ;
		}
		return null;
		
	}
	
	public DailyStockAnalyticsResponse createDailyStockAnalyticsResponse(Object[] object){
		DailyStockAnalyticsResponse stockAnalytics = new DailyStockAnalyticsResponse();
		stockAnalytics.setStringName((String)object[0]);
		stockAnalytics.setUnits(object[1].toString());		
		return stockAnalytics;
	}
	
	

}
