package org.little.pointDistance;

public class CartesianPt extends Point{
	public CartesianPt(int x, int y) {
		super(x, y);
	}
	
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return Math.sqrt(_x * _x + _y * _y);
	}
}
