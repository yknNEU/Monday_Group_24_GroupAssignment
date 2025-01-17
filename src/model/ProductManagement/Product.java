package model.ProductManagement;

import java.util.ArrayList;

import model.OrderManagement.OrderItem;

public class Product {

    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private OrderItem available;
    private ArrayList<OrderItem> orderItems;

    public Product(int floorPrice, int ceilingPrice, int targetPrice) {
        // this.name = null;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        // this.available = null;
        this.orderItems = new ArrayList<OrderItem>();
    }

    public Product(String name, int floorPrice, int ceilingPrice, int targetPrice) {
        this.name = name;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        // this.available = null;
        this.orderItems = new ArrayList<OrderItem>();
    }

    public Product(String name, int floorPrice, int ceilingPrice, int targetPrice, OrderItem available) {
        this.name = name;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        this.available = available;
        this.orderItems = new ArrayList<OrderItem>();
    }

    public Product(String name, int floorPrice, int ceilingPrice, int targetPrice, int actualPrice, int quantity) {
        this.name = name;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        OrderItem orderItem = new OrderItem(this, actualPrice, quantity);
        this.available = orderItem;
        this.orderItems = new ArrayList<OrderItem>();
    }

    public String getName() {
        return name;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public OrderItem getAvailable() {
        return available;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Product updateProduct(int floorPrice, int ceilingPrice, int targetPrice) {
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        return this; // returns itself
    }

    public Product updateProduct(int floorPrice, int ceilingPrice, int targetPrice, int actualPrice, int quantity) {
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        OrderItem orderItem = new OrderItem(this, actualPrice, quantity);
        this.available = orderItem;
        return this; // returns itself
    }

    public OrderItem newOrderItem(int actualPrice, int quantity) {
        OrderItem orderItem = new OrderItem(this, actualPrice, quantity);
        orderItems.add(orderItem);
        return orderItem;
    }

    // Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            if (oi.isActualAboveTarget() == true) {
                sum++;
            }
        }
        return sum;
    }

    public int getNumberOfProductSalesBelowTarget() {
        int sum = 0;
        for (OrderItem oi : orderItems){
            if (oi.isActualBelowTarget() == true) {
                sum++;
            }
        }
        return sum;
    }    
    
    public boolean isProductAlwaysAboveTarget() {
        for (OrderItem oi : orderItems) {
            if (oi.isActualAboveTarget() == false) {
                return false;
            }
        }
        return true;
    }

    // calculates the revenues gained or lost (in relation to the target)
    // For example, if target is at $2000 and actual is $2500 then revenue gained
    // is $500 above the expected target. If the actual is $1800 then the lose will be $200
    // Add all these difference to get the total including wins and loses
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.calculatePricePerformance();     // positive and negative values       
        }
        return sum;
    }

    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getOrderItemTotal();     // positive and negative values       
        }
        return sum;
    }

    public int getSalesCount() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getQuantity();
        }
        return sum;
    }

    public String getStatus(SolutionOffer solutionOffer) {
        if (solutionOffer == null) {
            return "Off Sale";
        }
        if (solutionOffer.getProducts().contains(this)) {
            if (this.getAvailable().getQuantity() <= 0) {
                return "Sold Out";
            }
            return "On Sale";
        } else {
            return "Off Sale";
        }
    }

    public void setAvailable(int actualPrice, int quantity) {
        OrderItem orderItem = new OrderItem(this, actualPrice, quantity);
        this.available = orderItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public void setAvailable(OrderItem available) {
        this.available = available;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return name;
    }
}
