package day3_doubleColon_and_coparator;

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


}
/*
		create a class Movie
		create instance variables: name, year, rating
		encapsulate, create constructor and toString

 */