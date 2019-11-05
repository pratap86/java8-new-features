package org.pratap.java8.functional.supplier;

import java.util.function.Supplier;

/**
 * 
 * @author pnarayan8
 * Program to get Random password by using Supplier
 * 
 * Rule:
 * 1.	length should be 8 chars
 * 2.	2, 4, 6, 8 place only digit
 * 3.	1, 3, 5, 7 place only upper case alphabet, symbols +@#$ 
 */
public class SupplierMain04 {

	public static void main(String[] args) {

		Supplier<String> s = ()-> {
			
			Supplier<Integer> d = () -> (int)(Math.random()*10);
			
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			
			Supplier<Character> c = () -> symbols.charAt((int)(Math.random()*29));
			
			String pwd = "";
			
			for(int i = 1; i<=8; i++) {
				if(i % 2 == 0) {
					pwd += d.get();
				}
				else {
					pwd += c.get(); 
				}
			}
			return pwd;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
