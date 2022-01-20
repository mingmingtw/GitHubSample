package com.server.manager.model;

import java.io.Serializable;

public class ServerManagerVO implements Serializable{
	private Integer smgrId;
	private String smgrEmail;
	private String smgrAccount;
	private String smgrPassword;
	private String smgrName;
	private String smgrPhone;
	private Integer smgrGender;
	private String smgrAddress;
	public Integer getSmgrId() {
		return smgrId;
	}
	public void setSmgrId(Integer smgrId) {
		this.smgrId = smgrId;
	}
	public String getSmgrEmail() {
		return smgrEmail;
	}
	public void setSmgrEmail(String smgrEmail) {
		this.smgrEmail = smgrEmail;
	}
	public String getSmgrAccount() {
		return smgrAccount;
	}
	public void setSmgrAccount(String smgrAccount) {
		this.smgrAccount = smgrAccount;
	}
	public String getSmgrPassword() {
		return smgrPassword;
	}
	public void setSmgrPassword(String smgrPassword) {
		this.smgrPassword = smgrPassword;
	}
	public String getSmgrName() {
		return smgrName;
	}
	public void setSmgrName(String smgrName) {
		this.smgrName = smgrName;
	}
	public String getSmgrPhone() {
		return smgrPhone;
	}
	public void setSmgrPhone(String smgrPhone) {
		this.smgrPhone = smgrPhone;
	}
	public Integer getSmgrGender() {
		return smgrGender;
	}
	public void setSmgrGender(Integer smgrGender) {
		this.smgrGender = smgrGender;
	}
	public String getSmgrAddress() {
		return smgrAddress;
	}
	public void setSmgrAddress(String smgrAddress) {
		this.smgrAddress = smgrAddress;
	}
	
	
	
}
