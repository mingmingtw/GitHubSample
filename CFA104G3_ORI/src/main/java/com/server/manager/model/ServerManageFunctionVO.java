package com.server.manager.model;

import java.io.Serializable;

public class ServerManageFunctionVO implements Serializable{
	private Integer smgeFuncId;
	private String smgeFunc;
	public Integer getSmgeFuncId() {
		return smgeFuncId;
	}
	public void setSmgeFuncId(Integer smgeFuncId) {
		this.smgeFuncId = smgeFuncId;
	}
	public String getSmgeFunc() {
		return smgeFunc;
	}
	public void setSmgeFunc(String smgeFunc) {
		this.smgeFunc = smgeFunc;
	}
	
	
	
}
