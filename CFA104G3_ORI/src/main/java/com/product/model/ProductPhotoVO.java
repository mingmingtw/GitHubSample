package com.product.model;

import java.io.Serializable;
import java.util.Arrays;

public class ProductPhotoVO implements Serializable {
	private Integer id;
	private Integer productId;
	private byte[] photo;

	public ProductPhotoVO() {
	}

	public ProductPhotoVO(Integer id, Integer productId, byte[] photo) {
		this.id = id;
		this.productId = productId;
		this.photo = photo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "ProductPhotoVO [id=" + id + ", productId=" + productId + ", photo=" + Arrays.toString(photo) + "]";
	}
}
