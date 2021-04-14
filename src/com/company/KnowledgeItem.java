package com.company;

public class KnowledgeItem extends Item {
    public KnowledgeItem(float weight, String name, int priority) {
        super(weight, name, priority);
    }
    private int wisdom;

    public String toString() {
        return "Item{" +
                "weight=" + getWeight() +
                ", name='" + getName() + '\'' +
                ", priority=" + getPriority() +
                ", wisdom=" + wisdom +
                '}';
    }

    public int getWisdom() {
        return wisdom;
    }
}
