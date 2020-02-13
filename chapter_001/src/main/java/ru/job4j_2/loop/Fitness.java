package ru.job4j_2.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik > ivan) {
            month++;
            nik *= 2;
            ivan *= 3;
        }
            return month;
    }
}