package org.pratap.java8.functional.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 
 * @author pnarayan8
 * Supplier to supply system date
 */
public class SupplierMain01 {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
