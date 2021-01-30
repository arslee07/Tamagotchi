package com.arslee.tamagotchi;

import android.content.SharedPreferences;

public class Tamagotchi {
    public int id;
    private SharedPreferences prefs;

    private int hunger;
    private int thirst;
    private int energy;
    private int fun;

    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getEnergy() {
        return energy;
    }
    public int getFun() {
        return fun;
    }
    public int getId() {
        return id;
    }

    public void setHunger(int hunger) {
        if (hunger > 100)
            this.hunger = 100;
        else if (hunger < 0)
            this.hunger = 0;
        else
            this.hunger = hunger;
    }
    public void setThirst(int thirst) {
        if (thirst > 100)
            this.thirst = 100;
        else if (thirst < 0)
            this.thirst = 0;
        else
            this.thirst = thirst;
    }
    public void setEnergy(int energy) {
        if (energy > 100)
            this.energy = 100;
        else if (energy < 0)
            this.energy = 0;
        else
            this.energy = energy;
    }
    public void setFun(int fun) {
        if (fun > 100)
            this.fun = 100;
        else if (fun < 0)
            this.fun = 0;
        else
            this.fun = fun;
    }

    public boolean isDead() {
        return this.energy <= 0 || this.fun <= 0 || this.thirst <= 0 || this.hunger <= 0;
    }

    public Tamagotchi(int id, SharedPreferences prefs) {
        this.prefs = prefs;
        this.id = id;

        this.hunger = prefs.getInt("hunger", 100);
        this.thirst = prefs.getInt("thirst", 100);
        this.energy = prefs.getInt("energy", 100);
        this.fun = prefs.getInt("fun", 100);
    }
}
