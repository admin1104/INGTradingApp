package com.ing.service;

import java.util.List;

import com.ing.dto.DailyStockAnalyticsResponse;
import com.ing.model.Stock;
import com.ing.model.StockDetails;
import com.ing.model.User;

public interface TradeService {
	
	public List<User> getUsers();
	
	public List<Stock> getStocks();
	
	public List<StockDetails> getPurchaseHistory(long userId);
	
	public List<DailyStockAnalyticsResponse> getDailyStockAnalytics();

}
