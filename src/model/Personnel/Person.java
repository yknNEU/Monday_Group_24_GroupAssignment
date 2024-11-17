package model.Personnel;

public class Person {

    private String id;
    private Profile profile;

    public Person(String id) {
        this.id = id;
        this.profile = null;
    }

    public Person(String id, Profile profile) {
        this.id = id;
        this.profile = profile;
    }

    public String getPersonId() {
        return id;
    }

    public Profile getProfile() {
        return profile;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public String getRole() {
        if (profile == null) {
            return "None";
        }
        return profile.getRole();
    }

    public void setPersonId(String id) {
        this.id = id;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return getPersonId();
    }
}