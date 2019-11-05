package org.pratap.j8.streams.workingwithstreams;

import java.util.List;

import org.pratap.j8.domain.Movie;
import org.pratap.j8.util.MovieUtil;

public class WorkingWithStreams {

	List<Movie> movies = MovieUtil.createMovies();
	
	private void findMovieByDirector(String director) {
		movies.stream()
		.filter(movie -> movie.getDirector().equals("Steven Spielberg") ? true:false)
		.map(Movie::getName)
		.forEach(System.out::println);
	}
	public static void main(String[] args) {

		new WorkingWithStreams().findMovieByDirector("Steven Spielberg");
		
	}

}
