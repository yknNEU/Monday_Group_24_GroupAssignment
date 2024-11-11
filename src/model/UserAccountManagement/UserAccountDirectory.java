package model.UserAccountManagement;

import java.util.ArrayList;

import model.Personnel.*;

public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount newUserAccount(Profile profile, String userName, String password) {
        UserAccount userAccount = new UserAccount(profile, userName, password);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount findUserAccount(String id) {
        for (UserAccount ua : userAccountList) {
            if (ua.isMatch(id)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount authenticateUser(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.isValidUser(userName, password)) {
                return ua;
            }
        }
        return null;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
}
