package ru.job4j_2.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxMinus5To1Then1() {
        int result = Max.max(-5, 1);
        assertThat(result, is(1));
    }

}