package org.abbtech.Lessons.Lesson10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        try {
            String string = "Hello World";
            FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Faiq/Desktop/Ilyas.txt");
            fileOutputStream.write(string.getBytes());
            FileInputStream fileInputStream = new FileInputStream("C:/Users/Faiq/Desktop/Ilyas.txt");
            byte[] bytes = fileInputStream.readAllBytes();

            for (byte a:bytes
                 ) {
                System.out.println((char) a );
            }

            Path path = Paths.get("C:/Users/Faiq/Desktop/salam.txt");
            String context = "Salam dunya";

            Files.write(path,context.getBytes());
            Files.readAllBytes(path);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
