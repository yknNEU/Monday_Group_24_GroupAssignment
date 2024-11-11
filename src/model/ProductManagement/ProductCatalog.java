package model.ProductManagement;

import java.util.ArrayList;

public class ProductCatalog {

    private String type;
    private ArrayList<Product> products; // list of products initially empty

    public ProductCatalog(String type) {
        this.type = type;
        this.products = new ArrayList<Product>();  // create the list of elements otherwise it is null
    }

    // new ProductCatalog(); or new ProductCatalog("Printers");
    public ProductCatalog() {
        this.type = "unknown";
        this.products = new ArrayList<Product>();
    }

    public String getType() {
        return type;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product newProduct(int floorPrice, int ceilingPrice, int targetPrice) {
        Product p = new Product(floorPrice, ceilingPrice, targetPrice);
        products.add(p);
        return p;
    }

    public Product newProduct(String name, int floorPrice, int ceilingPrice, int targetPrice) {
        Product p = new Product(name, floorPrice, ceilingPrice, targetPrice);
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();
        for (Product p : products) {
            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
