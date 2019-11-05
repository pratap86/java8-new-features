package org.pratap.java8.annoymous;
interface interf {
	public void m1();
}
public class LambdaWithAnnonymousClass {

	int x = 888;
	
	public void m2() {
		
		/*interf i = new interf() {
			int x = 999; // instance variable
			@Override
			public void m1() {
				System.out.println(this.x);
			}
		};
		i.m1();*/
		interf i = ()->{
			int x = 999;// local variable
			System.out.println(this.x);
		};
		i.m1();
	}
	public static void main(String[] args) {

		LambdaWithAnnonymousClass l = new LambdaWithAnnonymousClass();
		l.m2();
		
	}

}
