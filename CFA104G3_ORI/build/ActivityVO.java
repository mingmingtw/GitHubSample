package com.act.model;

import java.io.Serializable;
import java.sql.Date;

public class ActivityVO implements Serializable {
	private Integer actId; //活動編號
	private Integer actOrganizerMemId; //主辦會員編號
	private Integer actType; //主辦會員編號
	private String actName; //活動名稱
	private String actContent; //活動內容
	private Date actLaunchtime; //活動建立時間
	private Date actApplyStarttime; //報名開始時間
	private Date actApplyEndtime; //報名截止時間
	private String actLocation; //活動地點
	private Integer actCost; //活動費用
	private Integer actApplyMemExisting; //目前報名人數
	private Integer actMaxMem; //活動人數上限
	private Integer actMinMem; //活動人數下限
	private Date actStarttime; //活動開始時間
	private Date actEndtime; //活動結束時間
	private Integer actStatus; //活動狀態
	
	public ActivityVO() {

	}

	public ActivityVO(Integer actId, Integer actOrganizerMemId, Integer actType, String actName, String actContent,
			Date actLaunchtime, Date actApplyStarttime, Date actApplyEndtime, String actLocation, Integer actCost,
			Integer actApplyMemExisting, Integer actMaxMem, Integer actMinMem, Date actStarttime, Date actEndtime,
			Integer actStatus) {
		super();
		this.actId = actId;
		this.actOrganizerMemId = actOrganizerMemId;
		this.actType = actType;
		this.actName = actName;
		this.actContent = actContent;
		this.actLaunchtime = actLaunchtime;
		this.actApplyStarttime = actApplyStarttime;
		this.actApplyEndtime = actApplyEndtime;
		this.actLocation = actLocation;
		this.actCost = actCost;
		this.actApplyMemExisting = actApplyMemExisting;
		this.actMaxMem = actMaxMem;
		this.actMinMem = actMinMem;
		this.actStarttime = actStarttime;
		this.actEndtime = actEndtime;
		this.actStatus = actStatus;
	}

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public Integer getActOrganizerMemId() {
		return actOrganizerMemId;
	}

	public void setActOrganizerMemId(Integer actOrganizerMemId) {
		this.actOrganizerMemId = actOrganizerMemId;
	}

	public Integer getActType() {
		return actType;
	}

	public void setActType(Integer actType) {
		this.actType = actType;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getActContent() {
		return actContent;
	}

	public void setActContent(String actContent) {
		this.actContent = actContent;
	}

	public Date getActLaunchtime() {
		return actLaunchtime;
	}

	public void setActLaunchtime(Date actLaunchtime) {
		this.actLaunchtime = actLaunchtime;
	}

	public Date getActApplyStarttime() {
		return actApplyStarttime;
	}

	public void setActApplyStarttime(Date actApplyStarttime) {
		this.actApplyStarttime = actApplyStarttime;
	}

	public Date getActApplyEndtime() {
		return actApplyEndtime;
	}

	public void setActApplyEndtime(Date actApplyEndtime) {
		this.actApplyEndtime = actApplyEndtime;
	}

	public String getActLocation() {
		return actLocation;
	}

	public void setActLocation(String actLocation) {
		this.actLocation = actLocation;
	}

	public Integer getActCost() {
		return actCost;
	}

	public void setActCost(Integer actCost) {
		this.actCost = actCost;
	}

	public Integer getActApplyMemExisting() {
		return actApplyMemExisting;
	}

	public void setActApplyMemExisting(Integer actApplyMemExisting) {
		this.actApplyMemExisting = actApplyMemExisting;
	}

	public Integer getActMaxMem() {
		return actMaxMem;
	}

	public void setActMaxMem(Integer actMaxMem) {
		this.actMaxMem = actMaxMem;
	}

	public Integer getActMinMem() {
		return actMinMem;
	}

	public void setActMinMem(Integer actMinMem) {
		this.actMinMem = actMinMem;
	}

	public Date getActStarttime() {
		return actStarttime;
	}

	public void setActStarttime(Date actStarttime) {
		this.actStarttime = actStarttime;
	}

	public Date getActEndtime() {
		return actEndtime;
	}

	public void setActEndtime(Date actEndtime) {
		this.actEndtime = actEndtime;
	}

	public Integer getActStatus() {
		return actStatus;
	}

	public void setActStatus(Integer actStatus) {
		this.actStatus = actStatus;
	}

	@Override
	public String toString() {
		return "ActivityVO [actId=" + actId + ", actOrganizerMemId=" + actOrganizerMemId + ", actType=" + actType
				+ ", actName=" + actName + ", actContent=" + actContent + ", actLaunchtime=" + actLaunchtime
				+ ", actApplyStarttime=" + actApplyStarttime + ", actApplyEndtime=" + actApplyEndtime + ", actLocation="
				+ actLocation + ", actCost=" + actCost + ", actApplyMemExisting=" + actApplyMemExisting + ", actMaxMem="
				+ actMaxMem + ", actMinMem=" + actMinMem + ", actStarttime=" + actStarttime + ", actEndtime="
				+ actEndtime + ", actStatus=" + actStatus + "]";
	}
	
	
	
}
