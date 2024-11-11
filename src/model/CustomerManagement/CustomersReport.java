package model.CustomerManagement;

import java.util.ArrayList;

public class CustomersReport {
    
    private ArrayList<CustomerSummary> customerList;
    
    public CustomersReport() {
        this.customerList = new ArrayList<CustomerSummary>();
    }

    public ArrayList<CustomerSummary> getCustomerList() {
        return customerList;
    }

    public void addCustomerSummary(CustomerSummary cs) {
        // TODO: Add customer summary to the list
    }

    public void setCustomerList(ArrayList<CustomerSummary> customerList) {
        this.customerList = customerList;
    }
}
