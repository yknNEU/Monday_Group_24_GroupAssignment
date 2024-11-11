package model.Personnel;

public class Person {

    private String id;

    public Person(String id) {
        this.id = id;
    }

    public String getPersonId() {
        return id;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void setPersonId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getPersonId();
    }
}