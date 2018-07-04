package com.raiffeisen.cources.exceptions;

public class Main {
    public static void main(String[] args) {
        String message = null;

        //"abs".equals(message);

        try {
            if (message.equals("abc")) {
                System.out.println(message);
            }

        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (Exception e) {
            System.out.println("AnotherException");
        }
        finally {
            System.out.println("Final here");
        }

    }
}
