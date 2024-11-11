package model.SalesManagement;

import java.util.ArrayList;

import model.Business.Business;
import model.Personnel.Person;

public class SalesPersonDirectory {

    private Business business;
    private ArrayList<SalesPersonProfile> salesPersonList;

    public SalesPersonDirectory(Business business) {
        this.business = business;
        this.salesPersonList = new ArrayList<SalesPersonProfile>();
    }

    public Business getBusiness() {
        return business;
    }

    public ArrayList<SalesPersonProfile> getSalesPersonList() {
        return salesPersonList;
    }

    public SalesPersonProfile newSalesPersonProfile(Person person) {
        SalesPersonProfile sp = new SalesPersonProfile(person);
        salesPersonList.add(sp);
        return sp;
    }

    public SalesPersonProfile findSalesPerson(String id) {
        for (SalesPersonProfile sp : salesPersonList) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }

        return null;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void setSalesPersonList(ArrayList<SalesPersonProfile> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }
}
