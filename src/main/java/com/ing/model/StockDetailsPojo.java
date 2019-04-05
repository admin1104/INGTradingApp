package com.ing.model;

public class StockDetailsPojo {

	private String stockName;
	private String  status;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "StockDetailsPojo [stockName=" + stockName + ", status="
				+ status + "]";
	}
	
	
	
}
