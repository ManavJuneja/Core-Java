package OOPS.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_reader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("a.txt");
        }catch (IOException e){
            System.out.println("Checked Exception");
        }



    }

    public static void secondMain(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("a.txt");
    }

    public static void method1() throws FileNotFoundException {
       try{ FileReader fileReader = new FileReader("a.txt");}
       catch (FileNotFoundException e){
           System.out.println("File Not Found");
           throw new FileNotFoundException("OOPS");
       }

    }
}
