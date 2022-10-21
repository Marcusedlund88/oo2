package OOP.Sprint2.indi2;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Lookup {
    CreateArray c = new CreateArray();
    ArrayList<Person> a;
    protected String test;
    protected String info;


    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public String getTest() {
        return test;
    }
    public void setTest(String test) {
        this.test = test;
    }

    Lookup(String info, String test){
        a = c.readToArraylist();
        this.info = info;
        this.test = test;

    }

    public Person compareCustomerInfo(String info){
        String tempInfo = info.trim();
        for (Person p : a) {
            String personId = p.getIdNumber().trim();
            String personName = p.getName().trim();

            if(tempInfo.equalsIgnoreCase(personId)||tempInfo.equalsIgnoreCase(personName)){
                return p;
            }
        }
        return null;
        }


    public boolean isValidMembership(Person person){

        if(person == null) {
            PrintStatus ps = new PrintStatus(null);
            ps.printCustomerStatus(person);
        }
        else{

            String ld = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            int ldTemp = Integer.parseInt(ld);

            //Might have used a StringBuilder here
            String[] date = person.getDateOfMembership().split("-");
            String unParsedDate = date[0]+date[1]+date[2];
            int dateTemp = Integer.parseInt(unParsedDate);

            if(ldTemp-dateTemp<=10000){
                if(test.equals("test")) {
                    return true;
                }
                new WriteToFile(person);
                return true;
            }
            else{
                if(test.equals("test")) {
                    return false;
                }
                PrintStatus ps = new PrintStatus(null);
                ps.printCustomerStatus(person);
                return false;
                //new WriteToFile(person);
            }
        }
        return false;
    }
}
