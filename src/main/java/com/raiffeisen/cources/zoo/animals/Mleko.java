package com.raiffeisen.cources.zoo.animals;

public abstract class Mleko extends Animal {
    private boolean hasFur;

    public boolean isHasFur() {
        return hasFur;
    }

    public Mleko(String name, String colorDescription, boolean hasFur) {
        super(name, colorDescription);
        this.hasFur = hasFur;
    }
}
