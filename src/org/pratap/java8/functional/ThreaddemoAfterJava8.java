package org.pratap.java8.functional;

public class ThreaddemoAfterJava8 {

	public static void main(String[] args) {

		Thread t = new Thread(()-> {
			for(int i = 0; i<10; i++) {
				System.out.println("child thread");
			}
		});
		t.start();
		for(int i = 0;i <10;i++) {
			System.out.println("main thread");
		}
	}

}
