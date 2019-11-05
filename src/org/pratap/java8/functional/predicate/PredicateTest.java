package org.pratap.java8.functional.predicate;

import java.util.function.Predicate;

/**
 * Predicate Joining
 * @author pnarayan8
 * Predicate contains 3- default methods; to implement Predicate Joining
 * 1.	and
 * 2.	negate
 * 3.	or
 *  and one static method: isEqual
 *
 */
public class PredicateTest {

	public static void main(String[] args) {

		int[] x = {0, 5, 10, 15, 20, 25, 30};
		
		// predicate 1: int x > 10
		Predicate<Integer> p1 = i -> i > 10;
		
		//predicate 2 : int x > even
		Predicate<Integer> p2 = i -> i % 2 == 0;
		
		System.out.println("The numbers greate thatn 10 are :");
		m1(p1, x);
		
		System.out.println("The even numbers are : ");
		m1(p2, x);
		
		System.out.println("The number not greater than 10 are : ");
		m1(p1.negate(), x);
		
		System.out.println("The numbers greate thatn 10 and even Numbers are");
		m1(p1.and(p2), x);
		
		System.out.println("The numbers greate thatn 10 or even Numbers are");
		m1(p1.or(p2), x);
		
	}
	
	public static void m1(Predicate<Integer> predicate, int[] arr) {
		for(int x : arr) {
			if(predicate.test(x)) {
				System.out.println(x);
			}
		}
	}

}
