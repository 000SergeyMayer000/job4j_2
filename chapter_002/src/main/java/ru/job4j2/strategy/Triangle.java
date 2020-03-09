package ru.job4j2.strategy;

import java.util.StringJoiner;

/**
 * 7. Шаблон проектирования - Стратегия.[#235575]
 */
public class Triangle implements Shape {

    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("   +   ");
        pic.add("  + +  ");
        pic.add(" +   + ");
        pic.add("+++++++");
        return pic.toString();
    }
}