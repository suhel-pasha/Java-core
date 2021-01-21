package com.xworkz.java_programs.collection.collection2.arraylist.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MovieTester {

	public static void main(String[] args) {
		
		MoviesDTO dto1 = new MoviesDTO("KGF2", 5, 3, "Action");
		MoviesDTO dto2 = new MoviesDTO("Om", 5, 2.5, "Drama");
		MoviesDTO dto3 = new MoviesDTO("Bahubali", 4.5, 2.39, "Action/War");
		MoviesDTO dto4 = new MoviesDTO("Andhra Wala", 5, 3, "Action");
		MoviesDTO dto5 = new MoviesDTO("Tarle Nan Maga", 5, 3, "Comedy");
		
		Collection<MoviesDTO> movies = new ArrayList<MoviesDTO>();
		
		movies.add(dto1);
		movies.add(dto2);
		movies.add(dto3);
		movies.add(dto4);
		movies.add(dto5);
		
		Iterator<MoviesDTO> iterator = movies.iterator();
		
		while (iterator.hasNext()) {
			MoviesDTO movie = (MoviesDTO) iterator.next();
			System.out.println(movie);
			if(movie.getGenre().equals("Comedy")) {
				iterator.remove();
			}
		}
		System.out.println("movies after removing comedy: ");
		
		for (MoviesDTO moviesDTO : movies) {
			System.out.println(moviesDTO);
		}

	}

}
