package org.little.pizza;

public class Sausage extends Pizza{
    Pizza _p;
    public Sausage(Pizza p) {
        _p = p;
    }

    @Override
    Pizza removeA() {
        return new Sausage(_p.removeA());
    }

    @Override
    Pizza topAwC() {
        return new Sausage(_p.topAwC());
    }

    @Override
    Pizza subAbC() {
        return new Sausage(_p.subAbC());
    }
}
