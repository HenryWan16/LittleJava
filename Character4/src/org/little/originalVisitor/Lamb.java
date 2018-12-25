package org.little.originalVisitor;

public class Lamb extends Shish{
    Shish _s;
    public Lamb(Shish s) {
        _s = s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forLamb(_s);
    }
}
