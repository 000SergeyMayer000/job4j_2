package ru.job4j2.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("The item was successfully deleted");
        } else {
            System.out.println("Item was not deleted");
        }
        return true;
    }
}
