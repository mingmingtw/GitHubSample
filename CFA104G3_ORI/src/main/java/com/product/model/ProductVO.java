package com.product.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class ProductVO implements Serializable {
	private Integer id;
	private Integer sellerMemberId;
	private Integer type;
	private String description;
	private Integer price;
	private String name;
	private Timestamp launchedDate;
	private String location;
	private Integer status;

	public ProductVO() {
	}

	public ProductVO(Integer id, Integer sellerMemberId, Integer type, String description, Integer price, String name,
			Timestamp launchedDate, String location, Integer status) {
		this.id = id;
		this.sellerMemberId = sellerMemberId;
		this.type = type;
		this.description = description;
		this.price = price;
		this.name = name;
		this.launchedDate = launchedDate;
		this.location = location;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSellerMemberId() {
		return sellerMemberId;
	}

	public void setSellerMemberId(Integer sellerMemberId) {
		this.sellerMemberId = sellerMemberId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Timestamp launchedDate) {
		this.launchedDate = launchedDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", sellerMemberId=" + sellerMemberId + ", type=" + type + ", description="
				+ description + ", price=" + price + ", name=" + name + ", launchedDate=" + launchedDate + ", location="
				+ location + ", status=" + status + "]";
	}
}
