package com.raiffeisen.cources.employes;

public interface ITaxPayer extends ISalaryTaker {
    float getTax(int salary);
}
