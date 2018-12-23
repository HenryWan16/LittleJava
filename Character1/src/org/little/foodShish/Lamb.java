package org.little.foodShish;

public class Lamb extends Shish {
    Shish _s;

    public Lamb(Shish s) {
        _s = s;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }

    @Override
    boolean isVegetarian() {
        return false;
    }
}
