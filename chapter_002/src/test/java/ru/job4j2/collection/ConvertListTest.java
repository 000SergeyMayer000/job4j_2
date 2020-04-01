package ru.job4j2.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void when2ArrToList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void when3ArrToList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{9, 8, 7, 6});
        in.add(new int[]{5});
        in.add(new int[]{4, 3, 2, 1});
        List<Integer> expect = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertThat(ConvertList.convert(in), is(expect));
    }
}