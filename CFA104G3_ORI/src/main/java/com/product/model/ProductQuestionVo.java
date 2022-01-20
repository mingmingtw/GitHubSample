package com.product.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class ProductQuestionVo implements Serializable {
	private Integer id;
	private Integer memberId;
	private Integer productId;
	private String problem;
	private String reply;
	private Timestamp problemDate;
	private Timestamp replyDate;

	public ProductQuestionVo() {
	}

	public ProductQuestionVo(Integer id, Integer memberId, Integer productId, String problem, String reply,
			Timestamp problemDate, Timestamp replyDate) {
		this.id = id;
		this.memberId = memberId;
		this.productId = productId;
		this.problem = problem;
		this.reply = reply;
		this.problemDate = problemDate;
		this.replyDate = replyDate;
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

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Timestamp getProblemDate() {
		return problemDate;
	}

	public void setProblemDate(Timestamp problemDate) {
		this.problemDate = problemDate;
	}

	public Timestamp getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Timestamp replyDate) {
		this.replyDate = replyDate;
	}

	@Override
	public String toString() {
		return "ProductQuestionVo [id=" + id + ", memberId=" + memberId + ", productId=" + productId + ", problem="
				+ problem + ", reply=" + reply + ", problemDate=" + problemDate + ", replyDate=" + replyDate + "]";
	}
}
