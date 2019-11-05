package org.pratap.java8.functional.predicate;

import java.util.function.Predicate;

public class Predicatetest05 {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("Pratap");
		
		System.out.println(p.test("Pratap"));
		System.out.println(p.test("pratap"));
	}

}
