package org.little.pizza;

public class Crust extends Pizza {
    @Override
    Pizza removeA() {
        return new Crust();
    }

    @Override
    Pizza topAwC() {
        return new Crust();
    }

    @Override
    Pizza subAbC() {
        return new Crust();
    }
}
