package OOP.Sprint2.indi2;



import java.io.BufferedReader;
import java.util.ArrayList;

public class CreateArray {

    Read r = new Read();
    BufferedReader reader;
    StringBuilder builder;
    private ArrayList<Person> p = new ArrayList<>();

    public CreateArray(){
       reader = r.initiateReader(GetFilePath.PATH.path);
       builder = r.initiateBuilder();

    }
    public ArrayList<Person> readToArraylist() {

        try {
            String input;
            String createdString = "";

            while ((input = reader.readLine()) != null) {
                builder.append(input);
                createdString = createdString + input + ",";
                builder.append(System.lineSeparator());
            }

            reader.close();

            String[] newInput = createdString.split(",");
            for (int i = 0; i < newInput.length; i++) {
                Person person = new Person(null,null,null);
                person.setIdNumber(newInput[i]);
                i++;
                person.setName(newInput[i].trim());
                i++;
                person.setDateOfMembership(newInput[i]);
                p.add(person);
            }
            return p;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
