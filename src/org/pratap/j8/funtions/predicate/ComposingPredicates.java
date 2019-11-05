package org.pratap.j8.funtions.predicate;

import java.util.function.Predicate;

import org.pratap.j8.domain.Trade;

/**
 * 
 * @author pnarayan8
 * <p>Composing or chaining Predicates</p>
 */
public class ComposingPredicates {

	private void testPredicates(Trade trade) {
		
		/* Logical AND*/
		
		Predicate<Trade> bigTrade = t -> t.isBigTrade();
	}
	public static void main(String[] args) {
		ComposingPredicates test = new ComposingPredicates();
	}
}
