package com.db.tradestore.repository;

import java.util.List;
import java.util.Optional;

import com.db.tradestore.model.Trade;

public interface TradeStoreRepository {

	void save(Trade trade);

	List<Trade> findAll();

	Optional<Trade> findTrade(String tradeId);

}