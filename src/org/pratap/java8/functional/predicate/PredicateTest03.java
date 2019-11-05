package org.pratap.java8.functional.predicate;

import java.util.function.Predicate;

class SoftwareEngineer {
	private String name;
	private int age;
	private boolean isHavingGF;
	public SoftwareEngineer(String name, int age, boolean isHavingGF) {
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
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
	public boolean isHavingGF() {
		return isHavingGF;
	}
	public void setHavingGF(boolean isHavingGF) {
		this.isHavingGF = isHavingGF;
	}
	@Override
	public String toString() {
		return String.format("SoftwareEngineer [name=%s]", name);
	}
}
public class PredicateTest03 {

	public static void main(String[] args) {
		 SoftwareEngineer[] list = {
				 					new SoftwareEngineer("Pratap", 32, false),
				 					new SoftwareEngineer("Sunil", 60, true),
				 					new SoftwareEngineer("Shyam", 26, true),
				 					new SoftwareEngineer("Raghav", 17, true),
				 					new SoftwareEngineer("Narayan", 60, false)
				 					};
		 
		 Predicate<SoftwareEngineer> allowed = se -> se.getAge() >=18 && se.isHavingGF() == true;
		 
		 System.out.println("The allowed members in Pub are :");
		 for(SoftwareEngineer sw : list) {
			 if(allowed.test(sw)) {
				 System.out.println(sw);
			 }
		 }
	}
}
