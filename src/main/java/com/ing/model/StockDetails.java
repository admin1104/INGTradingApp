package com.ing.model;

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
	private Long id;
	private Long stock_id;
	private Long user_id;
	private int units;
	private double stock_price;
	private double brokerage_fee;
	private double total_price;
	
	
	
	public StockDetails() {
		
	}

	public StockDetails(Long id, Long stock_id, Long user_id, int units,
			double stock_price, double brokerage_fee, double total_price) {
		
		this.id = id;
		this.stock_id = stock_id;
		this.user_id = user_id;
		this.units = units;
		this.stock_price = stock_price;
		this.brokerage_fee = brokerage_fee;
		this.total_price = total_price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStock_id() {
		return stock_id;
	}
	public void setStock_id(Long stock_id) {
		this.stock_id = stock_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getStock_price() {
		return stock_price;
	}
	public void setStock_price(double stock_price) {
		this.stock_price = stock_price;
	}
	public double getBrokerage_fee() {
		return brokerage_fee;
	}
	public void setBrokerage_fee(double brokerage_fee) {
		this.brokerage_fee = brokerage_fee;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	@Override
	public String toString() {
		return "StockDetails [id=" + id + ", stock_id=" + stock_id
				+ ", user_id=" + user_id + ", units=" + units
				+ ", stock_price=" + stock_price + ", brokerage_fee="
				+ brokerage_fee + ", total_price=" + total_price + "]";
	}

	
	
}
