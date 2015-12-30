package com.igate.tradingsimulator.mappingutils;

import java.util.Date;

import com.igate.tradingsimulator.domain.TradeTxn;
import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.vo.TradeVO;

public class TradeMapping {
	
	public static TradeTxn mapTradeData(TradeVO tradevo){
		TradeTxn tradeTxn = new TradeTxn();
		tradeTxn.setAction(tradevo.getAction());
		tradeTxn.setCreationDate(new Date());
		tradeTxn.setExchange(tradevo.getExchange());
		tradeTxn.setLimitPrice(tradevo.getLimitPrice());
		tradeTxn.setOrderType(tradevo.getOrderType());
		tradeTxn.setOrderValidity(tradevo.getOrderValidity());
		tradeTxn.setProduct(tradevo.getProduct());
		tradeTxn.setQuantity(tradevo.getQuantity());
		tradeTxn.setStock(tradevo.getStock());
		User tradeUser = new User();
		tradeUser.setUsername(tradevo.getUsername());
		tradeTxn.setUser(tradeUser);
		
		return tradeTxn;
	}

}
