package OOP.Sprint2.indi2;

import javax.swing.*;
import java.util.ArrayList;

public class RunProgram {

    RunProgram(){
        startProgram();
    }
    public void startProgram() {

        String[] options = {"Check member status", "See list of members", "Exit"};
        int choice = JOptionPane.showOptionDialog(null, "What would you like to do?", "Options",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);

        switch (choice) {
            case 1 -> {

                ArrayList<Person> a = new CreateArray().readToArraylist();
                JOptionPane.showMessageDialog(null, a.get(0).getName()+"\n"+
                        a.get(1).getName()+"\n"+ a.get(2).getName()+"\n"+ a.get(3).getName()+"\n"+
                        a.get(4).getName()+"\n"+ a.get(5).getName()+"\n"+ a.get(6).getName()+"\n"+
                        a.get(7).getName()+"\n"+ a.get(8).getName()+"\n"+ a.get(9).getName()+"\n"+
                        a.get(10).getName()+"\n"+ a.get(11).getName()+"\n"+ a.get(12).getName()+"\n"+
                        a.get(13).getName()+"\n");
                new RunProgram();
            }
            case 0 -> {

                Lookup l = new Lookup("","");
                l.isValidMembership(l.compareCustomerInfo(getInfoOnCustomer()));
            }
            case 2 -> {
                System.exit(1);
            }
        }
    }
    public String getInfoOnCustomer() {

        String info = JOptionPane.showInputDialog("The name or ID of the person you want to look up");
        if (info == null) {
            JOptionPane.showMessageDialog(null, "Error! Program will terminate");
            System.exit(-1);
        }
        return info;
    }

}
