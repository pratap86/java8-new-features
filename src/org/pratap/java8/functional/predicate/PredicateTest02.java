package org.pratap.java8.functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author pnarayan8
 * <p>Predicate Example to Remove null values and Empty String from the given List</p>
 *
 */
public class PredicateTest02 {

	public static void main(String[] args) {

		String[] names = {"Pratap", "", "Narayan", null, "Ravi", "Shankar"};
		
		Predicate<String> p = s -> s != null && s.length() != 0;
		List<String> nameList = new ArrayList<>();
		
		for(String str : names) {
			if(p.test(str)) {
				nameList.add(str);
			}
		}
		System.out.println("List of valid names: ");
		System.out.println(nameList);
	}

}
