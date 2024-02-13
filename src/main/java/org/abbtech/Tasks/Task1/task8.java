package org.abbtech.Tasks.Task1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Ededleri daxil edin");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b =scanner.nextInt();


        System.out.println("Emeliyati sechin -->(*,/,+,-)");
        String procedure = scanner.next();
        switch (procedure){
            case "*":
                System.out.println("Vurma emeliyyati "+ (a*b));
                break;
            case "/":
                if (b==0) {
                    System.out.println("0-a bolmek olmaz !");
                    break;
                }
                System.out.println("Bolme Emeliyyati "+ (a/b));
                break;
            case "-":
                System.out.println("Chixma emeliyyati "+(a-b));
                break;
            case "+":
                System.out.println("toplama emeliyyati "+ (a+b));
                break;
            default:
                System.out.println("duzgun emeliyyati sechin !");
                break;
        }
    }
}
