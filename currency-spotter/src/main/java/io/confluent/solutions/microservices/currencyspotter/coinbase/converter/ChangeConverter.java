package io.confluent.solutions.microservices.currencyspotter.coinbase.converter;

import java.math.BigDecimal;

import io.confluent.solutions.microservices.currencyspotter.coinbase.model.OrderBookEntry;
import io.confluent.solutions.microservices.currencyspotter.coinbase.model.Side;

public abstract class ChangeConverter {
	public static OrderBookEntry convertToOrderBookEntry(String[] price) {
		return new OrderBookEntry(new BigDecimal(price[1]), new BigDecimal(price[2]),
				price[0].equals("buy") ? Side.BUY : Side.SELL);
	}
}
