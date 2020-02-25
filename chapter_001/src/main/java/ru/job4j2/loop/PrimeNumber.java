package ru.job4j2.loop;

/**
 * 5.6. Простые числа.[#235496]
 */
public class PrimeNumber {

    /**
     * метод подсчитывает колличество простых чисел
     * @param finish - верхняя граница подсчето
     * @return - результат
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}