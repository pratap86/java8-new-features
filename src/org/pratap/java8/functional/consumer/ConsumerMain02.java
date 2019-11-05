package org.pratap.java8.functional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie {
	private String name;
	private String hero;
	private String heroine;
	public Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	
}
public class ConsumerMain02 {

	public static void main(String[] args) {

		List<Movie> movies = new ArrayList<>();
		populate(movies);
		
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name : "+m.getName());
			System.out.println("Movie Hero : "+m.getHero());
			System.out.println("Movie Heroine : "+m.getHeroine());
		};
		for(Movie m :movies) {
			c.accept(m);
		}
	}

	private static void populate(List<Movie> movies) {

		movies.add(new Movie("Bahubali", "Prabhas", "Anushka Setty"));
		movies.add(new Movie("Rayess", "Shahrukh", "Sunny"));
		movies.add(new Movie("Dangal", "Aamir", "Ritu"));
		movies.add(new Movie("Sultan", "Salman", "Anushka Sharma"));
		movies.add(new Movie("DDLG", "Shahrukh", "Kajol"));
	}

}
