package com.converter.Runner.Try;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table
public class CCindia {
	@Id
	private int id;
	private String city;
	private String currencycode;
	private double value;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public CCindia(int id, String city, String currencycode, double value) {
		super();
		this.id = id;
		this.city = city;
		this.currencycode = currencycode;
		this.value = value;
	}
	public CCindia() {
		super();
	}
	
}
