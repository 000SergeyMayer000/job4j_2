package ru.job4j_2.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(new int[]{10, 5, 3}), is(3));
    }

    @Test
    public void whenNegativeNamberMin() {
        assertThat(
                Min.findMin(new int[]{-7, 10, 5, 3}), is(-7));
    }

}