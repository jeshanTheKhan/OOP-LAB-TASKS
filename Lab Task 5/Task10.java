// Movie class
class Movie {
    private String title;
    private String director;
    private int releaseYear;

    // Constructor
    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // Polymorphic method
    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
    }
}

// ActionMovie class inheriting from Movie
class ActionMovie extends Movie {
    // Additional attributes specific to ActionMovie (if any)

    // Constructor
    public ActionMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    // Additional methods specific to ActionMovie (if any)
}

// ComedyMovie class inheriting from Movie
class ComedyMovie extends Movie {
    // Additional attributes specific to ComedyMovie (if any)

    // Constructor
    public ComedyMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    // Additional methods specific to ComedyMovie (if any)
}

public class Task10 {
    public static void main(String[] args) {
        // Creating instances of Movie, ActionMovie, and ComedyMovie
        Movie genericMovie = new Movie("Generic Movie", "Generic Director", 2020);
        ActionMovie actionMovie = new ActionMovie("Action Movie", "Action Director", 2021);
        ComedyMovie comedyMovie = new ComedyMovie("Comedy Movie", "Comedy Director", 2022);

        // Displaying movie information using polymorphism
        displayMovieInformation(genericMovie);
        displayMovieInformation(actionMovie);
        displayMovieInformation(comedyMovie);
    }

    // Polymorphic method to display movie information
    public static void displayMovieInformation(Movie movie) {
        System.out.println("=== Movie Information ===");
        movie.displayMovieInfo();
        System.out.println("=========================");
    }
}
