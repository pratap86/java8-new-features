package org.pratap.oops.abstractcls;

public class MyConcrete extends MyAbstract {

	@Override
	void hi() {
		System.out.println("hi");
	}
	/*String hello() {
		return "Hello Pratap!";
	}*/

	public static void main(String[] args) {
		MyAbstract abs = new MyConcrete();
		System.out.println(abs.hello());
		abs.hi();
	}

}
