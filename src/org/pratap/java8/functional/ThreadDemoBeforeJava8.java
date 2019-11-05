package org.pratap.java8.functional;
class MyRunnable implements Runnable {

	@Override
	public void run() {

		for(int i = 0; i<10; i++) {
			System.out.println("child thread");
		}
	}
	
}
public class ThreadDemoBeforeJava8 {

	public static void main(String[] args) {

		Thread t = new Thread(new MyRunnable());
		t.start();
		for(int i = 0; i <10; i++) {
			System.out.println("main thread");
		}
	}

}
