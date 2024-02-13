package org.abbtech.Tasks.Task1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("reqemi girin: ");
        int number = scanner.nextInt();


        for (int i = 2; i <= number; i++) {
            boolean sadeEded = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    sadeEded = false;
                    break;
                }
            }
            if (sadeEded) {
                System.out.println(i);
            }
        }


    }
    }

