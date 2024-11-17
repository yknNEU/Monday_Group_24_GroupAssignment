package model.CustomerManagement;

import java.util.ArrayList;

import model.MarketModel.Market;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.SalesManagement.SalesPersonProfile;

public class CustomerProfile extends Profile {
    
    private ArrayList<Order> cart;
    private ArrayList<Order> orders;
    private ArrayList<Market> markets;
    
    public CustomerProfile(Person person) {
        super(person);
        this.cart = new ArrayList<Order>();
        this.orders = new ArrayList<Order>();
        this.markets = new ArrayList<Market>();
    }

    public ArrayList<Order> getCart() {
        return cart;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Market> getMarkets() {
        return markets;
    }

    public String getCustomerId() {
        return this.getPerson().getPersonId();
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
        if (this.getPerson().getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order order) {
        orders.add(order);
    }

    public void addItemToCart(OrderItem orderItem, SalesPersonProfile salesPersonProfile) {
        for (Order order : cart) {
            if (order.getSalesPerson().isMatch(salesPersonProfile.getPerson().getPersonId())) {
                for (OrderItem item : order.getOrderItems()) {
                    if (item.getSelectedProduct() == orderItem.getSelectedProduct()) {
                        item.setQuantity(item.getQuantity() + orderItem.getQuantity());
                        return;
                    }
                }
                order.getOrderItems().add(orderItem);
                return;
            }
        }
        Order order = new Order();
        order.setSalesPerson(salesPersonProfile);
        order.getOrderItems().add(orderItem);
        cart.add(order);
    }

    public void removeItemFromCart(OrderItem orderItem) {
        for (Order order : cart) {
            for (OrderItem item : order.getOrderItems()) {
                if (item.getSelectedProduct() == orderItem.getSelectedProduct()) {
                    order.getOrderItems().remove(item);
                    return;
                }
            }
        }
    }

    public int checkout() {
        int total = 0;
        for (Order order : cart) {
            for (OrderItem orderItem : order.getOrderItems()) {
                orderItem.getSelectedProduct().getOrderItems().add(orderItem);
                orderItem.getSelectedProduct().getAvailable().setQuantity(orderItem.getSelectedProduct().getAvailable().getQuantity() - orderItem.getQuantity());
                total += orderItem.getActualPrice() * orderItem.getQuantity();
            }
            orders.add(order);
        }
        cart.clear();
        return total;
    }

    public int calculateTotalAmount() {
        int total = 0;
        for (Order order : cart) {
            for (OrderItem orderItem : order.getOrderItems()) {
                total += orderItem.getActualPrice() * orderItem.getQuantity();
            }
        }
        return total;
    }

    public void setCart(ArrayList<Order> cart) {
        this.cart = cart;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public String toString() {
        return this.getPerson().getPersonId();
    }
}
