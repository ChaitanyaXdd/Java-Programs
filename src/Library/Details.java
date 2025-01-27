package Library;

import Publication.Book;

public class Details {
    public static void main(String[] args) {

        Book b = new Book();

        System.out.println("Book Name: " + b.bname);
        System.out.println("Book Price: " + b.price);
        System.out.println("Book Author: " + b.author);

    }
}
