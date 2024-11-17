package model.OrderManagement;

import java.util.ArrayList;

import model.CustomerManagement.CustomerProfile;
import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.Product;
import model.SalesManagement.SalesPersonProfile;

public class Order {

    private ArrayList<OrderItem> orderItems;
    private CustomerProfile customer;
    private SalesPersonProfile salesPerson;
    private MarketChannelAssignment marketChannelAssignment;
    private String status;

    public Order() {
        this.orderItems = new ArrayList<OrderItem>();
        // TODO
    }
    
    public Order(CustomerProfile customerProfile) {
        this.orderItems = new ArrayList<OrderItem>();
        this.customer = customerProfile;
        this.customer.addCustomerOrder(this); // we link the order to the customer
        this.salesPerson = null;
        // this.marketChannelAssignment = null;
        this.status = "Pending";
    }

    public Order(CustomerProfile customerProfile, SalesPersonProfile salesPersonProfile) {
        this.orderItems = new ArrayList<OrderItem>();
        this.customer = customerProfile;
        this.customer.addCustomerOrder(this); // we link the order to the customer
        this.salesPerson = salesPersonProfile;
        this.salesPerson.addSalesOrder(this);
        // this.marketChannelAssignment = null;
        // this.status = "in process";
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }

    public SalesPersonProfile getSalesPerson() {
        return salesPerson;
    }

    public MarketChannelAssignment getMarketChannelAssignment() {
        return marketChannelAssignment;
    }

    public String getStatus() {
        return status;
    }

    public OrderItem newOrderItem(Product product, int actualPrice, int quantity) {
        OrderItem oi = new OrderItem(product, actualPrice, quantity);
        orderItems.add(oi);
        return oi;
    }

    // order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.calculatePricePerformance();     // positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            if (oi.isActualAboveTarget() == true) {
                sum++;
            }
        }
        return sum;
    }
    
    // sum all the item targets and compare to the total of the order 
    public boolean isOrderAboveTotalTarget() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getOrderItemTargetTotal(); // product targets are added
        }
        if (getOrderTotal() > sum) {
            return true;
        } else {
            return false;
        }
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    public void submit() {
        status = "Submitted";
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    public void setSalesPerson(SalesPersonProfile salesPerson) {
        this.salesPerson = salesPerson;
    }

    public void setMarketChannelAssignment(MarketChannelAssignment marketChannelAssignment) {
        this.marketChannelAssignment = marketChannelAssignment;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
