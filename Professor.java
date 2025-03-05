import java.util.Date;

public class Professor extends AbstractPerson{
    private int departmentId;
    private int officeNumber;

    public Professor() {

    }

    public Professor(int id, String firstname, String lastname, Date birthDate, int contactId, int addressId, int departmentId, int officeNumber) {
        super(id, firstname, lastname, birthDate, contactId, addressId);
        this.departmentId = departmentId;
        this.officeNumber = officeNumber;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

}
