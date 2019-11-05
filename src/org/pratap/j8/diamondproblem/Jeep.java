package org.pratap.j8.diamondproblem;

public interface Jeep {

	public default void drive() {
		System.out.println("Driving Jeep.");
	}
}
