package pl.sda.student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Author walaszek = new Author("Bartosz","Walaszek");
        Author policja  =   new Author("Policja","Polska");
        Category dramat = new Category("Dramat");
        Category tragedia = new Category("Tragedia");
        Book book1 = new Book("Wsciekl piesci weza", walaszek, dramat  );
        Book book2 = new Book("Sarnie Zniwa", walaszek, tragedia);
        Book book3 = new Book("Kartki do grania w statki", policja, dramat);
        List<Book> bookList =   new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        JSONedit jsoNedit = new JSONedit();
        jsoNedit.writeList("BookList",bookList);


    }
}
