package com.igate.tradingsimulator.service.impl;

import com.igate.tradingsimulator.dao.TradeDAO;
import com.igate.tradingsimulator.dao.UserDAO;
import com.igate.tradingsimulator.domain.TradeTxn;
import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.service.BaseService;
import com.igate.tradingsimulator.service.TradeService;

public class TradeServiceImpl extends BaseService implements TradeService{

	private TradeDAO tradeDAO;
	private UserDAO userDAO;

	public TradeDAO getTradeDAO() {
		return tradeDAO;
	}

	public void setTradeDAO(TradeDAO tradeDAO) {
		this.tradeDAO = tradeDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public TradeTxn saveTrade(TradeTxn tradeTxn) {
		User tradingUser = getUserDAO().getUserByUserName(tradeTxn.getUser().getUsername());
		tradeTxn.setUser(tradingUser);
		return getTradeDAO().saveTrade(tradeTxn); 
	}

}
