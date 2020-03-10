package ru.job4j2.tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}