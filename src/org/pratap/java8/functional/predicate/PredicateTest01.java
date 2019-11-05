package org.pratap.java8.functional.predicate;

import java.util.function.Predicate;

public class PredicateTest01 {

	public static void main(String[] args) {

		String[] names = {"Sunny", "Kajal", "Mallika", "Katrina", "Kareena"};
		
		Predicate<String> strStartWithKPredicate = s -> s.charAt(0) == 'K';
		System.out.println("The names start with K are :");
		for(String str : names) {
			if(strStartWithKPredicate.test(str)) {
				System.out.println(str);
			}
		}
	}

}
