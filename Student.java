import java.util.Date;

public class Student extends AbstractPerson {


    public Student(){

    }

    public Student(int id, String firstname, String lastname, Date birthDate, int contactId, int addressId) {
        super(id, firstname, lastname, birthDate, contactId, addressId);
    }

}
