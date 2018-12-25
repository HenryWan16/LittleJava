package org.little.pizza;

public class Anchovy extends Pizza{
    Pizza _p;
    public Anchovy(Pizza p) {
        _p = p;
    }

    @Override
    Pizza removeA() {
        /*
        * Remove Anchovy from pizza
        */
        return _p.removeA();
    }

    @Override
    Pizza topAwC() {
        return new Cheese(
                    new Anchovy(_p.topAwC()));
    }

    @Override
    Pizza subAbC() {
        return new Cheese(_p.subAbC());
    }

    /*
     * This method must produce a Pizza.
     * Crust is the simplest pizza.
     * Pay attention, in this way
     * new Cheese(
     *   new Anchovy(
     *       new Cheese(
     *           new Crust()))).removeA()
     * will get
     * new Cheese(
     *   new Crust())
     * instead of
     * new Cheese(
     *   new Cheese(
     *       new Crust()))
     */
//    @Override
//    Pizza removeA() {
//        return new Crust();
//    }
}
