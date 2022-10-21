package OOP.Sprint2.indi2;

public class Person {
    protected String name;
    protected  String idNumber;
    protected String dateOfMembership;

    public Person(String idNumber, String name, String dateOfMembership ){
        this.idNumber = idNumber;
        this.name = name;
        this.dateOfMembership = dateOfMembership;

    }
    public String getIdNumber() {

        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getDateOfMembership() {

        return dateOfMembership;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

}