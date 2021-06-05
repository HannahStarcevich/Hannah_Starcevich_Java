package com.company;

public class Constable extends Character {

    private String jurisdiction;

    public Constable(){
        this.setName("Constable");
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.jurisdiction = "Supreme Ruler of all the Lands";
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
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
        setStamina(currentStamina - 1);
        return getStamina();
    }

    @Override
    public int increaseStamina() {
        int currentStamina = getStamina();
        setStamina(currentStamina - 10);
        return getStamina();
    }

    public void arrest(){
        run();
        attack();
    }
}
