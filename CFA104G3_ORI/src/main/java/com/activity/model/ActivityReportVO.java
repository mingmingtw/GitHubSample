package com.activity.model;

import java.io.Serializable;
import java.util.Arrays;

public class ActivityReportVO implements Serializable {
	private Integer id;
	private Integer activityId;
	private Integer memberId;
	private String content;
	private Integer status;
	private byte[] photo;

	public ActivityReportVO() {
	}

	public ActivityReportVO(Integer id, Integer activityId, Integer memberId, String content, Integer status,
			byte[] photo) {
		this.id = id;
		this.activityId = activityId;
		this.memberId = memberId;
		this.content = content;
		this.status = status;
		this.photo = photo;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "ActivityComplaintVO [id=" + id + ", activityId=" + activityId + ", memberId=" + memberId + ", content="
				+ content + ", status=" + status + ", photo=" + Arrays.toString(photo) + "]";
	}
}
