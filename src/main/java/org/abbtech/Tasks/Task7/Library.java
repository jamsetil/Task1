package org.abbtech.Tasks.Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


public class Library {
   private List<Book> bookList = new ArrayList<>();

   public void addBook(String title,String author,String genre,int pubYear){
    Book book = new Book(title,author,genre,pubYear);
    bookList.add(book);
       System.out.println("Book "+title+" added to library! ");
   };
   public void removeBookByTitle(String title){
       if (bookList.stream().anyMatch(book -> book.getTitle().equals(title))){
           bookList.removeIf(book -> book.getTitle().equals(title));
           System.out.println("Book "+title+" has been deleted!");
       }else System.out.println("Couldn't find the book");


   };
   public void findBookByTitle(String title){
       if (bookList.stream().anyMatch(book -> book.getTitle().equals(title))){
           System.out.println("Book with title "+title+" has found!");
       }else System.out.println("Book with title "+title+" not found!");


   };

   //bir muellifin coxlu kitabi ola biler
    public void findBookByAuthor(String author){
        if (bookList.stream().anyMatch(book -> book.getAuthor().equals(author))){
            System.out.println("Book(s) with author "+author+" has found!");
            bookList.stream()
                    .filter(book -> book.getAuthor().equals(author))
                    .forEach(book -> System.out.println("Title: "+book.getTitle()+"\nAuthor: "+ book.getAuthor()));
        }else System.out.println("Book(s) with author "+author+" not found!");
    };
    public void findBookByGenre(String genre){
        if (bookList.stream().anyMatch(book -> book.getGenre().equals(genre))){
            System.out.println("Book(s) with genre "+genre+" has found!");
            bookList.stream()
                    .filter(book -> book.getGenre().equals(genre))
                    .forEach(book -> System.out.println("Title: "+book.getTitle()+"\nGenre: "+ book.getGenre()));
        }else System.out.println("Book(s) with genre "+genre+" not found!");
    };
    public void findBookByPublicationYear(int year){
        if (bookList.stream().anyMatch(book -> book.getPublicationYear()==year)){
            System.out.println("Book(s) with publication years of "+ year+" has found");
           bookList.stream()
                   .filter(book -> book.getPublicationYear()==year)
                   .forEach(book -> System.out.println("Title: "+book.getTitle()+"\nYear: "+ book.getPublicationYear()));
        }
    };
    public void displayBooks(){
        if (bookList.size()>0){
           bookList.stream().sorted((b1,b2)->Integer
                    .compare(b1.getPublicationYear(), b2.getPublicationYear()))
                   .forEach(book -> System.out.println(book) );
        }else System.out.println("There is no book in library! ");
    };
    public void averageYearOfAllBooks(){

        if (bookList.size()>0){
           OptionalDouble optionalDouble= bookList.stream().mapToInt(b->b.getPublicationYear()).average();
            System.out.println("Average year of all books in library is "+optionalDouble.getAsDouble());
        }else System.out.println("There is no book in library!");


    };
    public void numberOfBooks() {
        if (bookList.size()>0){
            System.out.println("Number of books in library are: "+bookList.stream().count());
        }else System.out.println("There is no book in library!");
    };
}
