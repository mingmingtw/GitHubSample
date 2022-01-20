package com.act.model;

import java.io.Serializable;
import java.util.Arrays;

public class ActivityComplaintsVO implements Serializable {
	private Integer actcId; //檢舉單編號
	private Integer actcActId; //檢舉活動編號
	private Integer actcMemId; //檢舉會員便號
	private String actcContent; //檢舉內容
	private Integer actcResult; //審核結果
	private byte[] actcPhoto; //檢舉圖片
	
	public ActivityComplaintsVO() {

	}

	public ActivityComplaintsVO(Integer actcId, Integer actcActId, Integer actcMemId, String actcContent, Integer actcResult,
			byte[] actcPhoto) {
		super();
		this.actcId = actcId;
		this.actcActId = actcActId;
		this.actcMemId = actcMemId;
		this.actcContent = actcContent;
		this.actcResult = actcResult;
		this.actcPhoto = actcPhoto;
	}

	public Integer getActcId() {
		return actcId;
	}

	public void setActcId(Integer actcId) {
		this.actcId = actcId;
	}

	public Integer getActcActId() {
		return actcActId;
	}

	public void setActcActId(Integer actcActId) {
		this.actcActId = actcActId;
	}

	public Integer getActcMemId() {
		return actcMemId;
	}

	public void setActcMemId(Integer actcMemId) {
		this.actcMemId = actcMemId;
	}

	public String getActcContent() {
		return actcContent;
	}

	public void setActcContent(String actcContent) {
		this.actcContent = actcContent;
	}

	public Integer getActcResult() {
		return actcResult;
	}

	public void setActcResult(Integer actcResult) {
		this.actcResult = actcResult;
	}

	public byte[] getActcPhoto() {
		return actcPhoto;
	}

	public void setActcPhoto(byte[] actcPhoto) {
		this.actcPhoto = actcPhoto;
	}

	@Override
	public String toString() {
		return "ActivityComplaintsVO [actcId=" + actcId + ", actcActId=" + actcActId + ", actcMemId=" + actcMemId
				+ ", actcContent=" + actcContent + ", actcResult=" + actcResult + ", actcPhoto="
				+ Arrays.toString(actcPhoto) + "]";
	}
	
}
