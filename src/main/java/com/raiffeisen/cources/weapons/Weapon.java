package com.raiffeisen.cources.weapons;

public abstract class Weapon {
    protected int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Weapon(int power) {
        if (power>0) {
            this.power = power;
        } else {
            System.out.println("Wrong power");
        }
    }

    protected abstract void shoot();

}
