package com.act.model;

import java.io.Serializable;

public class ActivityAttendVO implements Serializable {
	private Integer actaMemId; //參與會員編號
	private Integer actaActId; //參與活動編號
	private String actaRelpyContent; //評論內容
	private String actaContentNote; //活動內容備註
	
	
	public ActivityAttendVO() {
		
	}


	public ActivityAttendVO(Integer actaMemId, Integer actaActId, String actaRelpyContent, String actaContentNote) {
		super();
		this.actaMemId = actaMemId;
		this.actaActId = actaActId;
		this.actaRelpyContent = actaRelpyContent;
		this.actaContentNote = actaContentNote;
	}


	public Integer getActaMemId() {
		return actaMemId;
	}


	public void setActaMemId(Integer actaMemId) {
		this.actaMemId = actaMemId;
	}


	public Integer getActaActId() {
		return actaActId;
	}


	public void setActaActId(Integer actaActId) {
		this.actaActId = actaActId;
	}


	public String getActaRelpyContent() {
		return actaRelpyContent;
	}


	public void setActaRelpyContent(String actaRelpyContent) {
		this.actaRelpyContent = actaRelpyContent;
	}


	public String getActaContentNote() {
		return actaContentNote;
	}


	public void setActaContentNote(String actaContentNote) {
		this.actaContentNote = actaContentNote;
	}


	@Override
	public String toString() {
		return "ActivityAttendVO [actaMemId=" + actaMemId + ", actaActId=" + actaActId + ", actaRelpyContent="
				+ actaRelpyContent + ", actaContentNote=" + actaContentNote + "]";
	}
	
	
}
