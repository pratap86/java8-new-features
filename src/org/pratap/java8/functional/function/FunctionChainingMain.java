package org.pratap.java8.functional.function;

import java.util.function.Function;
/**
 * 
 * @author pnarayan8
 * f1 & f2
 * 1.f1.andThan(f2) -> f1 will be apply followed by f2
 * 2.f1.compose(f2) -> f2 will be apply followed by f1
 * Note: only order will changed
 */
public class FunctionChainingMain {

	public static void main(String[] args) {
		
		Function<String, String> f1 = s -> s.toUpperCase();
		
		Function<String, String> f2 = s -> s.substring(0, 9);
		
		System.out.println(f1.apply("aishwaryaabhi"));
		System.out.println(f2.apply("aishwaryaabhi"));
		System.out.println(f1.andThen(f2).apply("aishwaryaabhi"));
		System.out.println(f1.compose(f2).apply("aishwaryaabhi"));
		
		// difference b/w andThen and compose
		
		Function<Integer, Integer> f3 = i -> i+i;
		
		Function<Integer, Integer> f4 = i -> i*i*i;
		
		System.out.println(f3.andThen(f4).apply(2));
		
		System.out.println(f3.compose(f4).apply(2));
		
		
		
	}

}
