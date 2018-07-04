package com.raiffeisen.cources.zoo.animals.africa;

import com.raiffeisen.cources.zoo.animals.Mleko;

public class Monkey extends Mleko {
    private int wordKnown;


    public int getWordKnown() {
        return wordKnown;
    }

    public void setWordKnown(int wordKnown) {
        this.wordKnown = wordKnown;
    }

    public Monkey(String name, String colorDescription, boolean hasFur, int wordKnown) {
        super(name, colorDescription, hasFur);
        this.wordKnown = wordKnown;
    }
}
