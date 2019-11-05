package org.pratap.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListAfterJava8 {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		ints.add(10);
		ints.add(0);
		ints.add(5);
		ints.add(8);
		ints.add(11);
		ints.add(50);
		ints.add(4);
		System.out.println("Before sorting :"+ints);
		Collections.sort(ints, (obj1, obj2) -> (obj1 > obj2) ? -1:(obj1 < obj2) ? 1: 0);
		System.out.println("After java 8 Descending order :"+ ints);
		
		
	}

}
