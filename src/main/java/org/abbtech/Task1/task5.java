package org.abbtech.Task1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println(" Ededin reqemlerinin sayini tapin");
        System.out.println("ededi daxil edin");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp=1;
        while (true){
            int digit= number/10;
            if (digit==0){

                System.out.println(temp);
                break;
            }
            temp++;
            number/=10;




        }
    }
}
