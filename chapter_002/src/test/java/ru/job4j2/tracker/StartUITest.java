package ru.job4j2.tracker;


import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * 9. Написать тесты на StartUI.[#235574]
 */
public class StartUITest {

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }
}

