package com.activity.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class ActivityQuestionVO implements Serializable {
	private Integer id;
	private Integer activityId;
	private Integer memberId;
	private String problem;
	private String reply;
	private Timestamp problemDate;
	private Timestamp replyDate;

	public ActivityQuestionVO() {
	}

	public ActivityQuestionVO(Integer id, Integer activityId, Integer memberId, String problem, String reply,
			Timestamp problemDate, Timestamp replyDate) {
		this.id = id;
		this.activityId = activityId;
		this.memberId = memberId;
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

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
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
		return "ActivityQuestionVO [id=" + id + ", activityId=" + activityId + ", memberId=" + memberId + ", problem="
				+ problem + ", reply=" + reply + ", problemDate=" + problemDate + ", replyDate=" + replyDate + "]";
	}
}
