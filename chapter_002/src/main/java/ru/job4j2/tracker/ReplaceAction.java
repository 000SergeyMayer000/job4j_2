package ru.job4j2.tracker;

public class ReplaceAction implements UserAction  {
    @Override
    public String name() {
        return "Replace Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        String name = input.askStr("Enter new name Item:");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was successfully replaced");
        } else {
            System.out.println("Item was not replaced");
        }
        return true;
    }
}
