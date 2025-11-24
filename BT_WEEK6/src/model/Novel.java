package model;

import service.Borrowable;

public class Novel extends Book {
    String genre;

    public Novel(String title,String author,double price,int quantity,String genre) {
        super(title,author,price,quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
