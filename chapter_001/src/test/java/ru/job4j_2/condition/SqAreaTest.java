package ru.job4j_2.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP8K3() {
        double expected = 3;
        double out = SqArea.square(8, 3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP32K1() {
        double expected = 64;
        double out = SqArea.square(32, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K0() {
        double expected = 0;
        double out =SqArea.square(0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

}
