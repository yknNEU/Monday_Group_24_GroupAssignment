package model.Personnel;

import java.util.ArrayList;

import model.Business.Business;

public class EmployeeDirectory {

    private Business business;
    private ArrayList<EmployeeProfile> employeeList;

    public EmployeeDirectory(Business business) {
        this.business = business;
        this.employeeList = new ArrayList<EmployeeProfile>();
    }

    public Business getBusiness() {
        return business;
    }

    public ArrayList<EmployeeProfile> getEmployeeList() {
        return employeeList;
    }

    public EmployeeProfile newEmployeeProfile(Person person) {
        EmployeeProfile sp = new EmployeeProfile(person);
        person.setProfile(sp);
        employeeList.add(sp);
        return sp;
    }

    public EmployeeProfile findEmployee(String id) {
        for (EmployeeProfile sp : employeeList) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }

        return null;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
    
    public void setEmployeeList(ArrayList<EmployeeProfile> employeeList) {
        this.employeeList = employeeList;
    }
}
