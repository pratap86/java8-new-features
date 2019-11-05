package org.pratap.java8.doublecolonoperator;
interface Interf1 {
	Sample get();
}

class Sample {
	
	public Sample() {
		System.out.println("Sample constructor exection & object creation");
	}
}
public class MethodRefMain03 {

	public static void main(String[] args) {
		/*Interf1 i = () ->{
			Sample s = new Sample();
			return s;
		};
		i.get();*/
		
		Interf1 i = Sample :: new;
		i.get();
	}	
}
