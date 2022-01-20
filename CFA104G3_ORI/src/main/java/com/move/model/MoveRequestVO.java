package com.move.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class MoveRequestVO implements Serializable {
	private Integer id;
	private Integer memberId;
	private String fromAddress;
	private String toAddress;
	private Timestamp evauateDate;
	private String item;
	private Integer evauatePrice;
	private Timestamp moveDate;
	private Integer evaluateType;
	private Timestamp requestDate;
	private String status;
	private Boolean handled;

	public MoveRequestVO() {
	}

	public MoveRequestVO(Integer id, Integer memberId, String fromAddress, String toAddress, Timestamp evauateDate,
			String item, Integer evauatePrice, Timestamp moveDate, Integer evaluateType, Timestamp requestDate, String status,
			Boolean handled) {
		this.id = id;
		this.memberId = memberId;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.evauateDate = evauateDate;
		this.item = item;
		this.evauatePrice = evauatePrice;
		this.moveDate = moveDate;
		this.evaluateType = evaluateType;
		this.requestDate = requestDate;
		this.status = status;
		this.handled = handled;
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

	public Timestamp getEvauateDate() {
		return evauateDate;
	}

	public void setEvauateDate(Timestamp evauateDate) {
		this.evauateDate = evauateDate;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getEvauatePrice() {
		return evauatePrice;
	}

	public void setEvauatePrice(Integer evauatePrice) {
		this.evauatePrice = evauatePrice;
	}

	public Timestamp getMoveDate() {
		return moveDate;
	}

	public void setMoveDate(Timestamp moveDate) {
		this.moveDate = moveDate;
	}

	public Integer getEvaluateType() {
		return evaluateType;
	}

	public void setEvaluateType(Integer evaluateType) {
		this.evaluateType = evaluateType;
	}

	public Timestamp getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Timestamp requestDate) {
		this.requestDate = requestDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getHandled() {
		return handled;
	}

	public void setHandled(Boolean handled) {
		this.handled = handled;
	}

	@Override
	public String toString() {
		return "MoveRequestVO [id=" + id + ", memberId=" + memberId + ", fromAddress=" + fromAddress + ", toAddress="
				+ toAddress + ", evauateDate=" + evauateDate + ", item=" + item + ", evauatePrice=" + evauatePrice
				+ ", moveDate=" + moveDate + ", evaluateType=" + evaluateType + ", requestDate=" + requestDate
				+ ", status=" + status + ", handled=" + handled + "]";
	}
}
