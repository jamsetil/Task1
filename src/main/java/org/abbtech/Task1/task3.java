package org.abbtech.task1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Verilmish ededin butun ededleri cemini tap");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();//12345
        int temp=0;
        while(true){
            int singleDigit = number%10;//5
            temp+=singleDigit;
            number/=10;
            if (singleDigit==0){
                System.out.println(temp);
                break;
            }
        }
    }
}
