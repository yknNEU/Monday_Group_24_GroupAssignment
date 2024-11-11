package model.Supplier;

import java.util.ArrayList;

import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

public class Supplier {

    private String name;
    private ProductCatalog productCatalog;
    private ProductsReport productsReport;

    public Supplier(String name) {
        this.name = name;
        this.productCatalog = new ProductCatalog("software");
        // this.productsReport = new ProductsReport();
    }
    
    public String getName() {
        return name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public ProductsReport getProductsReport() {
        return productsReport;
    }

    public ProductsReport prepareProductsReport() {
        productsReport = productCatalog.generatProductPerformanceReport();
        return productsReport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {
        if (productsReport == null) {
            productsReport = prepareProductsReport();
        }
        return productsReport.getProductsAlwaysAboveTarget();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void setProductsReport(ProductsReport productsReport) {
        this.productsReport = productsReport;
    }

    // TODO: add supplier product ..
    
    // update supplier product ...
    
    @Override
    public String toString() {
        return name;
    }
}
