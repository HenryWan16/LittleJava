package org.little.pizza;

public class Olive extends Pizza {
    Pizza _p;
    public Olive(Pizza p) {
        _p = p;
    }

    @Override
    Pizza removeA() {
        return new Olive(_p.removeA());
    }

    @Override
    Pizza topAwC() {
        return new Olive(_p.topAwC());
    }

    @Override
    Pizza subAbC() {
        return new Olive(_p.subAbC());
    }
}
