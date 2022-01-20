package com.all.model;

import java.sql.Date;

public class MoveOrderVO {
	private Integer osId;
	private Integer osMemId;
	private String osName;
	private String osPhone;
	private String osFromAddress;
	private String osToAddress;
	private Date osMoveTime;
	private Integer osAmountFirst;
	private Integer osDeposit;
	private Integer osAmountTotal;
	private String osComment;
	private Date osDate;
	private Integer osStatus;
	
	
	public MoveOrderVO() {
	}
	public Integer getOsId() {
		return osId;
	}
	public void setOsId(Integer osId) {
		this.osId = osId;
	}
	public Integer getOsMemId() {
		return osMemId;
	}
	public void setOsMemId(Integer osMemId) {
		this.osMemId = osMemId;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getOsPhone() {
		return osPhone;
	}
	public void setOsPhone(String osPhone) {
		this.osPhone = osPhone;
	}
	public String getOsFromAddress() {
		return osFromAddress;
	}
	public void setOsFromAddress(String osFromAddress) {
		this.osFromAddress = osFromAddress;
	}
	public String getOsToAddress() {
		return osToAddress;
	}
	public void setOsToAddress(String osToAddress) {
		this.osToAddress = osToAddress;
	}
	public Date getOsMoveTime() {
		return osMoveTime;
	}
	public void setOsMoveTime(Date osMoveTime) {
		this.osMoveTime = osMoveTime;
	}
	public Integer getOsAmountFirst() {
		return osAmountFirst;
	}
	public void setOsAmountFirst(Integer osAmountFirst) {
		this.osAmountFirst = osAmountFirst;
	}
	public Integer getOsDeposit() {
		return osDeposit;
	}
	public void setOsDeposit(Integer osDeposit) {
		this.osDeposit = osDeposit;
	}
	public Integer getOsAmountTotal() {
		return osAmountTotal;
	}
	public void setOsAmountTotal(Integer osAmountTotal) {
		this.osAmountTotal = osAmountTotal;
	}
	public String getOsComment() {
		return osComment;
	}
	public void setOsComment(String osComment) {
		this.osComment = osComment;
	}
	public Date getOsDate() {
		return osDate;
	}
	public void setOsDate(Date osDate) {
		this.osDate = osDate;
	}
	public Integer getOsStatus() {
		return osStatus;
	}
	public void setOsStatus(Integer osStatus) {
		this.osStatus = osStatus;
	}
	
}
