package com.company;

public class Farmer extends Character {

    public Farmer(){
        this.setName("Farmer");
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }

    @Override
    public int run() {
        decreaseStamina();
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed - 2);
        return getSpeed();
    }

    @Override
    public int attack() {
        decreaseHealth();
        int currentAttackPower = getAttackPower();
        setAttackPower(currentAttackPower - 1);
        return getAttackPower();
    }

    @Override
    public int decreaseHealth() {
        int currentHealth = getHealth();
        setHealth(currentHealth - 20);
        return getHealth();
    }

    @Override
    public int decreaseStamina() {
        int currentStamina = getStamina();
        setStamina(currentStamina - 10);
        return getStamina();
    }

    @Override
    public int increaseStamina() {
        int currentStamina = getStamina();
        setStamina(currentStamina + 5);
        return getStamina();
    }

    public void plow(){
        decreaseStamina();
    }

    public void harvest(){
        decreaseStamina();
    }
}
