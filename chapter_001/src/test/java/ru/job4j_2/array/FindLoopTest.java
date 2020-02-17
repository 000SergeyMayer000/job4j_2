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


    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind0() {
        int[] input = new int[]{0, 5, 2, 0, 10, 2, 4, 0};
        int value = 0;
        int start = 4;
        int finish = 7;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 7;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[]{0, 5, 2, 0, 10, 2, 4, 0};
        int value = 2;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort34125() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = FindLoop.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortNegative123456() {
        int[] input = new int[]{-1, -2, -3, -4, -5, -6};
        int[] result = FindLoop.sort(input);
        int[] expect = new int[]{-6, -5, -4, -3, -2, -1};
        assertThat(result, is(expect));
    }
}