package day3_doubleColon_and_coparator;

import java.util.*;
import java.util.Comparator;

public class MovieRunner {

    public static void main(String[] args) {


        List<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Star Wars: Episode IV – A New Hope", 1977, 8.6),
                new Movie("Avatar", 2009, 7.9),
                new Movie("Iron Man", 2008, 7.9),
                new Movie("The Dark Knight", 2008, 9.0),
                new Movie("Rocky",1976, 8.1)
        ));

        System.out.println("===========Original Data==================");

        movies.forEach(System.out::println);   // printing out the movie -> System.out.println(movie)


        System.out.println("===========sort by year in ascending order==================");
        //movies.sort(Comparator.comparing(movie -> movie.getYear()));
        movies.sort(Comparator.comparing(Movie::getYear)); // we access the instance through class Object
        movies.forEach(System.out::println);

        // the Comparator.comparing accepts a Function (functional interface that has 1 parameter and return type)
       // then the comparing method returns a Comparator, witch the sort method needs

        System.out.println("=========sort by year in descending order===========");
        movies.sort(Comparator.comparing(Movie::getYear).reversed());
        movies.forEach(System.out::println);

        System.out.println("=========sort by highest rated movie===========");
        //movies.sort(Comparator.comparing(movie -> movie.getRating()).reversed());
        movies.sort(Comparator.comparing(Movie::getRating).reversed());
        movies.forEach(System.out::println);

        System.out.println("============== sort the names alphabetically ==============");
        movies.sort(Comparator.comparing(movie -> movie.getName()));// lambda
        movies.sort(Comparator.comparing(Movie::getName));
        movies.forEach(System.out::println);

        Collections.sort(movies); // this works because the Comparable Interface is implemented in the class


    }
}
/*
	    perform the following actions:
	    	print all the starting Movie data
	    	sort by year in ascending order
	    	sort by year in descending order
	    	sort by the highest rated movie
	    	sort the names alphabetically
 */