package org.little.pointDistance;

public abstract class Point {
	int _x;
	int _y;
	
	public Point(int x, int y) {
		_x = x;
		_y = y;
	}
	
	public boolean closerToO(Point p) {
		return distanceToO() <= p.distanceToO();
	}
	
	public abstract double distanceToO();
}
