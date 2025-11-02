import Constant.ErrorMessage;
import Constant.SuccessMessage;
import Constant.common;
import Model.Product;
import Service.ProductController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println(common.MENU);
            int chonce = sc.nextInt();
            sc.nextLine();
            switch (chonce) {
                case 1:
                    System.out.println(common.ENTER_PRODUCT_TYPE);
                    String type = sc.nextLine();
                    System.out.println(common.ENTER_PRODUCT_NAME);
                    String name = sc.nextLine();
                    System.out.println(common.ENTER_PRODUCT_DESCRIPTION);
                    String description = sc.nextLine();
                    System.out.println(common.ENTER_PRODUCT_PRICE);
                    double price = sc.nextDouble();
                    sc.nextLine();
                    ProductController.addProducts(type, name, description, price);
                    System.out.println(SuccessMessage.SUCCESS_ADDPRODUCT);
                    break;
                case 2:
                    System.out.println(common.LIST_PRODUCT);
                    for(Product p : ProductController.getProducts()){
                        System.out.println(p.getInfor());
                    }
                    break;
                case 3 :
                    System.out.println(common.ENTER_FINDPRODUCT_ID);
                    int id = sc.nextInt();
                    sc.nextLine();
                    Product Products = ProductController.getProductById(id);
                    if(Products != null){
                        System.out.println(Products.getInfor());
                    }
                    else System.out.println(ErrorMessage.ERROR_ID);
                    break;
                case 4:
                    System.out.println(common.ENTER_REMOVEPRODUCT_ID);
                    int ID = sc.nextInt();
                    sc.nextLine();
                    ProductController.RemoveById(ID);
                    break;
                case 5:
                    exit = false;
                    System.out.println(common.EXIT_PROGRAMM);
                    break;
                default:
                    System.out.println(ErrorMessage.INVALID_CHONCE);
                    break;
            }
        }
    }
}