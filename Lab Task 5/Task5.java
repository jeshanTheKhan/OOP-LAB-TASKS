class CatalogItem {
    private String title;
    private String author;
    private int year;

    // Constructor
    public CatalogItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter and Setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display details method
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class Book extends CatalogItem {
    private int numberOfPages;

    // Constructor
    public Book(String title, String author, int year, int numberOfPages) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
    }

    // Getter and Setter methods for numberOfPages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

class DVD extends CatalogItem {
    private String director;

    // Constructor
    public DVD(String title, String author, int year, String director) {
        super(title, author, year);
        this.director = director;
    }

    // Getter and Setter methods for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Director: " + director);
    }
}

public class Task5 {
    public static void main(String[] args) {
        // Example usage
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 224);
        DVD dvd = new DVD("The Shawshank Redemption", "Frank Darabont", 1994, "Frank Darabont");

        // Display details using polymorphism
        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println("\nDVD Details:");
        dvd.displayDetails();
    }
}
