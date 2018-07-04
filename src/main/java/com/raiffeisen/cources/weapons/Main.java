package com.raiffeisen.cources.weapons;

public class Main {

    public static void main(String[] args) {
        Weapon[] weapons = new Weapon[5];

        weapons[0] = new Gun(5);
        weapons[1] = new Shotgun(10);
        weapons[2] = new BFG(1000);
        weapons[3] = new Shotgun(50);
        weapons[4] = new Gun(7);

        for (Weapon weapon: weapons) {
            weapon.shoot();
        }

    }
}
