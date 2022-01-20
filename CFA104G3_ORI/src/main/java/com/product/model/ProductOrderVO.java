package com.product.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class ProductOrderVO implements Serializable {
	private Integer id;
	private Integer productId;
	private Integer customerMemberId;
	private Integer sellerMemberId;
	private String productName;
	private String phone;
	private String address;
	private Timestamp date;
	private Integer amountOfProduct;
	private Integer status;
	private Integer amountOfPrice;

	public ProductOrderVO() {
	}

	public ProductOrderVO(Integer id, Integer productId, Integer customerMemberId, Integer sellerMemberId,
			String productName, String phone, String address, Timestamp date, Integer amountOfProduct, Integer status,
			Integer amountOfPrice) {
		this.id = id;
		this.productId = productId;
		this.customerMemberId = customerMemberId;
		this.sellerMemberId = sellerMemberId;
		this.productName = productName;
		this.phone = phone;
		this.address = address;
		this.date = date;
		this.amountOfProduct = amountOfProduct;
		this.status = status;
		this.amountOfPrice = amountOfPrice;
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

	public Integer getCustomerMemberId() {
		return customerMemberId;
	}

	public void setCustomerMemberId(Integer customerMemberId) {
		this.customerMemberId = customerMemberId;
	}

	public Integer getSellerMemberId() {
		return sellerMemberId;
	}

	public void setSellerMemberId(Integer sellerMemberId) {
		this.sellerMemberId = sellerMemberId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getAmountOfProduct() {
		return amountOfProduct;
	}

	public void setAmountOfProduct(Integer amountOfProduct) {
		this.amountOfProduct = amountOfProduct;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAmountOfPrice() {
		return amountOfPrice;
	}

	public void setAmountOfPrice(Integer amountOfPrice) {
		this.amountOfPrice = amountOfPrice;
	}

	@Override
	public String toString() {
		return "ProductOrderVO [id=" + id + ", productId=" + productId + ", customerMemberId=" + customerMemberId
				+ ", sellerMemberId=" + sellerMemberId + ", productName=" + productName + ", phone=" + phone
				+ ", address=" + address + ", date=" + date + ", amountOfProduct=" + amountOfProduct + ", status="
				+ status + ", amountOfPrice=" + amountOfPrice + "]";
	}
}
