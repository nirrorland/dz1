package com.raiffeisen.cources.employes;

public class Boss extends Employee implements IDressCoder, ISalaryTaker {

    private String ambitions;

    public String getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(String ambitions) {
        this.ambitions = ambitions;
    }

    public Boss(String department) {
        super(department);
    }

    @Override
    protected void smoke() {

    }


    @Override
    public String getDressCodeDescription() {
        return "ccool suite!";
    }

    @Override
    public boolean accessToOfficeByDress(String dressName) {
        return true;
    }

    @Override
    public int getSalaryAmount() {
        return 150000;
    }

    @Override
    public void work() {
        System.out.println("Command!");
    }
}
