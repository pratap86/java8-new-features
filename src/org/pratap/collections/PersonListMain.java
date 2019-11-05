package org.pratap.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PersonListMain {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("A", "Delhi"));
		persons.add(new Person("B", "Patna"));
		persons.add(new Person("C", "Kanpur"));
		persons.add(new Person("D", "Delhi"));
		persons.add(new Person("E", "Delhi"));
		persons.add(new Person("F", "Patna"));
		persons.add(new Person("G", "Kanpur"));
		/**
		 * Delhi:
		 * A
		 * D
		 * E
		 * Patna:
		 * B
		 * F
		 * Kanpur:
		 * C
		 * G
		 */
		// Before java - 8
		Map<String, List<Person>> personMap = new HashMap<>();
		
		for(Person person : persons) {
			
			if(!personMap.containsKey(person.getCity())) {
				List<Person> personList = new ArrayList<>();
				personList.add(person);
				
				personMap.put(person.getCity(), personList);
			}
			else {
				personMap.get(person.getCity()).add(person);
			}
		}
		
				
		System.out.println("--------------------'");
		
		for(Map.Entry<String, List<Person>> entry : personMap.entrySet()) {
			System.out.println(entry.getKey());
			List<Person> list = entry.getValue();
			for(Person person : list) {
				System.out.println("---- "+person.getName());
			}
		}
		
		
	}

}
class Person{
	
	private String name;
	private String city;
	
	
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return String.format("Person [name=%s, city=%s]", name, city);
	}
	
	
	
}