package org.abbtech.task3;

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
