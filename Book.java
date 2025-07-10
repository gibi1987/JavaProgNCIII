public class Book {
    // Attributes
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private String isbn;
    private double price;

    // Constructor to initialize all attributes
    public Book(String title, String author, String publisher, int yearPublished, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.price = price;
    }

    // Method to display book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "HarperCollins", 1988, "978-0061122415", 14.99);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949, "978-0451524935", 9.99);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, "978-0060935467", 12.50);

        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
    }
}
