package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.DailyStockAnalyticsResponse;
import com.ing.model.Stock;
import com.ing.model.StockDetails;
import com.ing.model.User;
import com.ing.service.IndvidualStockAnalysisService;
import com.ing.service.StockDetailsService;
import com.ing.service.TradeService;

@RestController
@RequestMapping("/trades")
@CrossOrigin
public class TadeController {
	
	@Autowired
	TradeService tradeService;
	
	@Autowired
	StockDetailsService stockDetailsService;
	
	@Autowired
	IndvidualStockAnalysisService indvidualStockAnalysisService;
	
	@GetMapping("/stocks")
	public List<Stock> loadStocks(){
		return tradeService.getStocks();
	}
	
	@GetMapping("/users")
	public List<User> loadUsers(){
		return tradeService.getUsers();
	}
	
	@GetMapping("/purchaseHistory/{userId}")
	public List<StockDetails> loadPurchaseHistory(@PathVariable long userId){
		return tradeService.getPurchaseHistory(userId);
	}
	
	@PostMapping("/buyStocks")
	public StockDetails saveStockDetails(@RequestBody StockDetails stockDetails){
		return stockDetailsService.purchseStock(stockDetails);
	}
	
	@GetMapping("/dailyStockAnalytics")
	public List<DailyStockAnalyticsResponse> getDailyStockAnalytics(){
		return tradeService.getDailyStockAnalytics();
	}
	
	@GetMapping("/stockAnalytics/{stockName}")
	public DailyStockAnalyticsResponse loadStockAnalytics(@PathVariable String stockName){
		
		DailyStockAnalyticsResponse dto = new DailyStockAnalyticsResponse();
		
		int count =  indvidualStockAnalysisService.lastHourCount(stockName);
		
		dto.setStringName(stockName);
		dto.setUnits(""+count);
	
		return dto;
	}

}
