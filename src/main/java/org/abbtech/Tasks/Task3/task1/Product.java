package org.abbtech.Tasks.Task3.task1;


import java.util.Scanner;

 class ProductTest {

    public static void main(String[] args) {
        System.out.println("please enter the name of product");
        Scanner scanner = new Scanner(System.in);
        String pName = scanner.nextLine();

        Product product = new Product(pName);
        System.out.println("Product name: "+product.productName+"\nCompany name: "+Product.companyName+"\nProduct id: "+product.productID);
    }
}

public class Product {
    static String companyName;
    int productID;
    String productName;

    static {
       companyName = "Rolex";
    }

    {
        productID=1000;
        productID++;
    }

    Product(String productName){
        this.productName=productName;
    }
}
