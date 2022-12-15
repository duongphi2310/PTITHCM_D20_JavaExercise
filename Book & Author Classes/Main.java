import java.util.ArrayList;

public class Main {  
    public static void main(String[] args) {
        ArrayList <Author> listAuthors = new ArrayList <Author> ();
        Author author1 = new Author("Wed", "wed@gmail.com", 'M');
        Author author2 = new Author("Nguyen Duong Phi", "n20dccn125@student.ptithcm.edu.vn", 'M');
        listAuthors.add(author1);
        listAuthors.add(author2);
        Book book = new Book("OOP", listAuthors, 200, 20);
        Author author3 = new Author("Tran Viet Anh", "n20dccn087@student.ptithcm.edu.vn", 'M');
        listAuthors.add(author3);
        System.out.println(book.toString());

        System.out.println("");
        ArrayList <Author> listAuthors2 = new ArrayList <Author> ();
        Book book2 = new Book("PYTHON", listAuthors2, 150, 23);
        Author author4 = new Author("Tuyet Hai", "tuyethai@ptithcm.edu.vn", 'F');
        listAuthors2.add(author4);
        System.out.println(book2.toString());
    }
    
}