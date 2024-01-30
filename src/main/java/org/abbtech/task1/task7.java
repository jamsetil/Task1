package org.abbtech.task1;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        System.out.println(" Üçbucağın tərəflərini daxil edin");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a+b)<c){
            System.out.println("2 tərəfin cəmi üçüncü tərəfdən kiçik ola bilməz !");
        }else if ((a+c)<b)
            System.out.println("2 tərəfin cəmi üçüncü tərəfdən kiçik ola bilməz !");
        else if ((b+c)<a)
            System.out.println("2 tərəfin cəmi üçüncü tərəfdən kiçik ola bilməz !");
        else System.out.println("Üçbucaqdır");
    }
}
