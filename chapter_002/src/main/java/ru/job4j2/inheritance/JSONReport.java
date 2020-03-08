package ru.job4j2.inheritance;

public class JSONReport extends TextReport {

    @Override
    public StringBuilder generate(String name, String body) {
        StringBuilder str = new StringBuilder();

        return str.append("{").append(System.lineSeparator()
                + System.lineSeparator()).append(name).append(" ")
                .append(" : ").append(name).append(",").append(System.lineSeparator())
                .append(body).append(" : ").append(body).append(System.lineSeparator() + System.lineSeparator()).append("}");
    }
}
