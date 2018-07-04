package com.raiffeisen.cources.zoo.animals;

public abstract class Birds extends Animal {
    private short wingSize;

    public short getWingSize() {
        return wingSize;
    }

    public Birds(String name, String colorDescription, short wingSize) {
        super(name, colorDescription);
        this.wingSize = wingSize;
    }
}
