package com.converter.Runner;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="currency")
public class Currency {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String cname;
private String ctype;
private int cvalue;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCvalue() {
	return cvalue;
}
public void setCvalue(int cvalue) {
	this.cvalue = cvalue;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}

public Currency(int id, String cname, String ctype, int cvalue) {
	super();
	this.id = id;
	this.cname = cname;
	this.ctype = ctype;
	this.cvalue = cvalue;
}
public Currency() {
	super();
	
}
}
