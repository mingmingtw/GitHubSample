package com.activity.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class ActivityVO implements Serializable {
	private Integer activityId;
	private Integer organizerMemberId;
	private Integer type;
	private String name;
	private String content;
	private Timestamp launchedDate;
	private Timestamp applyStartDate;
	private Timestamp applyEndDate;
	private String location;
	private Integer cost;
	private Integer applyMemberExisting;
	private Integer maxMember;
	private Integer minMember;
	private Timestamp startDate;
	private Timestamp endDate;
	private Integer status;

	public ActivityVO() {
	}

	public ActivityVO(Integer activityId, Integer organizerMemberId, Integer type, String name, String content,
			Timestamp launchDate, Timestamp applyStartDate, Timestamp applyEndDate, String location, Integer cost,
			Integer applyMemberExisting, Integer maxMember, Integer minMember, Timestamp startDate, Timestamp endDate,
			Integer status) {
		this.activityId = activityId;
		this.organizerMemberId = organizerMemberId;
		this.type = type;
		this.name = name;
		this.content = content;
		this.launchedDate = launchDate;
		this.applyStartDate = applyStartDate;
		this.applyEndDate = applyEndDate;
		this.location = location;
		this.cost = cost;
		this.applyMemberExisting = applyMemberExisting;
		this.maxMember = maxMember;
		this.minMember = minMember;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getOrganizerMemberId() {
		return organizerMemberId;
	}

	public void setOrganizerMemberId(Integer organizerMemberId) {
		this.organizerMemberId = organizerMemberId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getLaunchDate() {
		return launchedDate;
	}

	public void setLaunchDate(Timestamp launchDate) {
		this.launchedDate = launchDate;
	}

	public Timestamp getApplyStartDate() {
		return applyStartDate;
	}

	public void setApplyStartDate(Timestamp applyStartDate) {
		this.applyStartDate = applyStartDate;
	}

	public Timestamp getApplyEndDate() {
		return applyEndDate;
	}

	public void setApplyEndDate(Timestamp applyEndDate) {
		this.applyEndDate = applyEndDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getApplyMemberExisting() {
		return applyMemberExisting;
	}

	public void setApplyMemberExisting(Integer applyMemberExisting) {
		this.applyMemberExisting = applyMemberExisting;
	}

	public Integer getMaxMember() {
		return maxMember;
	}

	public void setMaxMember(Integer maxMember) {
		this.maxMember = maxMember;
	}

	public Integer getMinMember() {
		return minMember;
	}

	public void setMinMember(Integer minMember) {
		this.minMember = minMember;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ActivityVO [activityId=" + activityId + ", organizerMemberId=" + organizerMemberId + ", type=" + type
				+ ", name=" + name + ", content=" + content + ", launchDate=" + launchedDate + ", applyStartDate="
				+ applyStartDate + ", applyEndDate=" + applyEndDate + ", location=" + location + ", cost=" + cost
				+ ", applyMemberExisting=" + applyMemberExisting + ", maxMember=" + maxMember + ", minMember="
				+ minMember + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + "]";
	}
}
