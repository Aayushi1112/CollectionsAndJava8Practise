import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    double rating;
    String name;
 int year;

    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}

// Driver class
class Main
{
    public static void main(String[] args)
    {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
//list.stream().forEach(e->System.out.println(e.getName()));
list.stream().filter(e->e.getYear()>2000).collect(Collectors.toList());

       // list.stream().sorted((o1, o2)->o1.year.compareTo(o2.year)).collect(Collectors.toList());



        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}