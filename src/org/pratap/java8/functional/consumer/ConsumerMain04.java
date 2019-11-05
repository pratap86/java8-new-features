package org.pratap.java8.functional.consumer;

import java.util.function.Consumer;

class Movie1 {
	private String name;
	private String result;
	public Movie1(String name, String result) {
		this.name = name;
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
public class ConsumerMain04 {

	public static void main(String[] args) {

		 Consumer<Movie1> c1=m->System.out.println("Movie:"+m.getName()+" is ready to release");
		 Consumer<Movie1> c2=m->System.out.println("Movie:"+m.getName()+" is just Released and it is:"+m.getResult());
		 Consumer<Movie1> c3=m->System.out.println("Movie:"+m.getName()+" information storing in the database");
		 
		 Consumer<Movie1> chainedC = c1.andThen(c2).andThen(c3);
		 
		 Movie1 m1= new Movie1("Bahubali","Hit");
		 chainedC.accept(m1);
		 Movie1 m2= new Movie1("Spider","Flop");
		 chainedC.accept(m2);
	}

	

}
