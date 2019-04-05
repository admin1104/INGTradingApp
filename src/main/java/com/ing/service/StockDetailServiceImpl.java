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
		int units=stockDetails.getUnits();
        double stockPrice=stockDetails.getStockPrice();
        double brokerageFee=stockDetails.getBrokerageFee();
        double totalPrice=stockDetails.getTotalPrice();
        
        if(units<500){
        	brokerageFee=0.1*stockPrice;
        }
        else{
              
        	brokerageFee=0.15*stockPrice;
        }
        stockDetails.setBrokerageFee(brokerageFee);
        totalPrice=(brokerageFee+stockPrice)*units;
        stockDetails.setTotalPrice(totalPrice);
        return stockDetailsRepository.save(stockDetails);

	}

}
