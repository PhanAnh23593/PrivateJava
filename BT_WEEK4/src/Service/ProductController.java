package Service;

import Constant.ErrorMessage;
import Constant.SuccessMessage;
import Constant.common;
import Model.Laptop;
import Model.Product;
import Model.Smartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public static ArrayList<Product>  products= new ArrayList<>();

    static {
        products.add(new Smartphone("Iphone 17","SANG, XỊN , MIN;",34000000,true));
        products.add(new Smartphone("Android","Phe",1200000,false));

        products.add(new Laptop("HP","xiêu xịn",160000,"8GP","Intel J8"));
        products.add(new Laptop("Acess","ĐƯỢC ",120000,"4GB","Intell j4"));
    }



    public ProductController() {}
    public void addProduct(Product product) {
        products.add(product);
    }
    public static void addProducts(String type,String name, String description, double price) {
        Scanner sc = new Scanner(System.in);
        if (type.equalsIgnoreCase("Laptop")) {
            System.out.println(common.ENTER_LAPTOP_RAM);
            String ram = sc.nextLine();
            System.out.println(common.ENTER_LAPTOP_CPU);
            String cpu = sc.nextLine();
            products.add(new Laptop(name, description, price,ram,cpu));
        }
        else if (type.equalsIgnoreCase("Smartphone")) {
            System.out.println(common.ENTER_SMARTPHONE_HAS5G);
            String check=sc.nextLine();
            boolean has5g = false;
            has5g = check.equalsIgnoreCase("Co");
            products.add(new Smartphone(name,description,price,has5g));
        }
    }

    public static void RemoveById(int id){
        boolean check = false;
        for(Product p :  products){
            if(p.getId()==id){
                products.remove(p);
                System.out.println(SuccessMessage.SUCCESS_REMOVEMODEL);
                check = true;
                return;
            }
        }
        if(check == false){
            System.out.println(ErrorMessage.ERROR_ID);
        }
    }

    public static Product getProductById(int id){
        for(Product p :  products){
            if(p.getId()==id){
                return p;
            }
        }
            return null;
    }
    public static ArrayList<Product> getProducts(){
        return products;
    }
}

