package com.act.model;

import java.io.Serializable;
import java.util.Arrays;

public class ActivityPhotoVO implements Serializable {
	private Integer actpId; //活動照片編號
	private Integer actpActId; //活動編號
	private byte[] actpPhoto; //活動照片
	
	public ActivityPhotoVO() {
		
	}

	public ActivityPhotoVO(Integer actpId, Integer actpActId, byte[] actpPhoto) {
		super();
		this.actpId = actpId;
		this.actpActId = actpActId;
		this.actpPhoto = actpPhoto;
	}

	public Integer getActpId() {
		return actpId;
	}

	public void setActpId(Integer actpId) {
		this.actpId = actpId;
	}

	public Integer getActpActId() {
		return actpActId;
	}

	public void setActpActId(Integer actpActId) {
		this.actpActId = actpActId;
	}

	public byte[] getActpPhoto() {
		return actpPhoto;
	}

	public void setActpPhoto(byte[] actpPhoto) {
		this.actpPhoto = actpPhoto;
	}

	@Override
	public String toString() {
		return "ActivityPhotoVO [actpId=" + actpId + ", actpActId=" + actpActId + ", actpPhoto="
				+ Arrays.toString(actpPhoto) + "]";
	}
	
	
	
}
