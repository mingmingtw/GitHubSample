package com.all.model;

import java.sql.Date;

public class ProductOrderVO {
	private Integer prodoId;
	private Integer prodoProdId;
	private Integer prodomBuyId;
	private Integer prodomSellId;
	private String prodoName;
	private String prodoMobile;
	private String prodoAddress;
	private Date prodoDate;
	private Integer prodoAmount;
	private Integer prodoStatus;
	private Integer prodoSum;

	public ProductOrderVO() {
	}

	public Integer getProdoId() {
		return prodoId;
	}

	public void setProdoId(Integer prodoId) {
		this.prodoId = prodoId;
	}

	public Integer getProdoProdId() {
		return prodoProdId;
	}

	public void setProdoProdId(Integer prodoProdId) {
		this.prodoProdId = prodoProdId;
	}

	public Integer getProdomBuyId() {
		return prodomBuyId;
	}

	public void setProdomBuyId(Integer prodomBuyId) {
		this.prodomBuyId = prodomBuyId;
	}

	public Integer getProdomSellId() {
		return prodomSellId;
	}

	public void setProdomSellId(Integer prodomSellId) {
		this.prodomSellId = prodomSellId;
	}

	public String getProdoName() {
		return prodoName;
	}

	public void setProdoName(String prodoName) {
		this.prodoName = prodoName;
	}

	public String getProdoMobile() {
		return prodoMobile;
	}

	public void setProdoMobile(String prodoMobile) {
		this.prodoMobile = prodoMobile;
	}

	public String getProdoAddress() {
		return prodoAddress;
	}

	public void setProdoAddress(String prodoAddress) {
		this.prodoAddress = prodoAddress;
	}

	public Date getProdoDate() {
		return prodoDate;
	}

	public void setProdoDate(Date prodoDate) {
		this.prodoDate = prodoDate;
	}

	public Integer getProdoAmount() {
		return prodoAmount;
	}

	public void setProdoAmount(Integer prodoAmount) {
		this.prodoAmount = prodoAmount;
	}

	public Integer getProdoStatus() {
		return prodoStatus;
	}

	public void setProdoStatus(Integer prodoStatus) {
		this.prodoStatus = prodoStatus;
	}

	public Integer getProdoSum() {
		return prodoSum;
	}

	public void setProdoSum(Integer prodoSum) {
		this.prodoSum = prodoSum;
	}

}
