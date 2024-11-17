package model.ProductManagement;

import java.util.ArrayList;

import model.MarketModel.MarketChannelAssignment;
import model.Personnel.Person;

public class SolutionOffer {

    private ArrayList<Product> products;
    // private int price; // floor, ceiling, and target ideas
    private Person salesPerson;
    private MarketChannelAssignment marketChannelComb;

    public SolutionOffer(MarketChannelAssignment marketChannelComb) {
        this.products = new ArrayList<Product>();
        // this.price = price;
        this.marketChannelComb = marketChannelComb;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public Person getSalesPerson() {
        return this.salesPerson;
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

    public void setSalesPerson(Person salesPerson) {
        this.salesPerson = salesPerson;
    }

    public void setMarketChannelComb(MarketChannelAssignment marketChannelComb) {
        this.marketChannelComb = marketChannelComb;
    }
}
