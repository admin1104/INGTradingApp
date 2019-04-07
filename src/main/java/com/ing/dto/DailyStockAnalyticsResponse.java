package com.ing.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class DailyStockAnalyticsResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String stringName;
	private String units;
	
	public String getStringName() {
		return stringName;
	}
	public void setStringName(String stringName) {
		this.stringName = stringName;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public DailyStockAnalyticsResponse(String stringName, String units) {
		super();
		this.stringName = stringName;
		this.units = units;
	}
	@Override
	public String toString() {
		return "DailyStockAnalyticsResponse [stringName=" + stringName + ", units=" + units + "]";
	}
	public DailyStockAnalyticsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
