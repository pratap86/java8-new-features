package com.pratap.j8.basics;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {

		// Problems : sum of even numbers from 0 to 100
		// Imperative
		
		int sumOfEvens = 0;
		
		for(int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0) {
				sumOfEvens += i;
			}
		}
		System.out.println("Imperative sum of even Nums: "+sumOfEvens);
		
		//Declarative sum
		
		sumOfEvens = IntStream.rangeClosed(0, 100)
						.filter(p -> p % 2 == 0)
						.reduce((x , y) -> x+y)
						.getAsInt();
		System.out.println("Functional/Declarative sum of even Nums: "+sumOfEvens);
	}

}
