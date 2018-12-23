package org.little.foodShish;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestShish {

    @Test
    public void onlyOnions() {
        Shish food = new Onion(
                        new Tomato(
                                new Lamb(
                                        new Skewer())));
        assertFalse(food.onlyOnions());
        food = new Onion(
                    new Onion(
                            new Onion(
                                    new Skewer())));
        assertTrue(food.onlyOnions());
    }

    @Test
    public void isVegetarian() {
        Shish food = new Skewer();
        assertTrue(food.isVegetarian());
        food = new Tomato(
                    new Onion(
                            new Tomato(
                                    new Skewer())));
        assertTrue(food.isVegetarian());
        food = new Onion(
                    new Tomato(
                            new Skewer()));
        assertTrue(food.isVegetarian());
        food = new Tomato(
                    new Lamb(
                            new Skewer()));
        assertFalse(food.isVegetarian());
    }
}