package cfa104g3_sec_model;

import java.io.Serializable;
import java.sql.Date;

public class ReportVO implements Serializable{
	private Integer prodRpProdId;
	private Integer prodRpMemId;
	private String prodRpText;
	private Date prodRpDate;
	private byte[] prodRpPhoto;
	private Integer prodRpStatus;
	
	public Integer getProdRpProdId() {
		return prodRpProdId;
	}
	public void setProdRpProdId(Integer prodRpProdId) {
		this.prodRpProdId = prodRpProdId;
	}
	public Integer getProdRpMemId() {
		return prodRpMemId;
	}
	public void setProdRpMemId(Integer prodRpMemId) {
		this.prodRpMemId = prodRpMemId;
	}
	public String getProdRpText() {
		return prodRpText;
	}
	public void setProdRpText(String prodRpText) {
		this.prodRpText = prodRpText;
	}
	public Date getProdRpDate() {
		return prodRpDate;
	}
	public void setProdRpDate(Date prodRpDate) {
		this.prodRpDate = prodRpDate;
	}
	public byte[] getProdRpPhoto() {
		return prodRpPhoto;
	}
	public void setProdRpPhoto(byte[] prodRpPhoto) {
		this.prodRpPhoto = prodRpPhoto;
	}
	public Integer getProdRpStatus() {
		return prodRpStatus;
	}
	public void setProdRpStatus(Integer prodRpStatus) {
		this.prodRpStatus = prodRpStatus;
	}
}
