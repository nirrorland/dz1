package com.raiffeisen.cources.employes;

public class SalesManager extends Employee implements IDressCoder, ISalaryTaker {
    private boolean coldSales;

    public boolean isColdSales() {
        return coldSales;
    }

    public void setColdSales(boolean coldSales) {
        this.coldSales = coldSales;
    }

    public SalesManager(String department) {
        super(department);
    }

    @Override
    protected void smoke() {

    }

    @Override
    public String getDressCodeDescription() {
        return "cool jacket";
    }

    @Override
    public boolean accessToOfficeByDress(String dressName) {
        return true;
    }

    @Override
    public int getSalaryAmount() {
        return 90000;
    }

    @Override
    public void work() {
        System.out.println("do Sale");
    }
}
