package org.pratap.java8.functional.bifunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Student {
	String name;
	int rollNum;
	
	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, rollNum=%s]", name, rollNum);
	}
	
	
}
public class BiFunctionTest02 {

	public static void main(String[] args) {

		BiFunction<String, Integer, Student> f = ( name, rollNum ) -> new Student(name, rollNum);
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(f.apply("Pratap Narayan", 1001));
		students.add(f.apply("Shankar", 1002));
		students.add(f.apply("Raghav", 1003));
		
		System.out.println(students);
	}

}
