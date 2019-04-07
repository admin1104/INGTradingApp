package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.model.IndividualStockAnalysisModel;
import com.ing.repository.IndividualStockAnalysisRepository;

@Service
public class IndividualStockAnalysisServiceImpl implements IndvidualStockAnalysisService {
	
	@Autowired
	IndividualStockAnalysisRepository individualStockAnalysisRepository;
	
	@Override
	public List<IndividualStockAnalysisModel> getStockAnalysis(String stockName) {
		// TODO Auto-generated method stub
		
		return individualStockAnalysisRepository.findByStockName(stockName);
	}

	public Integer lastHourCount(String stockName){
		
		int count =	individualStockAnalysisRepository.lastHourCount(stockName);
	
		return count;
	}
}
