package org.pratap.java8.functional.supplier;

import java.util.function.Supplier;

/**
 * 
 * @author pnarayan8
 * supplier to supply 6-digit random OTP
 */
public class SupplierMain03 {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String otp = "";
			
			for(int i = 0;i<6; i++) {
				otp +=(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
