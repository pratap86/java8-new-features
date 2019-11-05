package org.pratap.java8.functional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 * @author pnarayan8
 * Apply Predicate, Function & Consumer
 */
class Student {
	private int marks;
	private String name;
	public Student(String name, int marks) {
		this.marks = marks;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class ConsumerMain03 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		populate(students);
		
		Predicate<Student> p = s -> s.getMarks() >= 60;
		
		Function<Student, String> f = s -> {
			
			int mark = s.getMarks();
			
			if(mark >= 80) {
				return "A[Dictinction]";
			}
			else if (mark >= 60) {
				return "B[First Class]";
			}
			else if (mark >= 50) {
				return "C[Second Class]";
			}
			else if (mark >= 35) {
				return "C[Second Class]";
			}
			else {
				return "E[Failed]";
			}
		};
		
		Consumer<Student> c = s -> {
			System.out.println("Student Name : "+s.getName());
			System.out.println("Student Mark : "+s.getMarks());
			System.out.println("Student Grade : "+ f.apply(s));
			System.out.println("*******************************");
		};
		
		for(Student s : students) {
			if(p.test(s)) {
				c.accept(s);
			}
		}
	}

	private static void populate(List<Student> students) {

		students.add(new Student("Sunny", 100));
		students.add(new Student("Bunny", 65));
		students.add(new Student("Chinny", 55));
		students.add(new Student("Vinny", 45));
		students.add(new Student("Pinny", 25));
	}

}
