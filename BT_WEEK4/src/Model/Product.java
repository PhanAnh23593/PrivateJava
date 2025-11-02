package Model;

import java.util.Random;

public class Product {
    private int Id;
    private String name;
    private String  description;
    private double price;

    public Product( String name, String description, double price) {
        this.Id = new Random().nextInt(1000);
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Product() {
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getByID(int id){
        if(this.Id == id){
            return this;
        }
        else{
            return null;
        }
    }
    public String getInfor() {
        return  "Id : " + this.Id + "\n" +
                "Tên: " + this.name + "\n" +
                "Giá: " + String.format("%,.0f", this.price) + "\n" +
                "Mô tả: " + this.description + "\n";
    }

    @Override
    public String toString() {
        return "Product{ " +
                "Id= " + Id +
                ", name= '" + name + '\'' +
                ", description= '" + description + '\'' +
                ", price= " + price +
                '}';
    }
}
