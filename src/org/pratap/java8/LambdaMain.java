package org.pratap.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {

		Employee pratap = new Employee("Pratap Narayan", 31);
		Employee raj = new Employee("Raj", 22);
		Employee prem = new Employee("Prem", 32);
		Employee sanjay = new Employee("Sanjay", 34);
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(pratap);
		employees.add(raj);
		employees.add(prem);
		employees.add(sanjay);
		
		Collections.sort(employees, (Employee employee1, Employee employee2) -> employee1.getName().compareTo(employee2.getName()));
		
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}

}

class Employee {
	
	private String name;
	
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
