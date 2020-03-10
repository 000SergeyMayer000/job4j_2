package ru.job4j2.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find Item by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] findItems = tracker.findByName(name);
        for (Item item1 : findItems) {
            System.out.println(item1);
        }
        return true;
    }
}
