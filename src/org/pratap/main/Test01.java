package org.pratap.main;
class Parent{
	int a = 10;
	public void p1() {
		System.out.println("p1");
	}
}
class Child extends Parent{
	int a = 20;
	public void p1() {
		System.out.println("child");
	}
	public void c1() {
		System.out.println("child c1()");
	}
}
public class Test01 {

	public static void main(String[] args) {

		Child c = new Child();
		c.p1();
		System.out.println(c.a);
		
		Parent p = new Child();
		p.p1();
		System.out.println(p.a);
		
	}

}
