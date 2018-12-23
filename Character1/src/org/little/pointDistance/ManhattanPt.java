package org.little.pointDistance;

public class ManhattanPt extends Point{
	
	public ManhattanPt(int x, int y) {
		super(x, y);
	}

	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return _x + _y;
	}
}
