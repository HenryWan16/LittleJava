package org.little.foodShish;


public class Skewer extends Shish {
    @Override
    boolean onlyOnions() {
        return true;
    }

    @Override
    boolean isVegetarian() {
        return true;
    }
}
