package ru.job4j2.sort;

import java.util.Arrays;

/**
 * Сдача в кофе машине. [#34741]
 */
public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    /**
     * метод реализует работу лендингов аппарата, расчитывает сдачу в монетах
     *
     * @param money - внесенная сумма
     * @param price - цена продукта
     * @return - массив монет
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                change -= coins[i];
                rsl[size++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}