package com.act.model;

import java.io.Serializable;
import java.sql.Date;

public class ActivityQuestionVO implements Serializable {
	private Integer actqId; //發問編號
	private Integer actqActId; //問答活動編號
	private Integer actqMemId; //發問會員編號
	private String actqPromContent; //問題
	private String actqRepContent; //答覆
	private Date actqPromDate; //問題時間
	private Date actqRepDate; //答覆時間
	
	public ActivityQuestionVO() {

	}

	public ActivityQuestionVO(Integer actqId, Integer actqActId, Integer actqMemId, String actqPromContent,
			String actqRepContent, Date actqPromDate, Date actqRepDate) {
		super();
		this.actqId = actqId;
		this.actqActId = actqActId;
		this.actqMemId = actqMemId;
		this.actqPromContent = actqPromContent;
		this.actqRepContent = actqRepContent;
		this.actqPromDate = actqPromDate;
		this.actqRepDate = actqRepDate;
	}

	public Integer getActqId() {
		return actqId;
	}

	public void setActqId(Integer actqId) {
		this.actqId = actqId;
	}

	public Integer getActqActId() {
		return actqActId;
	}

	public void setActqActId(Integer actqActId) {
		this.actqActId = actqActId;
	}

	public Integer getActqMemId() {
		return actqMemId;
	}

	public void setActqMemId(Integer actqMemId) {
		this.actqMemId = actqMemId;
	}

	public String getActqPromContent() {
		return actqPromContent;
	}

	public void setActqPromContent(String actqPromContent) {
		this.actqPromContent = actqPromContent;
	}

	public String getActqRepContent() {
		return actqRepContent;
	}

	public void setActqRepContent(String actqRepContent) {
		this.actqRepContent = actqRepContent;
	}

	public Date getActqPromDate() {
		return actqPromDate;
	}

	public void setActqPromDate(Date actqPromDate) {
		this.actqPromDate = actqPromDate;
	}

	public Date getActqRepDate() {
		return actqRepDate;
	}

	public void setActqRepDate(Date actqRepDate) {
		this.actqRepDate = actqRepDate;
	}

	@Override
	public String toString() {
		return "ActivityQuestionVO [actqId=" + actqId + ", actqActId=" + actqActId + ", actqMemId=" + actqMemId
				+ ", actqPromContent=" + actqPromContent + ", actqRepContent=" + actqRepContent + ", actqPromDate="
				+ actqPromDate + ", actqRepDate=" + actqRepDate + "]";
	}
	
	
	
}
