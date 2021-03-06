# Skewers (Kebab model)
+ When writing a function over a datatype, 
place a method in each of the variants 
that make up the datatype. 
If a field of a variant belongs to the same datatype, 
the method may call the corresponding method of the field 
in computing the function.

+ You can change food or holder in this kebab.
+ For example: In class Onion: _s.onlyOnions()

+ For example: 
Here we need to write a function onlyOnions() to Shish.
All the subclass which extend
  
+ Matthias Felleisen. 
  A Little Java, A Few Patterns (MIT Press) 
  (Kindle Locations 192-193). Kindle Edition. 
  
## Original ideas UML class diagram
+ Don't use for loop to check each type.
+ https://www.dropbox.com/s/5ur8ti825cmx5x9/FoodShish.png?dl=0


## Original ideas code
```JAVA
public class Shish {
    private String[] _types;
    
    public Shish(String[] types) {
        _types = types;
    }
    
    public boolean onlyOnion() {
        return false;
    }
    
    public boolean isVegetable() {
        return true;
    }
}
```

## Weak point in new solution
+ We defined 4 classes and each contain 2 methods.

+ For everything we want to do with Shish, we must add a
method definition in each class.