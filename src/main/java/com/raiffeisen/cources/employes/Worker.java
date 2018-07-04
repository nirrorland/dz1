package com.raiffeisen.cources.employes;

public class Worker extends Employee implements ISalaryTaker {
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private int strength;

    @Override
    public int getSalaryAmount() {
        return 50000;
    }

    @Override
    public void work() {
        System.out.println("do job");
    }

    @Override
    protected void smoke() {

    }
}
