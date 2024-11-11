package model.OrderManagement;

public class OrderSummary {

    private int salesVolume;
    private boolean totalAboveTarget;
    private int orderPricePerformance;
    private int numberOfOrderItemsAboveTarget;
    
    public OrderSummary(Order order) {
        this.salesVolume = order.getOrderTotal();
        this.totalAboveTarget = order.isOrderAboveTotalTarget();
        this.orderPricePerformance = order.getOrderPricePerformance();
        this.numberOfOrderItemsAboveTarget = order.getNumberOfOrderItemsAboveTarget();
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public boolean isTotalAboveTarget() {
        return totalAboveTarget;
    }

    public int getOrderPricePerformance() {
        return orderPricePerformance;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        return numberOfOrderItemsAboveTarget;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public void setTotalAboveTarget(boolean totalAboveTarget) {
        this.totalAboveTarget = totalAboveTarget;
    }

    public void setOrderPricePerformance(int orderPricePerformance) {
        this.orderPricePerformance = orderPricePerformance;
    }

    public void setNumberOfOrderItemsAboveTarget(int numberOfOrderItemsAboveTarget) {
        this.numberOfOrderItemsAboveTarget = numberOfOrderItemsAboveTarget;
    }
}
