package com.all.model;

import java.io.Serializable;

public class ProductPhotoVO implements Serializable{
	private Integer prodPhId;
	private Integer prodPhProdId;
	private byte[] prodPhPhoto;
	
	public Integer getProdPhId() {
		return prodPhId;
	}
	public void setProdPhId(Integer prodPhId) {
		this.prodPhId = prodPhId;
	}
	public Integer getProdPhProdId() {
		return prodPhProdId;
	}
	public void setProdPhProdId(Integer prodPhProdId) {
		this.prodPhProdId = prodPhProdId;
	}
	public byte[] getProdPhPhoto() {
		return prodPhPhoto;
	}
	public void setProdPhPhoto(byte[] prodPhPhoto) {
		this.prodPhPhoto = prodPhPhoto;
	}
	
}
