package ru.job4j2.tracker;

public class FindByIDAction implements UserAction {
    @Override
    public String name() {
        return "Find Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        System.out.println(tracker.findById(id));
        return true;
    }
}
