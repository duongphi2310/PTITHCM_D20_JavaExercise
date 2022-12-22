import java.util.ArrayList;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString() {
        return "AUTHOR: {Name: " + name + ", Email: " + email + ", Gender: " + gender + "}";
    }
}

class Book {
    private String name;
    ArrayList <Author> authors;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, ArrayList <Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, ArrayList <Author> authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public ArrayList <Author> getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public String toString() {
        return "Book: [Name: " + name + ", Author: " + authors
                + ", Price: " + price + ", Quantity In Stock: " + qtyInStock + "]";
    }
    public void printAuthors() {
        for (Author author : this.authors) {
            System.out.println(author.toString() + " ");
        }
    }
    public boolean addAuthor(Author author) {
        try {
            this.authors.add(author);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

public class Book_Author {
    public static void main(String[] args) {
        Author author1 = new Author("Wed", "wed@gmail.com", 'M');
        Author author2 = new Author("Duong Phi", "n20dccn125@student.ptithcm.edu.vn", 'M');
        ArrayList <Author> listAuthors = new ArrayList <Author> ();
        listAuthors.add(author1);
        listAuthors.add(author2);
        Book book1 = new Book("OOP", listAuthors, 200, 20);
        Author author3 = new Author("Viet Anh", "n20dccn087@student.ptithcm.edu.vn", 'M');
        listAuthors.add(author3);
        System.out.println(book1.toString());
    }
}
