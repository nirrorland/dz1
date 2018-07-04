package com.raiffeisen.cources.zoo.cages;

import com.raiffeisen.cources.zoo.animals.Animal;

public abstract class Cage implements ICageDescriptor {
    protected Animal[] animals;

    public Cage(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String getCageDescription() {
        StringBuilder descriptionBuilder = new StringBuilder();

        for (Animal animal: animals) {
            System.out.println(animal.toString());
            descriptionBuilder.append(animal.toString());
        }

        return descriptionBuilder.toString();
    }
}
