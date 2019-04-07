package com.ing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="stock_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stockId;
	
	@Column(name="stock_name")
	private String stockName;
	
	@Column(name="description")
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Stock(long stockId, String stockName, String description) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.description = description;
	}

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
