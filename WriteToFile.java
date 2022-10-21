package OOP.Sprint2.indi2;

import javax.swing.*;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WriteToFile {

    Person p;
    ArrayList<Person> a = new ArrayList<>();

   public WriteToFile(Person p){
       writeToCreatedFile(p);
    }
    public void writeToCreatedFile(Person p){

        PrintStatus ps = new PrintStatus(null);

        ps.printPayingCustomer(p);

        try {

            FileWriter fw = new FileWriter(p.getName()+".txt");

            String ld = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            fw.write(p.getIdNumber()+", "+p.getName()+"\n"+ld+"\n");

            fw.close();

            System.out.println("Successfully wrote to the file.");

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
