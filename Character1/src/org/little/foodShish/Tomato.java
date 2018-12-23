package org.little.foodShish;

public class Tomato extends Shish {
    Shish _s;
    public Tomato(Shish s) {
        _s = s;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }

    @Override
    boolean isVegetarian() {
        return _s.isVegetarian();
    }
}
