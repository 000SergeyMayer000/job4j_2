package ru.job4j2.condition;

/**
 * 4.2. Максимум из двух чисел[#235420]
 */
public class Max {

    /**
     * метод возвращает максимум из двух чисел
     * @param left - первое значение
     * @param right - второе значение
     * @return - большее
     */
    public static int max(int left, int right) {
      //  return Math.max(left, right);
        return left > right ? left : right;
    }
}