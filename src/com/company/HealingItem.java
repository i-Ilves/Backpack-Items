package com.company;

public class HealingItem extends Item{
    private int healAmount;

    public HealingItem(float weight, String name, int priority) {
        super(weight, name, priority);
    }


    public String toString() {
        return "Item{" +
                "weight=" + getWeight() +
                ", name='" + getName() + '\'' +
                ", priority=" + getPriority() +
                ", healAmount=" + healAmount +
                '}';
    }

    public HealingItem(String name) {
        super(0, name, 0);
        healAmount = 0;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }
}
