package org.abbtech.Tasks.Task9.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntSquare {
   static Scanner scanner = new Scanner(System.in);

   static void sqrFinder(){
       int a=0;
       while (true){
        try {
            System.out.println("Enter number to get its square");
            a =scanner.nextInt();
        }catch (InputMismatchException exception){
            System.out.println("enter the number not string! ");
            scanner.nextLine();
            continue;
        }
    scanner.nextLine();
       System.out.println("square value of entered number is: "+ (a*a));
       return;
    }}

}
