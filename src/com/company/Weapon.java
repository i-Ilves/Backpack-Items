package com.company;

public class Weapon extends Item {
    public Weapon(float weight, String name, int priority) {
        super(weight, name, priority);
    }
    private int damage;

    public String toString() {
        return "Item{" +
                "weight=" + getWeight() +
                ", name='" + getName() + '\'' +
                ", priority=" + getPriority() +
                ", damage=" + damage +
                '}';
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
