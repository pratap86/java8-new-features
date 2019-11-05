package org.pratap.java8.functional.function;

import java.util.function.Function;

public class IdentityMain {

	public static void main(String[] args) {

		Function<String, String> f = Function.identity();
		
		System.out.println(f.apply("Pratap Narayan"));
	}

}
