package org.pratap.java8.functional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)", name, marks);
	}
	
}
public class FindStudentGradeMain {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		populate(students);
		
		// function to return student grade based on their marks
		Function<Student, String> f = std -> {
										int mark = std.getMarks();
										
										if(mark >=80) {
											return "A[Dictinction]";
										}
										else if (mark >=60 && mark < 80) {
											return "B[First Division]";
										}
										else if (mark >=50 && mark <60) {
											return "C[Second Division]";
										}
										else if (mark >=35 && mark < 45) {
											return "D[Third Division]";
										}
										else {
											return "Failed";
										}
									};
		
		for(Student student : students) {
			System.out.println("Student Name :"+student.getName());
			System.out.println("Student Marks :"+student.getMarks());
			System.out.println("Student Grade :"+f.apply(student));
			System.out.println();
		}
	}

	public static void populate(List<Student> students) {

		students.add(new Student("Sunny", 100));
		students.add(new Student("Bunny", 65));
		students.add(new Student("Chinny", 55));
		students.add(new Student("Vinny", 45));
		students.add(new Student("Pinny", 25));
	}

}
