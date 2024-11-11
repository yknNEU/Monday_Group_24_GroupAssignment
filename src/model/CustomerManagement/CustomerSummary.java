package model.CustomerManagement;

import model.OrderManagement.Order;

public class CustomerSummary {
    
    private Order subjectOrder;
    private int orderTotal;

    public CustomerSummary(CustomerProfile customerProfile) {
        // TODO: Implement constructor
    }
    
    public Order getSubjectOrder() {
        return subjectOrder;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setSubjectOrder(Order subjectOrder) {
        this.subjectOrder = subjectOrder;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }
}
