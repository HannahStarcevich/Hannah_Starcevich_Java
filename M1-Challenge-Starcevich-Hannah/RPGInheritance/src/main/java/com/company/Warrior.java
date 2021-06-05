package com.company;

public class Warrior extends Character {

    private int shieldStrength;

    public Warrior(){
        this.setName("Warrior");
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
    }
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public int run() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed - 1);
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
        setHealth(currentHealth - 25);
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
        setStamina(currentStamina + 20);
        return getStamina();
    }

    public int decreaseShieldStrength(){
        return shieldStrength - 10 ;
    }
}
