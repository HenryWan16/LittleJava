package org.little.foodShish;


public class Onion extends Shish {
    Shish _s;
    Onion(Shish s) {
        _s = s;
    }

    @Override
    boolean onlyOnions() {
        return _s.onlyOnions();
    }

    @Override
    boolean isVegetarian() {
        return _s.isVegetarian();
    }
}
