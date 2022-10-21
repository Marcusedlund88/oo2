package OOP.Sprint2.indi2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrintStatus {

    PrintStatus(Person person){

    }
    public void printPayingCustomer(Person person){
        long days = getTimeSincePayment(person);
        JOptionPane.showMessageDialog(null, person.getName()+
                " is a paying member! Last payment was "+days+" days ago.");
    }
    public void printCustomerStatus(Person person){
        if(person == null) {
            JOptionPane.showMessageDialog(null, "Not a customer");
        }
        else{
                long days = getTimeSincePayment(person);
                JOptionPane.showMessageDialog(null, person.getName()+
                        "Has not payed his/hers membership in "+ days+" days");
        }
    }
    public long getTimeSincePayment(Person person){
        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "yyyy-MM-dd");
        try{
            String ld = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Date d1 = sdf.parse(ld);
            Date d2 = sdf.parse(person.getDateOfMembership());
            long difference = d1.getTime() - d2.getTime();;
            return (difference/(1000*3600*24));
        }
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
