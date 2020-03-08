package ru.job4j2.inheritance;

public class HtmlReport extends TextReport {

    @Override
    public StringBuilder generate(String name, String body) {
        StringBuilder rsl = new StringBuilder();
        return rsl.append("<h1>").append(name).append("</h1>").append("<br/>").append("<span>").append(body).append("</span>");
    }
}