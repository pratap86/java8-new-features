package org.pratap.java8.doublecolonoperator;
interface Interf {
	void m1();
//	void m3();
}
public class MethodRefMain01 {

	public static void m2() {
		System.out.println("method reference");
	}
	public static void m3() {
		System.out.println("3 method reference");
	}
	public static void main(String[] args) {

		Interf i = MethodRefMain01::m3;
		i.m1();
	}

}
