package com.raiffeisen.cources.weapons;

public class Gun extends Weapon {
    public Gun(int power) {
        super(power);
    }

    @Override
    protected void shoot() {
        System.out.println("Bang!");
    }
}
