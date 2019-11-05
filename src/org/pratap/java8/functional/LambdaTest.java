package org.pratap.java8.functional;

public class LambdaTest {

	public static void main(String[] args) {

		AddInterf addObj = (a, b) -> System.out.println("sum is : "+(a+b));
		addObj.add(10, 20);
	}

}
