package model.OrderManagement;

import java.util.ArrayList;

public class MasterOrderReport {

    private ArrayList<OrderSummary> orderSummaryList;
    
    public MasterOrderReport() {
        this.orderSummaryList = new ArrayList<OrderSummary>();
    }

    public ArrayList<OrderSummary> getOrderSummaryList() {
        return orderSummaryList;
    }

    public void generateOrderReport(ArrayList<Order> orders) {
        ArrayList<Order> orderlist = orders;
        OrderSummary ordersummary;
        for (Order order : orderlist) {
            ordersummary = new OrderSummary(order);
            orderSummaryList.add(ordersummary);
        }         
    }
    
    public OrderSummary getTopProfitableOrder() { 
        // most profitable order
        OrderSummary currenttoporder = null;
        
        for (OrderSummary os : orderSummaryList) {
            if (currenttoporder == null) {
                currenttoporder = os; // initial step 
            } else {
                if (os.getOrderPricePerformance() > currenttoporder.getOrderPricePerformance()) {
                    currenttoporder = os; // we have a new higher total
                }
            }         
        }

        return currenttoporder;
    }

    public void setOrderSummaryList(ArrayList<OrderSummary> orderSummaryList) {
        this.orderSummaryList = orderSummaryList;
    }
}

