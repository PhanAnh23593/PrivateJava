package service.impl;

import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;

import java.util.ArrayList;
import java.util.Scanner;

public class IBookServiceImpl implements IBookService {
    Scanner sc = new Scanner(System.in);
    private static ArrayList<Book> books = new ArrayList<>();
    static{
        books.add(new Novel("Hero","ANH HOANG",1,13,"điệnq quang"));
        books.add(new Novel("Ghost","Hoàng Anh",123,3,"ma"));
        books.add(new Novel("Ghost","Phan Anh",123,3,"SIuuu"));

        books.add(new TextBook("MART","ANH",1,3,"TOÁN"));
        books.add(new TextBook("MART","HOANG",3,3,"ĐẠI SỐ"));
    }


    public Book Input_Book(){
        System.out.println("1. TextBook, 2. Novel");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());
        Book newbook;
        if (type == 1) {
            System.out.print("Subject: ");
            String sub = sc.nextLine();
            newbook = new TextBook( title, author, price, qty, sub);
        } else {
            System.out.print("Genre: ");
            String genre = sc.nextLine();
            newbook = new TextBook( title, author, price, qty, genre);
        }
        return newbook;
    }


    @Override
    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Book getBookById(String id){
        for(Book book1 : books){
            if(book1.getId().equals(id)){
                return book1;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooksByCategory(Object category){
        ArrayList<Book> results = new ArrayList<>();
        for(Book book : books){
            if(category.equals("Novel") && book instanceof Novel){
                results.add(book);
            }
            else if(category.equals("TextBook") && book instanceof TextBook ){
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public boolean deleteBookById(String id){
        return books.removeIf(a ->a.getId().equals(id));
    }
    @Override
    public ArrayList<Book> getAllBooks(){
        return books;
    }
    @Override
    public double calculateTotalValue(){
        double totalValue = 0;
        for(Book book : books){
            totalValue += book.getPrice()*book.getQuantity();
        }
        return totalValue;
    }






}
