package com.product.model;

import java.io.Serializable;

public class ProductVO implements Serializable{
	private Integer prodId;
	private Integer prodMemId;
	private Integer prodType;
	private String prodDesc;
	private Integer prodPrice;
	private String prodName;
	private java.sql.Date prodUptime;
	private String prodLoc;
	private Integer prodStatus;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public Integer getProdMemId() {
		return prodMemId;
	}
	public void setProdMemId(Integer prodMemId) {
		this.prodMemId = prodMemId;
	}
	public Integer getProdType() {
		return prodType;
	}
	public void setProdType(Integer prodType) {
		this.prodType = prodType;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public Integer getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Integer prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public java.sql.Date getProdUptime() {
		return prodUptime;
	}
	public void setProdUptime(java.sql.Date prodUptime) {
		this.prodUptime = prodUptime;
	}
	public String getProdLoc() {
		return prodLoc;
	}
	public void setProdLoc(String prodLoc) {
		this.prodLoc = prodLoc;
	}
	public Integer getProdStatus() {
		return prodStatus;
	}
	public void setProdStatus(Integer prodStatus) {
		this.prodStatus = prodStatus;
	}
	
	
	
}
