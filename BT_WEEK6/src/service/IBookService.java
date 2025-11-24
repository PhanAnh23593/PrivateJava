package service;

import model.Book;

import java.util.ArrayList;
import java.util.Objects;

public interface IBookService {
    void addBook(Book book);
    Book getBookById(String id);
    ArrayList<Book> getAllBooksByCategory(Object category);
    boolean deleteBookById(String id);
    ArrayList<Book> getAllBooks();
    double calculateTotalValue();
}
