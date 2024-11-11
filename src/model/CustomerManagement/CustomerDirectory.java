package model.CustomerManagement;

import java.util.ArrayList;
import model.Business.Business;
import model.Personnel.Person;

public class CustomerDirectory {

    private Business business;
    private ArrayList<CustomerProfile> customerList;

    public CustomerDirectory(Business business) {
        this.business = business;
        this.customerList = new ArrayList<CustomerProfile>();
    }

    public Business getBusiness() {
        return business;
    }

    public ArrayList<CustomerProfile> getCustomerList() {
        return customerList;
    }

    public CustomerProfile newCustomerProfile(Person person) {
        CustomerProfile sp = new CustomerProfile(person);
        customerList.add(sp);
        return sp;
    }

    public CustomerProfile findCustomer(String id) {
        for (CustomerProfile sp : customerList) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }

        return null;
    }

    public CustomersReport generatCustomerPerformanceReport() {
        CustomersReport customersReport = new CustomersReport();
        for (CustomerProfile cp: customerList) {
            CustomerSummary cs = new CustomerSummary(cp);
            customersReport.addCustomerSummary(cs);
        }
        return customersReport; 
    } 

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void setCustomerList(ArrayList<CustomerProfile> customerList) {
        this.customerList = customerList;
    }
}
