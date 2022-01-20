package com.member.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

public class MemberVO implements Serializable {
	private int id;
	private String email;
	private String account;
	private String password;
	private String nickname;
	private String name;
	private String phone;
	private int gender;
	private String city;
	private String cityArea;
	private String address;
	private String code;
	private byte[] avatar;
	private Timestamp registerDate;
	private int status;

	public MemberVO() {
	}

	public MemberVO(int id, String email, String account, String password, String nickname, String name, String phone,
			int gender, String city, String cityArea, String address, String code, byte[] avatar, Timestamp registerDate,
			int status) {
		this.id = id;
		this.email = email;
		this.account = account;
		this.password = password;
		this.nickname = nickname;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.city = city;
		this.cityArea = cityArea;
		this.address = address;
		this.code = code;
		this.avatar = avatar;
		this.registerDate = registerDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityArea() {
		return cityArea;
	}

	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public byte[] getAvatar() {
		return avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", email=" + email + ", account=" + account + ", password=" + password
				+ ", nickname=" + nickname + ", name=" + name + ", phone=" + phone + ", gender=" + gender + ", city="
				+ city + ", cityArea=" + cityArea + ", address=" + address + ", code=" + code + ", avatar="
				+ Arrays.toString(avatar) + ", registerDate=" + registerDate + ", status=" + status + "]";
	}
}
