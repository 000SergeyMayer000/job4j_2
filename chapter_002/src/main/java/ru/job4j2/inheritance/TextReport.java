package ru.job4j2.inheritance;

public class TextReport {
    public StringBuilder generate(String name, String body) {
        StringBuilder rsl = new StringBuilder();
        return rsl.append(name).append(System.lineSeparator()).append(body);
    }
}