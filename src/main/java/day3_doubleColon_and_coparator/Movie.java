package day3_doubleColon_and_coparator;

import day3_doubleColon_and_coparator.comparator.Comparator;

public class Movie implements Comparable<Movie>{
    private String name;
    private int year;
    private double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o) {// is implemented method from comparable interface
        return Integer.compare(this.year, o.year);
    }

    // this is anonymous class we have semicolon  on the end of the code
    public static Comparator nameComparator = new Comparator(){
        public int compare(Movie m1, Movie m2){
            return m1.getName().compareTo(m2.getName());
        }
    }; // semicolon


}
/*
		create a class Movie
		create instance variables: name, year, rating
		encapsulate, create constructor and toString

 */