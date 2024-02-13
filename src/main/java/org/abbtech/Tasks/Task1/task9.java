package org.abbtech.Tasks.Task1;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Faktoriali hesablanacaq ededi daxil edin");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp=0;
        int result=1;

        if (number==0){
            System.out.println(result-1);
        }else{
            for (int i =0;i<number;i++){
                temp=number-i;
                result*=temp;
            }
            System.out.println(result);
        }
        }

}
