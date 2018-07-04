package com.raiffeisen.cources.zoo.cages;

import com.raiffeisen.cources.zoo.animals.Animal;

public class Volier extends Cage {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Volier(Animal[] animals, int radius) {
        super(animals);
        this.radius = radius;
    }

    @Override
    public String getCageDescription() {
        StringBuilder descriptionBuilder = new StringBuilder();

        descriptionBuilder.append(super.getCageDescription());
        descriptionBuilder.append("radius = ");
        descriptionBuilder.append(this.radius);

        return descriptionBuilder.toString();
    }
}
