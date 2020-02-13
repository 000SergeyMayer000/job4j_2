package ru.job4j_2.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(-2, 10));
        System.out.println(sum(3, 10));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 3) + " + " + sum(4, 5) + " = " + sum(0, 5));
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(5, 0));
        System.out.println(sumByEven(1, 1));
    }
}