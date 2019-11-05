package org.pratap.j8.diamondproblem;

public class Vehicle implements Car, Jeep {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.drive();
	}

	@Override
	public void drive() {
		Jeep.super.drive();
	}
}
