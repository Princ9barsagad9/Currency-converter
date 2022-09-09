package com.converter.Runner;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CurrencyIndia {
	@Id
	private int id;
	private String Country;
	private String Currency;
	private String CurrencyCode;
	private double rvalue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	public double getRvalue() {
		return rvalue;
	}
	public void setRvalue(double rvalue) {
		this.rvalue = rvalue;
	}
	
	public CurrencyIndia(int id, String country, String currency, String currencyCode, double rvalue) {
		super();
		this.id = id;
		Country = country;
		Currency = currency;
		CurrencyCode = currencyCode;
		this.rvalue = rvalue;
	}
	public CurrencyIndia() {
		super();
	
	}
	
	
	
	
}
