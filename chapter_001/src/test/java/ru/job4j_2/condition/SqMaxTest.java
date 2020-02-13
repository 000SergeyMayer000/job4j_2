package ru.job4j_2.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSecondMax() {
     SqMax check = new SqMax();
        int result = check.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenForthdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

}