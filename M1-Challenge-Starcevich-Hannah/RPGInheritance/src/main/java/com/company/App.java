package com.company;

public class App {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Constable constable = new Constable();
        Warrior warrior = new Warrior();

        System.out.println("Farmer Character Stats: "+ farmer.getName() + " | Health: " + farmer.getHealth() + " | Stamina: " + farmer.getStamina() + " | Attack Power: " + farmer.getAttackPower() + " | Speed: " + farmer.getSpeed() + " | Strength: " + farmer.getStrength());
        System.out.println("Constable Character Stats: "+ constable.getName() + " | Health: " + constable.getHealth() + " | Stamina: " + constable.getStamina() + " | Attack Power: " + constable.getAttackPower() + " | Speed: " + constable.getSpeed() + " | Strength: " + constable.getStrength() + " | Jurisdiction: " + constable.getJurisdiction());
        System.out.println("Warrior Character Stats: "+ warrior.getName() + " | Health: " + warrior.getHealth() + " | Stamina: " + warrior.getStamina() + " | Attack Power: " + warrior.getAttackPower() + " | Speed: " + warrior.getSpeed() + " | Strength: " + warrior.getStrength() + " | Shield Strength: " + warrior.getShieldStrength());

        System.out.println("Farmer: 'I will harvest all my crops today...'");
        farmer.harvest();
        System.out.println("Constable: 'We are going to war, my armies must attack!'");
        constable.attack();
        System.out.println("Warrior: 'Today I will fight in battle and run...'");
        warrior.run();

        System.out.println("Farmer Character Stats: "+ farmer.getName() + " | Health: " + farmer.getHealth() + " | Stamina: " + farmer.getStamina() + " | Attack Power: " + farmer.getAttackPower() + " | Speed: " + farmer.getSpeed() + " | Strength: " + farmer.getStrength());
        System.out.println("Constable Character Stats: "+ constable.getName() + " | Health: " + constable.getHealth() + " | Stamina: " + constable.getStamina() + " | Attack Power: " + constable.getAttackPower() + " | Speed: " + constable.getSpeed() + " | Strength: " + constable.getStrength() + " | Jurisdiction: " + constable.getJurisdiction());
        System.out.println("Warrior Character Stats: "+ warrior.getName() + " | Health: " + warrior.getHealth() + " | Stamina: " + warrior.getStamina() + " | Attack Power: " + warrior.getAttackPower() + " | Speed: " + warrior.getSpeed() + " | Strength: " + warrior.getStrength() + " | Shield Strength: " + warrior.getShieldStrength());

    }

}
