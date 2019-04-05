package com.ing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock_details")
public class StockDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stock_details_id")
	private Long stockDetailsId;
	
	@Column(name="stock_Name")
	private String stockName;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="units")
	private int units;
	
	@Column(name="stock_price")
	private double stockPrice;
	
	@Column(name="brokerage_fee")
	private double brokerage_fee;
	
	@Column(name="total_price")
	private double totalPrice;
	
	
	
	public StockDetails() {
		
	}


	public Long getStockDetailsId() {
		return stockDetailsId;
	}


	public void setStockDetailsId(Long stockDetailsId) {
		this.stockDetailsId = stockDetailsId;
	}


	
	public String getStockName() {
		return stockName;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public int getUnits() {
		return units;
	}



	public void setUnits(int units) {
		this.units = units;
	}



	public double getStockPrice() {
		return stockPrice;
	}



	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}



	public double getBrokerage_fee() {
		return brokerage_fee;
	}



	public void setBrokerage_fee(double brokerage_fee) {
		this.brokerage_fee = brokerage_fee;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

		
	
}
