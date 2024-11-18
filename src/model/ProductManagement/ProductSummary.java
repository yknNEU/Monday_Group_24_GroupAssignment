package model.ProductManagement;

// this class will extract summary data from the product
public class ProductSummary {

    private Product subjectProduct;
    private int numberOfSalesAboveTarget;
    private int numberOfSalesBelowTarget;
    private int productPricePerformance; // total profit above target --could be negative too
    private int acutalSalesVolume;
    private int acutalSalesCount;
    private int rank; // will be done later
    
    public ProductSummary(Product product) {
        this.subjectProduct = product; // keeps track of the product itself not as well;
        this.numberOfSalesAboveTarget = product.getNumberOfProductSalesAboveTarget();
        this.numberOfSalesBelowTarget = product.getNumberOfProductSalesBelowTarget();
        this.productPricePerformance = product.getOrderPricePerformance();
        this.acutalSalesVolume = product.getSalesVolume();
        this.acutalSalesCount = product.getSalesCount();
        // this.rank = 0;
    }

    public Product getSubjectProduct() {
        return subjectProduct;
    }

    public int getNumberAboveTarget() {
        return numberOfSalesAboveTarget;
    }

    public int getNumberBelowTarget() {
        return numberOfSalesBelowTarget;
    }

    public int getProductPricePerformance() {
        return productPricePerformance;
    }

    public int getAcutalSalesVolume() {
        return acutalSalesVolume;
    }

    public int getAcutalSalesCount() {
        return acutalSalesCount;
    }

    public int getRank() {
        return rank;
    }
      
    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }

    public void setSubjectProduct(Product subjectProduct) {
        this.subjectProduct = subjectProduct;
    }

    public void setNumberAboveTarget(int numberOfSalesAboveTarget) {
        this.numberOfSalesAboveTarget = numberOfSalesAboveTarget;
    }

    public void setNumberBelowTarget(int numberOfSalesBelowTarget) {
        this.numberOfSalesBelowTarget = numberOfSalesBelowTarget;
    }

    public void setProductPricePerformance(int productPricePerformance) {
        this.productPricePerformance = productPricePerformance;
    }

    public void setAcutalSalesVolume(int acutalSalesVolume) {
        this.acutalSalesVolume = acutalSalesVolume;
    }

    public void setAcutalSalesCount(int acutalSalesCount) {
        this.acutalSalesCount = acutalSalesCount;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
