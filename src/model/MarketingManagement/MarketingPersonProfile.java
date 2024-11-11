package model.MarketingManagement;

import java.util.ArrayList;

import model.OrderManagement.Order;
import model.Personnel.Person;
import model.Personnel.Profile;

public class MarketingPersonProfile extends Profile {

    private ArrayList<Order> salesOrders;

    public MarketingPersonProfile(Person person) {
        super(person); 
        this.salesOrders = new ArrayList<Order>();
    }

    public ArrayList<Order> getSalesOrders() {
        return salesOrders;
    }

    public void addSalesOrder(Order order) {
        salesOrders.add(order);
    }

    public void setSalesOrders(ArrayList<Order> salesOrders) {
        this.salesOrders = salesOrders;
    }

    @Override
    public String getRole() {
        return "Marketing";
    }
}
