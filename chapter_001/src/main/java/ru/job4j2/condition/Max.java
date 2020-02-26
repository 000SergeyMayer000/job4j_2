package ru.job4j2.condition;

/**
 * 4.2. Максимум из двух чисел[#235420]
 */
public class Max {

    /**
     * метод возвращает максимум из двух чисел
     *
     * @param first  - первое значение
     * @param second - второе значение
     * @return - большее
     */
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * метод возвращает максимум из ТРЁХ чисел(перегруженный метод)
     *
     * @param first  - первое значение
     * @param second - второе значение
     * @param third  -  третье значение
     * @return - большее
     */
    public static int max(int first, int second, int third) {
        return Math.max(third, max(first, second));
    }

    /**
     * метод возвращает максимум из ЧЕТЫРЕХ чисел(перегруженный метод)
     *
     * @param first  - первое значение
     * @param second - второе значение
     * @param third  -  третье значение
     * @param fourth -  третье значение
     * @return - большее
     */
    public static int max(int first, int second, int third, int fourth) {
        return Math.max(fourth, max(first, second, third));
    }
}