package com.all.model;

import java.sql.Date;

public class MoveRequestVO {
	private Integer msId;
	private Integer msMemId;
	private String msFromAddress;
	private String msToAddress;
	private Date msEvaTime;
	private String msObject;
	private Integer msEvaPrice;
	private Date msMoveTime;
	private Integer msEvaluate;
	private Date msDate;
	private String msStatus;
	private Boolean msHandle;
	
	
	public MoveRequestVO() {
	}
	public Integer getMsId() {
		return msId;
	}
	public void setMsId(Integer msId) {
		this.msId = msId;
	}
	public Integer getMsMemId() {
		return msMemId;
	}
	public void setMsMemId(Integer msMemId) {
		this.msMemId = msMemId;
	}
	public String getMsFromAddress() {
		return msFromAddress;
	}
	public void setMsFromAddress(String msFromAddress) {
		this.msFromAddress = msFromAddress;
	}
	public String getMsToAddress() {
		return msToAddress;
	}
	public void setMsToAddress(String msToAddress) {
		this.msToAddress = msToAddress;
	}
	public Date getMsEvaTime() {
		return msEvaTime;
	}
	public void setMsEvaTime(Date msEvaTime) {
		this.msEvaTime = msEvaTime;
	}
	public String getMsObject() {
		return msObject;
	}
	public void setMsObject(String msObject) {
		this.msObject = msObject;
	}
	public Integer getMsEvaPrice() {
		return msEvaPrice;
	}
	public void setMsEvaPrice(Integer msEvaPrice) {
		this.msEvaPrice = msEvaPrice;
	}
	public Date getMsMoveTime() {
		return msMoveTime;
	}
	public void setMsMoveTime(Date msMoveTime) {
		this.msMoveTime = msMoveTime;
	}
	public Integer getMsEvaluate() {
		return msEvaluate;
	}
	public void setMsEvaluate(Integer msEvaluate) {
		this.msEvaluate = msEvaluate;
	}
	public Date getMsDate() {
		return msDate;
	}
	public void setMsDate(Date msDate) {
		this.msDate = msDate;
	}
	public String getMsStatus() {
		return msStatus;
	}
	public void setMsStatus(String msStatus) {
		this.msStatus = msStatus;
	}
	public Boolean getMsHandle() {
		return msHandle;
	}
	public void setMsHandle(Boolean msHandle) {
		this.msHandle = msHandle;
	}
	
}
