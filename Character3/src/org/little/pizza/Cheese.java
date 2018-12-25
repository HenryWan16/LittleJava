package org.little.pizza;

public class Cheese extends Pizza {
    Pizza _p;
    public Cheese(Pizza p) {
        _p = p;
    }

    @Override
    Pizza removeA() {
        return new Cheese(_p.removeA());
    }

    @Override
    Pizza topAwC() {
        return new Cheese(_p.topAwC());
    }

    @Override
    Pizza subAbC() {
        return new Cheese(_p.subAbC());
    }
}
