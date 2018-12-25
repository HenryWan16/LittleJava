package org.little.originalVisitor;

public class Onion extends Shish{
    Shish _s;
    public Onion(Shish s) {
        _s = s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forOnion(_s);
    }
}
