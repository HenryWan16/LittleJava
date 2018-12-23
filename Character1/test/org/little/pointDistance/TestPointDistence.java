package org.little.pointDistance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by henrywan16 on 4/21/17.
 */
public class TestPointDistence {
    @Test
    public void closerToO() throws Exception {
        Point p1 = new CartesianPt(0, 0);
        Point p2 = new CartesianPt(1, 1);
        Point p3 = new ManhattanPt(0, 1);
        Point p4 = new ManhattanPt(1, 0);
        assertTrue(p1.closerToO(p2));
        assertTrue(p1.closerToO(p3));
        assertTrue(p4.closerToO(p2));
    }

    @Test
    public void distanceToO() throws Exception {
        Point p1 = new CartesianPt(0, 0);
        Point p2 = new CartesianPt(1, 1);
        Point p3 = new ManhattanPt(0, 1);
        Point p4 = new ManhattanPt(1, 0);
        // Since doubles may not be exactly equal, Epsilon lets you describe how close they have to be.
        assertEquals(Math.sqrt(0), p1.distanceToO(), 0.001);
        assertEquals(Math.sqrt(2), p2.distanceToO(), 0.001);
        assertEquals(1, p3.distanceToO(), 0.001);
        assertEquals(1, p4.distanceToO(), 0.001);
    }

}