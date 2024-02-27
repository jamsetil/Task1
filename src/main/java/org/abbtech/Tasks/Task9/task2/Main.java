package org.abbtech.Tasks.Task9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void validatePoint(int point) throws InvalidInputException{
        if (point<51){
            throw new InvalidInputException();
        } else if (50<point) {
            System.out.println("Congrats you have passed the exam");
        }
    }


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        boolean isNumber=true;
        int points=0;
        while (isNumber){
            try { System.out.println("Please enter your points to find out if you passed the exam or not");
                points=scanner.nextInt();
                try {
                    validatePoint(points);
                }catch (InvalidInputException e){
                    System.out.println("Sorry you have failed:(");
                }
            }catch (InputMismatchException e){
                System.out.println("Wrong format  enter number format!");
                scanner.nextLine();
            }
        }

       }
}


/* Scanner scanner = new Scanner(System.in);
        int point = 0;
        boolean isNumber = true;
        System.out.println("Enter your points");
                while (isNumber){
                    try {
                        point=scanner.nextInt();
                         try {
                         validatePoint(point);
                        }catch (InvalidInputException e){
                System.out.println("Sry you have failed");
                }
                     }catch (Exception e){
                System.out.println("Please enter your point in digits! ");
                 isNumber=false;
                }

                }*/