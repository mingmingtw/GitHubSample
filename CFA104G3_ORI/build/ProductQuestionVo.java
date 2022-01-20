package com.all.model;

import java.io.Serializable;
import java.sql.Date;

public class QuestionVo implements Serializable{
	private Integer prodQId;
    private Integer prodQMemId;
    private Integer prodQProdId;
    private String prodQPromContent;
    private String prodQRepContent;
    private Date prodQPromDate;
    private Date prodQRepDate;
 
 

    public Integer getProdQId() {
   	 return prodQId;
    }
    public void setProdQId(Integer prodQId) {
   	 this.prodQId = prodQId;
    }
    public Integer getProdQMemId() {
   	 return prodQMemId;
    }
    public void setProdQMemId(Integer prodQMemId) {
   	 this.prodQMemId = prodQMemId;
    }
    public Integer getProdQProdId() {
      	 return prodQProdId;
       }
       public void setProdQProdId(Integer prodQProdId) {
      	 this.prodQProdId = prodQProdId;
       }
    public String getProdQPromContent() {
        	 return prodQPromContent;
         }
         public void setProdQPromContent(String prodQPromContent) {
        	 this.prodQPromContent = prodQPromContent;
         }
    public String getProdQRepContent() {
        	 return prodQRepContent;
         }
         public void setProdQRepContent(String prodQRepContent) {
        	 this.prodQRepContent = prodQRepContent;
         }
    public Date getProdQPromDate() {
        	 return prodQPromDate;
         }
         public void setProdQPromDate(Date prodQPromDate) {
        	 this.prodQPromDate = prodQPromDate;
         }
    public Date getProdQRepDate() {
        	 return prodQRepDate;
         }
         public void setProdQRepDate(Date prodQRepDate) {
        	 this.prodQRepDate = prodQRepDate;
         }
}
