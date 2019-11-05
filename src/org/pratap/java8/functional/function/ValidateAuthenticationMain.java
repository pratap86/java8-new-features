package org.pratap.java8.functional.function;

import java.util.Scanner;
import java.util.function.Function;

public class ValidateAuthenticationMain {

	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.substring(0, 5);
		Function<String, String> f2 = s -> s.toLowerCase();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter user name");
		String userName = sc.next();
		
		System.out.println("Enter password");
		String pwd = sc.next();
		
		if(f1.andThen(f2).apply(userName).equals("prata") && pwd.equals("java")) {
			System.out.println("valid user");
		}
		else {
			System.out.println("credential not matched");
		}
		
	}

}
