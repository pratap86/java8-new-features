package org.pratap.java8.functional.function;

import java.util.function.Function;

/**
 * 
 * @author pnarayan8
 * 
 * Function can take 2 type Parameters;
 * First one represent Input argument type and Second one represent return Type.  Function<T,R> 
 * 
 * interface function(T,R) {   
 *    public R apply(T t); 
 * }
 * T-input parameter
 * R-return type
 * * Predicate return only boolean value, while function return any type of value
 */
public class FunctionTest01 {

	public static void main(String[] args) {
		// find length of given string
		Function<String, Integer> f = s -> s.length();
		System.out.println("length of string given string is :");
		System.out.println(f.apply("pratap"));
		
		// remove the spaces from given string
		String str = "Noida is a metroplitan city";
		Function<String, String> f1 = s -> s.replaceAll(" ", "");
		System.out.println(f1.apply(str));
		
		// print the number of spaces present in the given string
		Function<String, Integer> f2 = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println("Number of spaces present in the given string");
		System.out.println(f2.apply(str));
		
	}

}
