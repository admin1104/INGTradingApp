package com.ing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ing.model.StockDetails;

@Repository
public interface StockDetailsRepository extends JpaRepository<StockDetails, Long>{
	
	public List<StockDetails> findByUserId(long userId);
	
	@Query(value="select sd.stock_name, SUM(sd.units) as units from stock_details sd where DATE(sd.purchase_date)=DATE(NOW()) group by sd.stock_name where purchase_date", nativeQuery = true)
	public List<Object[]> getDailyStockDetails();
	

}

