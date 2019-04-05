package com.ing.dto;

import java.util.Date;


public class ReviewOrderResponse {
	
	private long userId;
	private String userName;
	private long stockId;
	private String stockName;
	private double stockPrice;
	private Date purchaseDate;
	private int units;
	private double brokerageFee;
	private double totalPrice;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getStockId() {
		return stockId;
	}
	public void setStockId(long stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
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
	public ReviewOrderResponse(long userId, String userName, long stockId, String stockName, double stockPrice,
			Date purchaseDate, int units, double brokerageFee, double totalPrice) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.purchaseDate = purchaseDate;
		this.units = units;
		this.brokerageFee = brokerageFee;
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "PurchaseResponse [userId=" + userId + ", userName=" + userName + ", stockId=" + stockId + ", stockName="
				+ stockName + ", stockPrice=" + stockPrice + ", purchaseDate=" + purchaseDate + ", units=" + units
				+ ", brokerageFee=" + brokerageFee + ", totalPrice=" + totalPrice + "]";
	}
	public ReviewOrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
