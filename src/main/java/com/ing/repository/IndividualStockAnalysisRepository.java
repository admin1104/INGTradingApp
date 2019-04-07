package com.ing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ing.dto.DailyStockAnalyticsResponse;
import com.ing.model.IndividualStockAnalysisModel;

@Repository
public interface IndividualStockAnalysisRepository extends JpaRepository<IndividualStockAnalysisModel, String>{
	
	public List<IndividualStockAnalysisModel> findByStockName(String stockName);
	
	@Query(value="select  sum(units) from ingtradedb.stock_details s "
			   + "where purchase_date > DATE_SUB(CURRENT_TIMESTAMP(), INTERVAL 1 HOUR) and "
			   + "stock_name= ?1" , nativeQuery = true)
	public Integer lastHourCount(String stockName);
}
