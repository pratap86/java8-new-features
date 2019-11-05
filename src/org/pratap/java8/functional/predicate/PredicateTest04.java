package org.pratap.java8.functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * <p>Employee management system </p>
 * @author pnarayan8
 *
 */
class Employee {
	private String name;
	private String designation;
	private double salary;
	private String city;
	
	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
	}

	
}
public class PredicateTest04 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		populate(list);
		System.out.println(list);
		
		Predicate<Employee> p1 = emp -> emp.getDesignation().equals("Manager");
		System.out.println("Managers Information :");
		display(p1, list);
		
		Predicate<Employee> p2 = emp -> emp.getCity().equals("Bangalore");
		System.out.println("Bangalore Employee Information");
		display(p2, list);
		
		Predicate<Employee> p3 = emp -> emp.getSalary() < 20000;
		System.out.println("All employee information whose salary < 20000");
		display(p3, list);
		
		System.out.println("All employee information whose disignation is Manager and Location is Bangalore");
		display(p1.and(p2), list);
		
		System.out.println("All employee information whose disignation is Manager or salary <20000");
		display(p1.or(p3), list);
		
	}

	private static void populate(List<Employee> list) {
		list.add(new Employee("Pratap Narayan", "Product Developer", 30000, "Noida"));
		list.add(new Employee("Naresh Shankar", "Associate Product Developer", 18000, "Noida"));
		list.add(new Employee("Amit Kumar", "Manager", 500000, "Bangalore"));
		list.add(new Employee("Kartikey", "BA", 18000, "Bangalore"));
		list.add(new Employee("Ajay Sharma", "Associate Manager", 80000, "Gurgaon"));
		list.add(new Employee("Ajit Singh", "Manager", 180000, "Bangalore"));
	}
	public static void display(Predicate<Employee> p, List<Employee> list) {
		for(Employee e : list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
	}
}
