package com.igate.tradingsimulator.vo;

import java.io.Serializable;

public class StocksVO implements Serializable{

	private static final long serialVersionUID = -7169044198372183130L;
	
	private String label;
	private String value;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}