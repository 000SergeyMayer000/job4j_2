package ru.job4j_2.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8ThenNotFind() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}