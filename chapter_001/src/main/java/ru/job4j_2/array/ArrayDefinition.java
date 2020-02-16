package ru.job4j_2.array;

/**
 * 6.0.1. Объявление массива.[#235448]
 */
public class ArrayDefinition {

    /**
     * Main
     * @param args - String[] args
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Peter Parker";
        names[1] = "Peter Arsentiev";
        names[2] = "Peter Griffin";
        names[3] = "Peter Pan";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
