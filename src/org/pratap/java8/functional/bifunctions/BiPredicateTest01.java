package org.pratap.java8.functional.bifunctions;

import java.util.function.BiPredicate;

/**
 * 
 * @author Pratap Narayan
 * BiPredicate is exactly same as Predicate except that it will take 2 input arguments
 * interface BiPredicate<T1,T2> 
 * {  
 * 		public boolean test(T1 t1,T2 t2);
 * 		//remaining default methods: and(), or() , negate()
 * }   
 *
 */
public class BiPredicateTest01 {

	public static void main(String[] args) {

		// to check, the sum of two numbers are even or not
		BiPredicate<Integer, Integer> p = ( a, b ) -> (a + b) % 2 == 0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(11, 2));
	}

}
