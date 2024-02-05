package org.abbtech.task3;

import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {
        System.out.println("please enter th name of product");
        Scanner scanner = new Scanner(System.in);
        String pName = scanner.nextLine();

        Product product = new Product(pName);
        System.out.println("Product name: "+product.productName+"\nCompany name: "+Product.companyName+"\nProduct id: "+product.productID);
    }
}
