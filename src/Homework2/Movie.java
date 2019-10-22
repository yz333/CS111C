package Homework2;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    @Override
    public int compareTo(Movie o) {
        int yearComparison = Integer.compare(this.year,o.year);
        if (yearComparison==0){
            return this.name.compareTo(o.name);
        }
        else{
            return yearComparison;
        }
    }
}
