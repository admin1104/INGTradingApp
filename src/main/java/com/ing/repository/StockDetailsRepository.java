package com.ing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.StockDetails;

@Repository
public interface StockDetailsRepository extends JpaRepository<StockDetails, Long>{
	
	public List<StockDetails> findByUserId(long userId);

}
