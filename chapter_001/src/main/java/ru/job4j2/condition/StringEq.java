package ru.job4j2.condition;


/**
 * 4.1.0. Операторы сравнения в String.[#252627]
 */
public class StringEq {
    public static boolean check(String login) {
        String root = "root";
        return root.equals(login);
    }

    public static void main(String[] args) {
        String your = "root";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}