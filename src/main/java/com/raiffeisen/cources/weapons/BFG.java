package com.raiffeisen.cources.weapons;

public class BFG extends Weapon {
    public BFG(int power) {
        super(power);
    }

    @Override
    protected void shoot() {
        System.out.println("Big bada boom!");
    }
}
