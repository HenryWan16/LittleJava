package org.little.originalVisitor;

import static org.junit.Assert.*;

public class TestOnion {

    @org.junit.Test
    public void onlyOnions() {
        Shish food = new Onion(
                            new Lamb(
                                    new Skewer()));
        assertFalse(food.onlyOnions());

        food = new Onion(new Onion(new Skewer()));
        assertTrue(food.onlyOnions());
    }
}