package org.pratap.java8.functional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("(%s, %s)", name, salary);
	}
}
public class FindTotalSalOfTotalEmployee {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		populate(employees);
		System.out.println(employees);
		
		Function<List<Employee>, Double> f = empList -> {
			double total = 0;
			for(Employee employee : empList) {
				total +=employee.getSalary();
			}
			return total;
		};
		System.out.println("Total salary of all emplyees: "+f.apply(employees));
		
		// increment salary of those employees whose salary < 3500
		System.out.println("Before increament :"+employees);
		Predicate<Employee> p = e -> e.getSalary() < 3500;
		
		Function<Employee, Employee> f2 = emp -> {
			emp.setSalary(emp.getSalary()+477);
			return emp;
		};
		System.out.println("After increment :");
		List<Employee> emps = new ArrayList<>();
		
		for(Employee e : employees) {
			if(p.test(e)) {
				f2.apply(e);
				emps.add(e);
			}
		}
		System.out.println("salary after increment"+emps);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void populate(List<Employee> employees) {
		employees.add(new Employee("Sunny", 1000));
		employees.add(new Employee("Bunny", 2000));
		employees.add(new Employee("Chinny", 3000));
		employees.add(new Employee("Vinny", 4000));
		employees.add(new Employee("Pinny", 5000));
	}

}
