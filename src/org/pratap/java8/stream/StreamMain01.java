package org.pratap.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain01 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("Pawan");
		names.add("Pratap");
		names.add("Deepika");
		names.add("Rekha");
		names.add("Narayan");
		
		System.out.println(names);
		// filter the name whose length >=5
		List<String> names02 = names.stream().filter(s -> s.length() >= 6).collect(Collectors.toList());
		System.out.println(names02);
		
		List<String> names03 = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(names03);
		
		long count = names.stream().filter(s -> s.length() >= 6).count();
		System.out.println(count);
		
		System.out.println("***********************Sorting*******************");
		List<String> defaultSorting = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Sorting : \n"+defaultSorting);
		
		List<String> custSorting = names.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Custom Sorting : "+custSorting);
	}

}
