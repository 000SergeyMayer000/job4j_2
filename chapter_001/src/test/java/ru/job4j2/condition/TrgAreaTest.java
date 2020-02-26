package ru.job4j2.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j2.converter.Point;

public class TrgAreaTest {
    @Test
    public void whenSide3and4and5() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 4);
        Point third = new Point(3, 0);
        TrgArea trg = new TrgArea(first, second, third);
        double result = trg.area();
        double expected = 6;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenTriangleNotExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 1);
        Point third = new Point(0, 10);
        TrgArea trg = new TrgArea(first, second, third);
        double result = trg.area();
        double expected = -1;
        Assert.assertEquals(expected, result, 0.01);
    }
}
