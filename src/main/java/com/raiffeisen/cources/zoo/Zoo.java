package com.raiffeisen.cources.zoo;

import com.raiffeisen.cources.zoo.animals.Animal;
import com.raiffeisen.cources.zoo.animals.Birds;
import com.raiffeisen.cources.zoo.animals.africa.Monkey;
import com.raiffeisen.cources.zoo.animals.europe.Eagle;
import com.raiffeisen.cources.zoo.cages.Cage;
import com.raiffeisen.cources.zoo.cages.Volier;

public class Zoo {
    private Cage[] cages;

    public Zoo() {
        cages = new Cage[3];

        Animal[] animalFirst = new Animal[2];
        animalFirst[0] = new Monkey("Aby", "Brown", true, 4);
        animalFirst[0] = new Monkey("Tracey", "Grey", true, 3);
        Cage first = new Volier(animalFirst,10);
        cages[0] = first;


        Animal[] animalSecond = new Animal[2];
        animalSecond[0] = new Eagle("Eagle1", "Red", (short) 5, 2);
        animalSecond[1] = new Eagle("Eagle1", "Red", (short) 5, 4);
        Cage second = new Volier(animalSecond,10);
        cages[1] = second;

    }

    public void buyTicket() {

    }

    public int getCageNumberByAnimalName(String animalName) {

        return 0;
    }

    public String getCageReport(int cageNMumber) {

        return cages[cageNMumber].getCageDescription();
    }
}
