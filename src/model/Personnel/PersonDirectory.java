package model.Personnel;

import java.util.ArrayList;

public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public Person newPerson(String id) {
        Person p = new Person(id);
        personList.add(p);
        return p;
    }

    public Person findPerson(String id) {
        for (Person p : personList) {
            if (p.isMatch(id)) {
                return p;
            }
        }
        return null;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
}
