package com.igate.tradingsimulator.vo;

import java.io.Serializable;

public class TradeVO implements Serializable{

	private static final long serialVersionUID = -247542625635244052L;
	
	private String username;
	private String action;
	private String stock;
	private String product;
	private String exchange;
	private int quantity;
	private String orderType;
	private float limitPrice;
	private float viewLimit;
	private String orderValidity;
	private float stopLossTriggerPrice;

	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public float getLimitPrice() {
		return limitPrice;
	}
	public void setLimitPrice(float limitPrice) {
		this.limitPrice = limitPrice;
	}
	public float getViewLimit() {
		return viewLimit;
	}
	public void setViewLimit(float viewLimit) {
		this.viewLimit = viewLimit;
	}
	public String getOrderValidity() {
		return orderValidity;
	}
	public void setOrderValidity(String orderValidity) {
		this.orderValidity = orderValidity;
	}
	public float getStopLossTriggerPrice() {
		return stopLossTriggerPrice;
	}
	public void setStopLossTriggerPrice(float stopLossTriggerPrice) {
		this.stopLossTriggerPrice = stopLossTriggerPrice;
	}
}
