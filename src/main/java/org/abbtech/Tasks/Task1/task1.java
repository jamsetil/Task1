package org.abbtech.Tasks.Task1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println("0-dan verilmish edede qeder butun 2ye bolunen ededler");

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()){
            System.out.println("Ədədi daxil edin");
            int number = scanner.nextInt();
            for (int i =0;i<=number;i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }
    }
}
