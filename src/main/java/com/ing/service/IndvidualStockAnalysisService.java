package com.ing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ing.dto.DailyStockAnalyticsResponse;
import com.ing.model.IndividualStockAnalysisModel;

@Service
public interface IndvidualStockAnalysisService {
	
	
	public List<IndividualStockAnalysisModel> getStockAnalysis(String stockName);
	
	public Integer lastHourCount(String stockName);
}
