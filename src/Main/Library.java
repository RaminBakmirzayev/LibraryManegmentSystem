package Main;

import Bean.Book;
import Util.InputUtil;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void login() {
        String name = InputUtil.requareText("Enter Your name");
        int password = InputUtil.requareNumber("Enter Passworrd");
        if (name.equals("Amina") && password == 20) {
            System.out.println("Succesfully Login!");
        } else {
            System.out.println("Password or name is false");
            login();
        }
    }

    public Book addInfoBook() {
        System.out.println("Enter information about books:");
        String id = InputUtil.requareText("Enter Id");
        String bookName = InputUtil.requareText("Enter Book name");
        String topic = InputUtil.requareText("Enter Book's topic ");
        String publisher = InputUtil.requareText("Enter Publisher name");
        String publishYear = InputUtil.requareText("Enter publish year");
        Book book = new Book(id, bookName, topic, publishYear, publisher);

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


    public void findBookAndRemoveBook() {
        String id = InputUtil.requareText("Enter BookID or Book's name that you want to remove");
        List<Book> removedBooks = findBook(id);
        if (!(removedBooks.isEmpty())) {
            for (Book b : removedBooks) {
                books.remove(b);
                System.out.println("Book got removed");
            }
        } else {
            System.out.println("Not found!.Please be sure you entered right");
        }

        showAllbooks();
    }


    public List<Book> findBook(String text) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if ((b.getName().equalsIgnoreCase(text)) || b.getPublisher().equalsIgnoreCase(text) || b.getId().equals(text)) {
                result.add(b);
            }
        }
        return result;
    }

    public void findBookAndPrintInfo() {
        String text = InputUtil.requareText("Enter BookId or  Book name or publisher name");
        List<Book> booksFound = findBook(text);
        for (Book b : booksFound) {
            System.out.println(b);
        }
    }
}
