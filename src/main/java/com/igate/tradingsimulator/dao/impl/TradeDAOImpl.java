package com.igate.tradingsimulator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<TradeTxn> getTradesForUser(int userId, String status) {
		Criteria criteria = getSession().createCriteria(TradeTxn.class);
		criteria.createAlias("user", "u");
		criteria.add(Restrictions.eq("u.id", userId));
		if(status != null){
			criteria.add(Restrictions.eq("executionStatus", status));
		}
		return criteria.list();
	}

}
