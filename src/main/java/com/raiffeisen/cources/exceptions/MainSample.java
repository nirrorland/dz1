package com.raiffeisen.cources.exceptions;

import java.util.Scanner;

public class MainSample {
    public static void main(String[] args) {
        nado();
        neNado();
    }

    private static void neNado() {
        Scanner scanner = new Scanner(System.in);

        String numStr = scanner.next();

        if(numStr.matches("\\d+")) {
            int result = Integer.parseInt(numStr);
        }

    }

    private static void nado() {
        try {
            Scanner scanner = new Scanner(System.in);
            Integer result = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Enter number!");
            nado();
        }
    }
}

