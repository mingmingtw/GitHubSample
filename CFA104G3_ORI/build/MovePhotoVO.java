package com.all.model;

public class MovePhotoVO {
	private Integer mopId;
	private Integer mopMsId;
	private byte[] mopPhoto;
	
	public MovePhotoVO() {
	}
	
	public Integer getMopId() {
		return mopId;
	}
	public void setMopId(Integer mopId) {
		this.mopId = mopId;
	}
	public Integer getMopMsId() {
		return mopMsId;
	}
	public void setMopMsId(Integer mopMsId) {
		this.mopMsId = mopMsId;
	}
	public byte[] getMopPhoto() {
		return mopPhoto;
	}
	public void setMopPhoto(byte[] mopPhoto) {
		this.mopPhoto = mopPhoto;
	}
	
}
