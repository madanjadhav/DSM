package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addresnum;
	private String localarea;
	private String city;
	
	
	public int getAddresnum() {
		return addresnum;
	}
	public void setAddresnum(int addresnum) {
		this.addresnum = addresnum;
	}
	public String getLocalarea() {
		return localarea;
	}
	public void setLocalarea(String localarea) {
		this.localarea = localarea;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
