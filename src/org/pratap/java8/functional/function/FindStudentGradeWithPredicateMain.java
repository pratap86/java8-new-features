package org.pratap.java8.functional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindStudentGradeWithPredicateMain {

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
									
		// print student information only when marks > 60
		Predicate<Student> p = s -> s.getMarks() >= 60;
		
		for(Student student : students) {
			if(p.test(student)) {
				System.out.println("Student Name :"+student.getName());
				System.out.println("Student Marks :"+student.getMarks());
				System.out.println("Student Grade :"+f.apply(student));
				System.out.println();
			}
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
