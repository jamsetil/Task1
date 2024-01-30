package org.abbtech;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {


    static public void main(String[] args) {

//        int length=10;
//        int width=12;
//
//        int area = width*length;
//        int perimeter = 2*(length+width);
//
//        System.out.println("area= "+area+"perimeter= "+perimeter);
//
//        float num1=481;
//        float num2=24;
//
//        float sum = num1+num2;
//        float difference = num1-num2;
//        float product =num1*num2;
//        float quotient=num1/num2;
//        float remainder = num1%num2;
//
//        System.out.println("sum= "+sum+"\ndifference"+difference);

//        System.out.println("yashi girin");
//        Scanner scanner = new Scanner(System.in);
//        int yash = scanner.nextInt();
//
//        if (0<=yash&& yash<=2){
//            System.out.println("infrant");
//        }else if(3<=yash&& yash<=12){
//            System.out.println("child");
//        }else if(13<=yash && yash<=19){
//            System.out.println("teeneger");
//        }else System.out.println("older");
//
//    }



        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.print("Great");
            case 'C':
                System.out.println("Satisfactionary");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Failed, please retake exam");
                break;
        }



        }



}