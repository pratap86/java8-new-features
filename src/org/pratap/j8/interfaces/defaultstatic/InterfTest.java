package org.pratap.j8.interfaces.defaultstatic;

public class InterfTest implements InterfA, InterfB{

	public static void main(String[] args) {

		InterfTest test = new InterfTest();
		test.m1();
	}

	@Override
	public void m1() {
		InterfA.super.m1();
	}

}
