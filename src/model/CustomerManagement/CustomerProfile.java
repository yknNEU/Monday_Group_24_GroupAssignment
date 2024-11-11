package model.CustomerManagement;

import java.util.ArrayList;

import model.MarketModel.Market;
import model.OrderManagement.Order;
import model.Personnel.Person;

public class CustomerProfile {
    
    private Person person;
    private ArrayList<Order> orders;
    private ArrayList<Market> markets;
    
    public CustomerProfile(Person person) {
        this.person = person;
        this.orders = new ArrayList<Order>();
        this.markets = new ArrayList<Market>();
    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Market> getMarkets() {
        return markets;
    }

    public String getCustomerId() {
        return person.getPersonId();
    }

    public int getTotalPricePerformance() {
        // TODO: for each order in the customer orderlist 
        // calculate order price performance and add it to the sum

        return 0;
    }
 
    public int getNumberOfOrdersAboveTotalTarget() {
        // for each order in the customer order list 
        // calculate if order is positive (actual order total is greater than sum of item targets
        // if yes then add 1 to total 
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == true) {
                sum++;
            }
        }
        
        return sum;
    }
    
    public int getNumberOfOrdersBelowTotalTarget() {
        // TODO: for each order in the customer order list 
        // calculate if order is negative
        // if yes then add 1 to total 

        return 0;
    }
        
    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order order) {
        orders.add(order);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    }

    @Override
    public String toString() {
        return person.getPersonId();
    }
}
