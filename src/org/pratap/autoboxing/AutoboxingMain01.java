package org.pratap.autoboxing;

public class AutoboxingMain01 {

	public static void main(String[] args) {

		System.out.println(Integer.valueOf("127")==Integer.valueOf("127"));// true

		System.out.println(Integer.valueOf("128")==Integer.valueOf("128"));// false
		
		int x = 20;
		
		populate(x);
		
	}

	private static void populate(Integer x) {
		
		System.out.println("primitive long");
	}
	private static void populate(int x) {

		System.out.println("primitive long");
	}
	private void testAutoUnboxingNPE(Boolean testNPE) {

		 if(testNPE){

		  System.out.println("I am true");

		 } else if(testNPE){

		  System.out.println("I am false");

		 }

		}

}
