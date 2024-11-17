package model.Supplier;

import java.util.ArrayList;

public class SupplierDirectory {

    private ArrayList<Supplier> suppliers;

    public SupplierDirectory() {
        this.suppliers = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }

    public Supplier newSupplier(String name) {
        Supplier supplier = new Supplier(name);
        suppliers.add(supplier);
        return supplier;
    }

    public Supplier findSupplier(String id) {
        for (Supplier supplier : suppliers) {
            if (supplier.getName().equals(id)) {
                return supplier;
            }
        }
        return null;
    }

    public ArrayList<Supplier> getSupplierList() {
        return suppliers;
    }

    public void setSuppliers(ArrayList<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}