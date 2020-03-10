package ru.job4j2.tracker;

/**
 * 9. Написать тесты на StartUI.[#235574]
 */
public class StubAction implements UserAction {
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}