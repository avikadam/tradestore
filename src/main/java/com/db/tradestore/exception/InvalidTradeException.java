package com.db.tradestore.exception;

import com.db.tradestore.model.Trade;

public class InvalidTradeException extends RuntimeException {

	private static final long serialVersionUID = 7921217894568166965L;

	private final Trade trade;

	public InvalidTradeException(final Trade trade, String message) {
		super(message);
		this.trade = trade;
	}

	public String getTradeId() {
		return trade.getTradeId();
	}
}
