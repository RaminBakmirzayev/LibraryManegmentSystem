package Main;

import Bean.Book;
import Util.InputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {


    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void login() {
        String name = InputUtil.requareText("Enter Your name");
        int password = InputUtil.requareNumber("Enter Passworrd");
        if (name.equals("Amina") && password == 20231231) {
            System.out.println("Succesfully Login!");
        } else {
            System.out.println("Password or name is false");
            login();
        }

    }

    public Book addInfoBook() {
        System.out.println("Enter information about books:");
        int id = InputUtil.requareNumber("Enter Id");
        String bookName = InputUtil.requareText("Enter Book name");
        String topic = InputUtil.requareText("Enter Book's topic ");
        String publisher = InputUtil.requareText("Enter Publisher name");
        String publishYear = InputUtil.requareText("Enter publish year");
        Book book = new Book(id, bookName, topic, publisher, publishYear);

        return book;
    }

    public void addBook() {
        int number = InputUtil.requareNumber("How many books you add?");
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + ".book adding process");
            books.add(addInfoBook());

        }
        System.out.println("Succesfully added");
        showAllbooks();
    }

    public void showAllbooks() {
        for (Book b : books) {
            System.out.println(b.getId() + "->" + b.getName());
        }
    }

    public void getBooksInfo() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    public void removeBook() {
        showAllbooks();
        int id = InputUtil.requareNumber("Enter BookID that you want to remove");
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
            } else {
                System.out.println("Something got wrong.Please,sure that you enter right Id");
            }
            System.out.println("Book got removed");
            showAllbooks();
        }

    }
public void findBook(){
        
}

}
