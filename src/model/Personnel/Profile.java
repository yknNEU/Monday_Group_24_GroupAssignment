package model.Personnel;

public abstract class Profile {
    
    private Person person;

    public Profile(Person person) {
        this.person = person;
    }
    
    public abstract String getRole();
    
    public Person getPerson() {
        return person;
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
