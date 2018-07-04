package com.raiffeisen.cources.exceptions;

public class MainQuestion {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("AE");
            String msg = null;
            System.out.println(msg.equals("a"));
        } catch (NullPointerException npe) {
            System.out.println("NPE");
            int[] mas = new int[3];
            System.out.println(mas[4]);
        } catch (Exception ex) {
            System.out.println("EX");
        } finally {
            System.out.println("Final here");
        }
    }
}
