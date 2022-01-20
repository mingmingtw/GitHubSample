package com.activity.model;

import java.io.Serializable;

public class ActivityAttendedVO implements Serializable {
	private Integer memberId;
	private Integer activityId;
	private String comment;
	private String note;

	public ActivityAttendedVO() {
	}

	public ActivityAttendedVO(Integer memberId, Integer activityId, String comment, String note) {
		this.memberId = memberId;
		this.activityId = activityId;
		this.comment = comment;
		this.note = note;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "ActivityAttendedVO [memberId=" + memberId + ", activityId=" + activityId + ", comment=" + comment
				+ ", note=" + note + "]";
	}
}
