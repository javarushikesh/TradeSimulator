package com.igate.tradingsimulator.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import com.igate.tradingsimulator.dao.TradeDAO;
import com.igate.tradingsimulator.domain.TradeTxn;

@Transactional
public class TradeDAOImpl extends BaseDAO implements TradeDAO{

	@Override
	public TradeTxn saveTrade(TradeTxn tradeTxn) {
		getSession().save(tradeTxn);
		return tradeTxn;
	}

}
