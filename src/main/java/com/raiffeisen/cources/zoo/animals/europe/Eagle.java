package com.raiffeisen.cources.zoo.animals.europe;

import com.raiffeisen.cources.zoo.animals.Birds;

public class Eagle extends Birds {
    private int eyeStrength;

    public int getEyeStrength() {
        return eyeStrength;
    }

    public void setEyeStrength(int eyeStrength) {
        this.eyeStrength = eyeStrength;

    }

    public Eagle(String name, String colorDescription, short wingSize, int eyeStrength) {
        super(name, colorDescription, wingSize);
        this.eyeStrength = eyeStrength;
    }
}
