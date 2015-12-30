package com.igate.tradingsimulator.dao;

import com.igate.tradingsimulator.domain.TradeTxn;

public interface TradeDAO {
	
	TradeTxn saveTrade(TradeTxn tradeTxn);

}
