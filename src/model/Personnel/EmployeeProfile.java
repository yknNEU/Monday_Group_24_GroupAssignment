package model.Personnel;

public class EmployeeProfile extends Profile {

    public EmployeeProfile(Person person) {
        super(person); 
    }

    @Override
    public String getRole() {
        return  "Admin";
    }
}