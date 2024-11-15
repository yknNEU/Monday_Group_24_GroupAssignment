package ui;

import model.Business.Business;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.ProductManagement.Product;
import model.Supplier.Supplier;
import model.UserAccountManagement.UserAccount;

public class Util {

    public static Person createPerson(Business business, String id) {
        Person person = business.getPersonDirectory().newPerson(id);
        return person;
    }

    public static Supplier createSupplier(Business business, String name) {
        Supplier supplier = business.getSuppliers().newSupplier(name);
        return supplier;
    }

    public static Product createProduct(Supplier supplier, int floorPrice, int ceilingPrice, int targetPrice) {
        Product product = supplier.getProductCatalog().newProduct(floorPrice, ceilingPrice, targetPrice);
        return product;
    }

    public static UserAccount createAdminAccount(Business business, String id, String username, String password) {
        Person person = business.getPersonDirectory().newPerson(id);
        Profile profile = business.getEmployeeDirectory().newEmployeeProfile(person);
        UserAccount userAccount = business.getUserAccountDirectory().newUserAccount(profile, username, password);
        return userAccount;
    }

    public static UserAccount createMarketingPersonAccount(Business business, String id, String username, String password) {
        Person person = business.getPersonDirectory().newPerson(id);
        Profile profile = business.getMarketingPersonDirectory().newMarketingPersonProfile(person);
        UserAccount userAccount = business.getUserAccountDirectory().newUserAccount(profile, username, password);
        return userAccount;
    }

    public static UserAccount createSalesPersonAccount(Business business, String id, String username, String password) {
        Person person = business.getPersonDirectory().newPerson(id);
        Profile profile = business.getSalesPersonDirectory().newSalesPersonProfile(person);
        UserAccount userAccount = business.getUserAccountDirectory().newUserAccount(profile, username, password);
        return userAccount;
    }

    public static UserAccount createCustomerAccount(Business business, String id, String username, String password) {
        Person person = business.getPersonDirectory().newPerson(id);
        Profile profile = business.getCustomerDirectory().newCustomerProfile(person);
        UserAccount userAccount = business.getUserAccountDirectory().newUserAccount(profile, username, password);
        return userAccount;
    }
}
