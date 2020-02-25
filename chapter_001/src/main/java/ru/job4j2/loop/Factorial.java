package ru.job4j2.loop;

/**
 * 5.2. Создать программу, вычисляющую факториал.[#235503]
 */
public class Factorial {

    /**
     * метод вычесляет факториал
     * @param n - значение
     * @return - результат
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}