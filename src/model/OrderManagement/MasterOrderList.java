package model.OrderManagement;

import java.util.ArrayList;

import model.CustomerManagement.CustomerProfile;
import model.SalesManagement.SalesPersonProfile;

public class MasterOrderList {

    private ArrayList<Order> orders;
    private MasterOrderReport masterOrderReport;
    
    public MasterOrderList() {
        this.orders = new ArrayList<Order>();
        // this.masterOrderReport = new MasterOrderReport();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public MasterOrderReport getMasterOrderReport() {
        return masterOrderReport;
    }
    
    public Order newOrder(CustomerProfile customerProfile) {
        Order o = new Order(customerProfile);
        orders.add(o);
        return o;
    }

    public Order newOrder(CustomerProfile customerProfile, SalesPersonProfile salesPersonProfile) {
        Order o = new Order(customerProfile, salesPersonProfile);
        orders.add(o);
        return o;
    }
    
    public MasterOrderReport generateMasterOrderReport() {
        masterOrderReport = new MasterOrderReport();
        return masterOrderReport;
    }

    public int getSalesVolume() {
        int sum = 0;
        for (Order order : orders) {
            sum = sum + order.getOrderTotal();
        }
        return sum;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setMasterOrderReport(MasterOrderReport masterOrderReport) {
        this.masterOrderReport = masterOrderReport;
    }
}
