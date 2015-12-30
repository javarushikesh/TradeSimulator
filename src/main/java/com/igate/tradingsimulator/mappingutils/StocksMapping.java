package com.igate.tradingsimulator.mappingutils;

import java.util.ArrayList;
import java.util.List;

import com.igate.tradingsimulator.domain.Stocks;
import com.igate.tradingsimulator.vo.StocksVO;

public class StocksMapping {
	
	public static List<StocksVO> mapDBStockstoVO(List<Stocks> dbStocks){
		List<StocksVO> stocksList = new ArrayList<StocksVO>();
		StocksVO stkvo;
		for(Stocks stock:dbStocks){
			stkvo = new StocksVO();
			stkvo.setLabel(stock.getStockDesc());
			stkvo.setValue(stock.getStockId());
			
			stocksList.add(stkvo);
		}
		return stocksList;
	}
}
