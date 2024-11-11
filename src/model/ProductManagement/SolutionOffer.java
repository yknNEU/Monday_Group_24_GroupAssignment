package model.ProductManagement;

import java.util.ArrayList;

import model.MarketModel.MarketChannelAssignment;

public class SolutionOffer {

    private ArrayList<Product> products;
    private int price; // floor, ceiling, and target ideas
    private MarketChannelAssignment marketChannelComb;

    public SolutionOffer(MarketChannelAssignment marketChannelComb) {
        this.products = new ArrayList<Product>();
        // this.price = price;
        this.marketChannelComb = marketChannelComb;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public int getPrice() {
        return this.price;
    }

    public MarketChannelAssignment getMarketChannelComb() {
        return this.marketChannelComb;
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMarketChannelComb(MarketChannelAssignment marketChannelComb) {
        this.marketChannelComb = marketChannelComb;
    }
}
