package ru.job4j_2.converter;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when0004() {
        double expected = 4;
       double out = Point.distance(0, 0, 0, 4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5000() {
        double expected = 5;
        double out = Point.distance(5, 0, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0000() {
        double expected = 0;
        double out = Point.distance(0, 0, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
}