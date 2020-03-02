package ru.job4j2.poly;

public interface Store {

    void save(String value);

    String[] load();
}