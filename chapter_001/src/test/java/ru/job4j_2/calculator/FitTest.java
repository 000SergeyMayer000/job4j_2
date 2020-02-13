package ru.job4j_2.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
        public void whenMenWeight() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomenWeight() {
        double in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}
