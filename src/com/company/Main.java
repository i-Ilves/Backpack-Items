package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        Backpack backpack = new Backpack("My Warrior Backpack");

        Item item1 = new Weapon(3, "Potion", 200);
        Item item2 = new HealingItem(2.2f, "Cloth", 180);
        Item item3 = new HealingItem(1.6f , "Cotton", 150);

        backpack.addItem(item1);
        backpack.addItem(item2);
        backpack.addItem(item3);
        items.add(new Weapon(8, "Iron armor", 160));
        items.add(new HealingItem(1.2f , "Blankets", 50));
        items.add(new HealingItem(2.3f, "Food", 200));
        items.add(new HealingItem(3f, "Wood", 120));
        items.add(new HealingItem(3.1f, "Torch", 60));
        items.add(new KnowledgeItem(1.1f, "Books", 150));
        items.add(new KnowledgeItem(1.3f, "Spellbook", 250));
        items.add(new Weapon(4.1f,"Sword", 200));
        items.add(new KnowledgeItem(5.1f,"Map", 220 ));
        items.add(new KnowledgeItem(0.5f,"Diamonds",170 ));


/*        // the item in the backpack will also change its name
        // because both variables points at the same object
        item1.setName("Extreme socks");*/

        backpack.showContent();

//        backpack.removeItem("Cloth");
//        backpack.showContent();

        System.out.printf("Available weight: %.2f \n", backpack.getAvailableWeight());
    }
}
