package org.pratap.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomizedSortingBeforeJava8 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(100, "Pratap Narayan"));
		empList.add(new Employee(121, "Deepika Narayan"));
		empList.add(new Employee(101, "Narayan Shankar"));
		empList.add(new Employee(110, "Abhay Deol"));
		empList.add(new Employee(109, "Karan Kumar"));
		empList.add(new Employee(108, "Vishesh Pratap"));
		
		System.out.println(empList);
		
		// sort by employee eno.
		Collections.sort(empList, (e1, e2) -> e1.getEno() < e2.getEno()?-1:e1.getEno() > e2.getEno()? 1:0 );
		System.out.println("After sorting by eno "+empList);
	}

}
