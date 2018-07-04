package com.raiffeisen.cources.zoo.animals.australia;

import com.raiffeisen.cources.zoo.animals.Reptiles;

public class Varan extends Reptiles {
    private boolean poisonous;

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public Varan(String name, String colorDescription, short tailLength, boolean poisonous) {
        super(name, colorDescription, tailLength);
        this.poisonous = poisonous;
    }
}
