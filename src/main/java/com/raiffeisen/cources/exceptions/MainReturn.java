package com.raiffeisen.cources.exceptions;

public class MainReturn {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;

        } catch (Exception e){
            System.out.println("EX");
            int[] mas = new int[4];
            System.out.println(mas[6]);

        } finally {
            return;
        }
    }
}
