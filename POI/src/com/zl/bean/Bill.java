package com.zl.bean;

import java.util.Date;

public class Bill {
	private Integer id;//账单编号
	private String tradeName;//商品名
	private String unit;//商品单位
	private String num;//商品数量
	private String amount;//账单金额
	private String supplier;//供应商
	private Integer payment;//是否付款
	private Date createDate;//创建时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		if(num==null||num==" "){
			this.num="缺货";
		}else{
			this.num = num;
		}		
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Integer getPayment() {
		return payment;
	}
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
