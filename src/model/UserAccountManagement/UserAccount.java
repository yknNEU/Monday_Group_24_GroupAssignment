package model.UserAccountManagement;

import model.Personnel.Profile;

public class UserAccount {
    
    private Profile profile;
    private String userName;
    private String password;
    
    public UserAccount(Profile profile, String userName, String password) {
        this.profile = profile;
        this.userName = userName;
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public String getRole() {
        return profile.getRole();
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean isValidUser(String userName, String password) {
        if (this.userName.equalsIgnoreCase(userName) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
