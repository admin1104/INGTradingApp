package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.StockDetails;

@Repository
public interface StockDetailsRepository extends JpaRepository<StockDetails, Long>{

}
