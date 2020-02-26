package ru.job4j2.converter;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when0304() {
        Point point1 = new Point(0, 3);
        double expected = 5;
        double out = point1.distance(new Point(4, 0));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5000() {
        Point point1 = new Point(0, 0);
        double expected = 5;
        double out = point1.distance(new Point(0, 5));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0000() {
        Point point1 = new Point(0, 0);
        double expected = 0;
        double out = point1.distance(new Point(0, 0));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3D000000() {
        Point point1 = new Point(0, 0, 0);
        double expected = 0;
        double out = point1.distance3D(new Point(0, 0, 0));
        Assert.assertEquals(expected, out, 0.01);
    }
}