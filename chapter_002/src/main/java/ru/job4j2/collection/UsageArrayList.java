package ru.job4j2.collection;

import java.util.ArrayList;

/**
 * 0. Коллекции, ArrayList, List, Обобщения[#235534]
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
