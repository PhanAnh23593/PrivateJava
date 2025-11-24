package model;

public class TextBook extends Book{
    private String subject;

    public TextBook(String title,String author,double price,int qty,String subject) {
        super(title,author,price,qty);
        this.subject = subject;
    }
    public TextBook(){}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
