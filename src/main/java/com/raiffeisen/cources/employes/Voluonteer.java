package com.raiffeisen.cources.employes;

public class Voluonteer extends Employee implements IDressCoder {
    private boolean isStudent;

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public Voluonteer(String department) {
        super(department);
    }

    @Override
    protected void smoke() {

    }

    @Override
    public String getDressCodeDescription() {
        return "somesthing";
    }

    @Override
    public boolean accessToOfficeByDress(String dressName) {
        return false;
    }

    @Override
    public void work() {
        System.out.println("Help others");
    }
}
