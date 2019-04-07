package com.ing.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="stock_details")
public class StockDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private double brokerageFee;
	
	@Column(name="total_price")
	private double totalPrice;
	

	@Column(name="purchase_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;
	
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



	public double getBrokerageFee() {
		return brokerageFee;
	}



	public void setBrokerageFee(double brokerageFee) {
		this.brokerageFee = brokerageFee;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public StockDetails(Long stockDetailsId, String stockName, Long userId, int units, double stockPrice,
			double brokerageFee, double totalPrice, Date purchaseDate) {
		super();
		this.stockDetailsId = stockDetailsId;
		this.stockName = stockName;
		this.userId = userId;
		this.units = units;
		this.stockPrice = stockPrice;
		this.brokerageFee = brokerageFee;
		this.totalPrice = totalPrice;
		this.purchaseDate = purchaseDate;
	}

	
}
