package OOP.Sprint2.indi2;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AddCustomer {




    public AddCustomer(){

    }

    public Person addCustomer(){

        String name = JOptionPane.showInputDialog("The name of the person you want to add");
        String id = JOptionPane.showInputDialog("The ID of the person you want to add");
        if(!checkInput(name,id)){
            JOptionPane.showMessageDialog(null, "Invalid input program will terminate");
            System.exit(-1);
        }
        String ld = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Person person = new Person(null, null, null);
        person.setIdNumber(id);
        person.setName(name);
        person.setDateOfMembership(ld);
        return person;
    }
    public boolean checkInput(String name, String id){
        return name != null && id != null && !name.isEmpty() && id.length() == 10;
    }
}
