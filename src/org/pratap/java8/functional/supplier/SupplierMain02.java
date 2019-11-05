package org.pratap.java8.functional.supplier;

import java.util.function.Supplier;

/**
 * 
 * @author pnarayan8
 * supplier to supply random name from given names
 */
public class SupplierMain02 {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String[] names = {"Sunny", "Bunny", "Hunny", "Binny"};
			int x = (int) (Math.random()*4);
			return names[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
