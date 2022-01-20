package com.product.model;

import java.io.Serializable;

public class ProductCollectionVO implements Serializable {
	private Integer memberId;
	private Integer productId;

	public ProductCollectionVO() {
	}

	public ProductCollectionVO(Integer memberId, Integer productId) {
		this.memberId = memberId;
		this.productId = productId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductCollectionVO [memberId=" + memberId + ", productId=" + productId + "]";
	}
}
