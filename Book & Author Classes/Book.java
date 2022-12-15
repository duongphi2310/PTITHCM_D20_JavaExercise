import java.util.ArrayList;

public class Book {
    private String name;
    ArrayList <Author> authors;
    private double price;
    private int    qtyInStock = 0;

    public Book(String name, ArrayList <Author> authors, double price) {
        this.name    = name;
        this.authors = authors;
        this.price   = price;
    }
    public Book(String name, ArrayList <Author> authors, double price, int qtyInStock) {
        this.name       = name;
        this.authors    = authors;
        this.price      = price;
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
        return "BOOK: " + "\nName: " + name + "\n" + authors
        + "\nPrice:             " + price + "\nQuantity In Stock: " + qtyInStock + "";
    }
    public void printAuthors() {
        for (Author i : this.authors) {
            System.out.print(i.toString() + " "); 
        }
    }
    public boolean addAuthors(Author author){
        try{
            this.authors.add(author);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
