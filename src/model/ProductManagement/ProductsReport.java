package model.ProductManagement;

import java.util.ArrayList;

public class ProductsReport {

    private ArrayList<ProductSummary> productSummaryList;

    public ProductsReport() {
        this.productSummaryList = new ArrayList<ProductSummary>();
    }

    public ArrayList<ProductSummary> getProductSummaryList() {
        return productSummaryList;
    }

    public void addProductSummary(ProductSummary productSummary) {
        productSummaryList.add(productSummary);
    }

    public ProductSummary getTopProductAboveTarget() {
        ProductSummary currentTopProduct = null;

        for (ProductSummary ps : productSummaryList) {
            if (currentTopProduct == null) {
                currentTopProduct = ps; // initial step 
            } else if (ps.getNumberAboveTarget() > currentTopProduct.getNumberAboveTarget()) {
                currentTopProduct = ps; // we have a new higher total
            }
        }

        return currentTopProduct;
    }

    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {
        ArrayList<ProductSummary> productsAlwaysAboveTarget = new ArrayList<ProductSummary>(); // temp array list

        for (ProductSummary ps : productSummaryList) {
            if (ps.isProductAlwaysAboveTarget() == true) {
                productsAlwaysAboveTarget.add(ps);
            }
        }

        return productsAlwaysAboveTarget;
    }

    public void setProductSummaryList(ArrayList<ProductSummary> productSummaryList) {
        this.productSummaryList = productSummaryList;
    }
}
