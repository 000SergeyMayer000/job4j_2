package ru.job4j2.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        String text = textReport.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport jsonReport = new JSONReport();
        String json  = jsonReport.generate("name", "body");
        System.out.println(json);
    }
}