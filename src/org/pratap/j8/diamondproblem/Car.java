package org.pratap.j8.diamondproblem;

public interface Car {

	public default void drive() {
		System.out.println("Driving Car.");
	}
}
