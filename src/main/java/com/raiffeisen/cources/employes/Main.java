package com.raiffeisen.cources.employes;

import com.raiffeisen.cources.employes.Boss;
import com.raiffeisen.cources.employes.Employee;
import com.raiffeisen.cources.employes.ISalaryTaker;

public class Main {
    public static void main(String[] args) {
        ISalaryTaker salaryTaker = new Boss("development");
        salaryTaker.getSalaryAmount();

        //new Employee("");
    }
}
