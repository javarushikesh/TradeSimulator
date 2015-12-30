package com.igate.tradingsimulator.service;

import com.igate.tradingsimulator.domain.TradeTxn;

public interface TradeService {

	TradeTxn saveTrade(TradeTxn tradeTxn);
}
