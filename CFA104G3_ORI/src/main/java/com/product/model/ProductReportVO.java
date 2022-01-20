package com.product.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

public class ProductReportVO implements Serializable{
	private Integer productId;
	private Integer memberId;
	private String content;
	private Timestamp date;
	private byte[] photo;
	private Integer status;
	
	public ProductReportVO() {
	}

	public ProductReportVO(Integer productId, Integer memberId, String content, Timestamp date, byte[] photo,
			Integer status) {
		this.productId = productId;
		this.memberId = memberId;
		this.content = content;
		this.date = date;
		this.photo = photo;
		this.status = status;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductReportVO [productId=" + productId + ", memberId=" + memberId + ", content=" + content + ", date="
				+ date + ", photo=" + Arrays.toString(photo) + ", status=" + status + "]";
	}
}
