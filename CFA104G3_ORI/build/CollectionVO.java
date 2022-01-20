package cfa104g3_sec_model;

import java.io.Serializable;

@SuppressWarnings("serial")
//@SuppressWarnings可以抑制一些能通过编译但是存在有可能运行异常的代码会发出警告，你确定代码运行时不会出现警告提示的情况下，可以使用这个注释。
public class CollectionVO implements Serializable{
    private Integer prodCMemId;
    private Integer prodCProdId;
 
 
 

    public Integer getProdCMemId() {
   	 return prodCMemId;
    }
    public void setProdCMemId(Integer prodCMemId) {
   	 this.prodCMemId = prodCMemId;
    }
    public Integer getProdCProdId() {
   	 return prodCProdId;
    }
    public void setProdCProdId(Integer prodCProdId) {
   	 this.prodCProdId = prodCProdId;
    }   
}
