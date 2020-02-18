package ru.job4j_2.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal3x3() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal4x4() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', ' '},
                {' ', ' ', ' ', 'X'},
                {'X', 'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 3);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVerticalFalse() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoVertical4x4() {
        char[][] input = {
                {'X', ' ', 'X', 'X'},
                {' ', ' ', 'X', 'X'},
                {' ', ' ', 'X', 'X'},
                {' ', ' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 3);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical4x4False() {
        char[][] input = {
                {'X', ' ', 'X', 'X'},
                {' ', ' ', 'X', 'X'},
                {' ', ' ', 'X', 'X'},
                {' ', ' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(false));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDiagonal4x4() {
        char[][] input = {
                {' ', ' ', ' ', 'X'},
                {' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' '},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {' ', 'X', 'X', ' '};
        assertThat(result, is(expect));
    }
}