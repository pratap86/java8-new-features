package org.pratap.java8;

import org.pratap.java8.functional.ChildFunInterface01;

public class LambdaTest {

	public static void main(String[] args) {

		ChildFunInterface01 childObj = ()->System.out.println("inside ChildFunInterface01");
		childObj.m();
	}

}
