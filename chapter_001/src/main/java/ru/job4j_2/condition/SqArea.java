package ru.job4j_2.condition;

public class SqArea {

    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int L = h * k;
        return h * L; //(p / (2 * k + 2)) * (p / (2 * k + 2)) * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        double result3 = SqArea.square(24, 2);
        System.out.println(" p = 24, k = 2, s = 32, real = " + result3);
    }
}
