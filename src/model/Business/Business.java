package model.Business;

import java.util.ArrayList;

import model.CustomerManagement.ChannelCatalog;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.MarketCatalog;
import model.MarketingManagement.MarketingPersonDirectory;
import model.OrderManagement.MasterOrderList;
import model.Personnel.EmployeeDirectory;
import model.Personnel.PersonDirectory;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;
import model.ProductManagement.SolutionOfferCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccountDirectory;

public class Business {

    private String name;
    private PersonDirectory personDirectory;
    private MasterOrderList masterOrderList;
    private SupplierDirectory suppliers;
    private MarketCatalog marketCatalog;
    private ChannelCatalog channelCatalog;
    private SolutionOfferCatalog solutionOfferCatalog;
    private CustomerDirectory customerDirectory;
    private EmployeeDirectory employeeDirectory;
    private SalesPersonDirectory salesPersonDirectory;
    private UserAccountDirectory userAccountDirectory;
    private MarketingPersonDirectory marketingPersonDirectory;

    public Business(String name) {
        this.name = name;
        this.personDirectory = new PersonDirectory();
        this.masterOrderList = new MasterOrderList();
        this.suppliers = new SupplierDirectory();
        this.marketCatalog = new MarketCatalog();
        this.channelCatalog = new ChannelCatalog();
        this.solutionOfferCatalog = new SolutionOfferCatalog();
        this.customerDirectory = new CustomerDirectory(this);
        this.employeeDirectory = new EmployeeDirectory(this);
        this.salesPersonDirectory = new SalesPersonDirectory(this);
        this.userAccountDirectory = new UserAccountDirectory();
        this.marketingPersonDirectory = new MarketingPersonDirectory(this);
    }

    public String getName() {
        return name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public SupplierDirectory getSuppliers() {
        return suppliers;
    }

    public MarketCatalog getMarketCatalog() {
        return marketCatalog;
    }

    public ChannelCatalog getChannelCatalog() {
        return channelCatalog;
    }

    public SolutionOfferCatalog getSolutionOfferCatalog() {
        return solutionOfferCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public MarketingPersonDirectory getMarketingPersonDirectory() {
        return marketingPersonDirectory;
    }

    public int getSalesVolume() {
        return masterOrderList.getSalesVolume();
    }

    public ProductsReport getSupplierPerformanceReport(String supplierName) {
        Supplier supplier = suppliers.findSupplier(supplierName);
        if (supplier == null) {
            return null;
        }
        return supplier.prepareProductsReport();
    }

    public ArrayList<ProductSummary> getSupplierProductsAlwaysAboveTarget(String supplierName) {
        ProductsReport productsReport = getSupplierPerformanceReport(supplierName);
        return productsReport.getProductsAlwaysAboveTarget();
    }

    public int getHowManySupplierProductsAlwaysAboveTarget(String supplierName) {
        ProductsReport productsReport = getSupplierPerformanceReport(supplierName);
        int i = productsReport.getProductsAlwaysAboveTarget().size();
        return i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonDirectory(PersonDirectory persondirectory) {
        this.personDirectory = persondirectory;
    }

    public void setMasterOrderList(MasterOrderList masterorderlist) {
        this.masterOrderList = masterorderlist;
    }

    public void setSuppliers(SupplierDirectory suppliers) {
        this.suppliers = suppliers;
    }

    public void setMarketCatalog(MarketCatalog marketcatalog) {
        this.marketCatalog = marketcatalog;
    }

    public void setChannelCatalog(ChannelCatalog channelcatalog) {
        this.channelCatalog = channelcatalog;
    }

    public void setSolutionOfferCatalog(SolutionOfferCatalog solutionoffercatalog) {
        this.solutionOfferCatalog = solutionoffercatalog;
    }

    public void setCustomerDirectory(CustomerDirectory customerdirectory) {
        this.customerDirectory = customerdirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeedirectory) {
        this.employeeDirectory = employeedirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salespersondirectory) {
        this.salesPersonDirectory = salespersondirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory useraccountdirectory) {
        this.userAccountDirectory = useraccountdirectory;
    }

    public void setMarketingPersonDirectory(MarketingPersonDirectory marketingpersondirectory) {
        this.marketingPersonDirectory = marketingpersondirectory;
    }
}
