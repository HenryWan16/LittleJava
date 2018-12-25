package org.little.originalVisitor;

public class Tomato extends Shish{
    Shish _s;
    public Tomato(Shish s) {
        _s = s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forTomato(_s);
    }
}
