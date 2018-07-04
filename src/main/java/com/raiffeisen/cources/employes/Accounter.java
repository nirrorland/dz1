package com.raiffeisen.cources.employes;

public class Accounter extends Employee implements ITaxPayer {
    public Accounter(String department) {
        super(department);
    }

    @Override
    protected void smoke() {

    }

    @Override
    public float getTax(int salary) {
        return 0;
    }

    @Override
    public int getSalaryAmount() {
        return 0;
    }

    @Override
    public void work() {
        System.out.println("Calculate");
    }
}
