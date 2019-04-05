package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.model.Stock;
import com.ing.service.TradeService;

@RestController
@RequestMapping("/trades")
public class TadeController {
	
	@Autowired
	TradeService tradeService;
	
	@GetMapping("/stocks")
	public List<Stock> loadStocks(){
		return tradeService.getStocks();
	}

}
