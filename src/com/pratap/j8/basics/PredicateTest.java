package com.pratap.j8.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Pratap");
		list.add("");
		list.add("Narayan");
		list.add("");
		list.add("Bangaluru");
		
		Predicate<String> nonEmptyPredicate = p -> !p.isEmpty();
		List<String> fltrList = filterList(list, nonEmptyPredicate);
		
		System.out.println(fltrList);
		
		List<Integer> intList = List.of(1,4,6,7,8);
		Predicate<Integer> evenPredicate = p -> p % 2 == 0;
		List<Integer> evenList = filterList(intList, evenPredicate);
		System.out.println(evenList);
	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

		List<T> newList = new ArrayList<T>();
		
		list.forEach(t -> {
			if(predicate.test(t)) {
				newList.add(t);
			}
		});
		
		return newList;
		
	}

}
