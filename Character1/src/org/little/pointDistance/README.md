# Abstract Class
+ When specifying a collection of data, 
use abstract classes for datatypes and 
extended classes for variants.
  
+ Matthias Felleisen. 
A Little Java, A Few Patterns (MIT Press) 
(Kindle Locations 109-110). Kindle Edition. 

## Points' distance
+ We have 2 different kinds of points: CartesianPt and ManhattanPt.
+ We need to calculate Cartesian distance and 
Manhattan distance of a point.

+ We also need to compare the distance and find which one is closer.

+ Now we may have more kinds of points. How to update?


## Original ideas UML class diagram
+ https://www.dropbox.com/s/o17iiwkxe1p45j1/LittleJavaPoints.png?dl=0

## Original ideas code
```JAVA
public class Point {
    private int _x;
    private int _y;
    
    public Point(int x, int y) {
        _x = x;
        _y = y;
    }
    
    public double cartesianDistance() {
        return 0.0;
    }
    
    public double manhattanDistance() {
        return 1.0;
    }
    
    public boolean closeTo(Point p) {
        return true;
    }
}
```
