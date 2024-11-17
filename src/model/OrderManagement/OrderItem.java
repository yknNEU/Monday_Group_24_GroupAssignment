package model.OrderManagement;

import model.ProductManagement.Product;

public class OrderItem {

    private Product selectedProduct;
    private int actualPrice;
    private int quantity;

    public OrderItem(Product product, int actualPrice, int quantity) {
        this.selectedProduct = product;
        // product.addOrderItem(this); // make sure product links back to the item
        this.actualPrice = actualPrice;
        this.quantity = quantity;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderItemTotal() {
        return actualPrice * quantity;
    }

    // The following calculates what the price gain would have been if products were sold at target price
    public int getOrderItemTargetTotal() {
        return selectedProduct.getTargetPrice() * quantity;
    }

    // returns positive if seller is making higher margin than target
    // returns negative if seller is making lower margin than target
    // otherwise zero meaning neutral
    public int calculatePricePerformance() {
        return (actualPrice - selectedProduct.getTargetPrice()) * quantity;
    }

    public boolean isActualAboveTarget() {
        if (actualPrice > selectedProduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isActualBelowTarget() {
        if (actualPrice < selectedProduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isActualATTarget() {
        if (actualPrice == selectedProduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return selectedProduct.toString();
    }
}
