package org.abbtech.task1;

public class task10 {
    public static void main(String[] args) {
        String spacing = " ";

        for (int i = 1;i<10;i++){
            System.out.println();
            for (int j =0;j<i;j++){
                System.out.print("*");
            }

        }

        for (int i =1;i<10;i++){
            System.out.println();
            for (int j =10;j>=i;j--){
                System.out.print(" ");
            }
            for (int k =0; k<i;k++){
                System.out.print("*");
            }
        }
    }
}
