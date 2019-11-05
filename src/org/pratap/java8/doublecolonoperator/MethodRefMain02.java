package org.pratap.java8.doublecolonoperator;

public class MethodRefMain02 {

	public void m2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
		}
	}
	public static void main(String[] args) {
		// Runnable r internally refer to MethodRefMain02 m2 method
		Runnable r = new MethodRefMain02() :: m2;
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
