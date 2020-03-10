package ru.job4j2.tracker;

public class AllAction implements UserAction {
    @Override
    public String name() {
        return "All Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}
