package com.raiffeisen.cources.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTWR {
    public static void main(String[] args) {
        File file = new File("1.txt");



        try (FileInputStream fis = new FileInputStream(file)) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
