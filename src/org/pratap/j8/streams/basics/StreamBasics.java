package org.pratap.j8.streams.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.pratap.j8.domain.Trade;
import org.pratap.j8.util.TradeUtil;

/**
 * 
 * @author pnarayan8
 * <p>Stream basics</p>
 */
public class StreamBasics {

	private List<Trade> findLargeTradesPreJava8(List<Trade> trades){
		
		List<Trade> largeTrades = new ArrayList<>();
		for(Trade trade : trades) {
			if(trade.getQuantity() > 10000) {
				largeTrades.add(trade);
			}
		}
		return largeTrades;
	}
	
	private void findLargeTradesUsingStream(List<Trade> trades) {

		List<Trade> largeTrades = trades.stream()
					.filter(trade -> trade.getQuantity() > 10000)
					.collect(Collectors.toList());
		
		System.out.println(largeTrades);
	}
	public static void main(String[] args) {

		StreamBasics basic = new StreamBasics();
		List<Trade> trades = TradeUtil.createTrades();
		basic.findLargeTradesPreJava8(trades);
		
		basic.findLargeTradesUsingStream(trades);
	}

}
