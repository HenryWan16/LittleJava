# Pizza Model
+ We can use 'new' to return specific type of value.

+ When we need to add new type like "Spinach", we don't need to 
change Pizza, Crust, Cheese, Olive and Sausage.
We just need to create a new class Spinach which is very similar 
to Olive

## How to use the pizza model?
```JAVA
(new Olive(
        new Anchovy(
                new Anchovy(
                        new Crust()))).topAwC()).removeA();
```
It will return:
```JAVA
new Olive(
        new Cheese(
                new Cheese(
                        new Cheese(
                                new Crust()))))
```
Because we add Cheese on top of Anchovy, and then remove Anchovy.

## Summary
We can add, remove or substitute any elements in the Kebab.

## Weak point in solution of Character3
+ We defined 7 classes and each contain 3 methods.

+ For everything we want to do with Pizza, we must add a
method definition in each class.