package com.raiffeisen.cources.weapons;

public class Shotgun extends Weapon {
    public Shotgun(int power) {
        super(power);
    }

    @Override
    protected void shoot() {
        System.out.println("Boom!");
    }
}
