package com.raiffeisen.cources.employes;
public abstract class Employee implements IHardWorker {
    protected String department;

    private final String organizationName = "Raiffeisen";

    public Employee(String department)  {
        this.department = organizationName + department;
    }

    public Employee() {
    }

    protected abstract void smoke();


}
