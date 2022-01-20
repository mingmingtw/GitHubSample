package com.move.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class MoveOrderVO implements Serializable {
	private Integer id;
	private Integer memberId;
	private String customer;
	private String phone;
	private String fromAddress;
	private String toAddress;
	private Timestamp moveDate;
	private Integer amountFirst;
	private Integer deposit;
	private Integer amountTotal;
	private String comment;
	private Timestamp orderDate;
	private Integer status;

	public MoveOrderVO() {
	}

	public MoveOrderVO(Integer id, Integer memberId, String customer, String phone, String fromAddress,
			String toAddress, Timestamp moveDate, Integer amountFirst, Integer deposit, Integer amountTotal, String comment,
			Timestamp orderDate, Integer status) {
		this.id = id;
		this.memberId = memberId;
		this.customer = customer;
		this.phone = phone;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.moveDate = moveDate;
		this.amountFirst = amountFirst;
		this.deposit = deposit;
		this.amountTotal = amountTotal;
		this.comment = comment;
		this.orderDate = orderDate;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public Timestamp getMoveDate() {
		return moveDate;
	}

	public void setMoveDate(Timestamp moveDate) {
		this.moveDate = moveDate;
	}

	public Integer getAmountFirst() {
		return amountFirst;
	}

	public void setAmountFirst(Integer amountFirst) {
		this.amountFirst = amountFirst;
	}

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public Integer getAmountTotal() {
		return amountTotal;
	}

	public void setAmountTotal(Integer amountTotal) {
		this.amountTotal = amountTotal;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MoveOrderVO [id=" + id + ", memberId=" + memberId + ", customer=" + customer + ", phone=" + phone
				+ ", fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", moveDate=" + moveDate
				+ ", amountFirst=" + amountFirst + ", deposit=" + deposit + ", amountTotal=" + amountTotal
				+ ", comment=" + comment + ", orderDate=" + orderDate + ", status=" + status + "]";
	}
}
