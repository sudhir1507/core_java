package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable{
	private double rating;
    private String name;
    private int year;
	public Movie(String name,double rating,int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
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
//	public int compareTo(Movie m) {
//		return this.year-m.year;
//	}
	@Override
	public int compareTo(Object o) {
		Movie m=(Movie)o;
		return this.year-m.year;
	}
}
public class MovieComparble {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        
        System.out.println("After sorting year wise");
        for(Object obj:list) {
        	Movie m=(Movie)obj;
        	System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
        }
	}

}
