package org.abbtech.Tasks.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Library library = new Library();
//    library.addBook("ILyas azizade","faiq azizzade", "sci fi",1990);
//        library.addBook("ILyas azizade1","faiq azizzade2", "dram",1890);
//        library.displayBooks();
//
//        library.numberOfBooks();
//        library.findBookByTitle("ILyas azizzade");




        Library library = new Library();
        System.out.println("Welcome to our library!\nWhat would you like to do");
        System.out.println();
        System.out.println("Press 1 to add a book to our library");
        System.out.println("Press 2 to remove book from library");
        System.out.println("Press 3 to find book by title/author/genre/publication year");
        System.out.println("Press 4 to display books by publication year with ascending order");
        System.out.println("Press 5 to see number of books");
        System.out.println("Press 0 to exit program");
        Scanner scanner = new Scanner(System.in);
       while (scanner.hasNext()){


           String cmd =scanner.next();
           scanner.nextLine();
           switch (cmd){
               case "1":
                   System.out.println("Please enter Title");
                   String title = scanner.nextLine();

                   System.out.println("Please enter Author");
                   String author =  scanner.nextLine();

                   System.out.println("Please enter the Genre");
                   String genre =  scanner.nextLine();

                   System.out.println("Please enter the Publiction year");
                   int year = scanner.nextInt();
                   library.addBook(title,author,genre,year);
                   library.displayBooks();
                   break;
               case "2":
                   System.out.println("Enter the title for removing book from library");
                   String titleToRemove = scanner.next();
                   library.removeBookByTitle(titleToRemove);
                   break;
               case "3":

                   System.out.println("By what would you like to find book \npress 'T' to find by its title\nPress 'A' to" +
                           " find by its Author"+"\nPress 'G' to find by its genre \n Press 'Y' to find book by its " +
                           "publication year");
                  String bookCmd = scanner.next();
                  switch (bookCmd.toUpperCase()){
                      case "T":
                          System.out.println("Please enter the title");
                          String findByTitle = scanner.next();

                          library.findBookByTitle(findByTitle);
                          break;
                      case "A":
                          System.out.println("Please enter the author of the book");
                          String findByAuthor=scanner.next();
                          library.findBookByAuthor(findByAuthor);
                          break;
                      case "G":
                          System.out.println("Please enter the genre of book");
                          String findByGenre = scanner.next();
                          library.findBookByGenre(findByGenre);
                          break;
                      case "Y":
                          System.out.println("Please enter the publication year of the book");
                          int findByYear = scanner.nextInt();
                          library.findBookByPublicationYear(findByYear);
                          break;
                      default:
                          System.out.println("Wrong command!");
                          break;
                  }
               case "4":
                   library.displayBooks();
                   break;
               case "5":
                   library.numberOfBooks();
                   break;
               case "0":
                   scanner.close();
                   break;
               default:
                   System.out.println("Please enter command correctly! ");

           }
       }
        System.out.println("Thanks for using our app");
    }
}
