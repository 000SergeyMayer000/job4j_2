package ru.job4j2.condition;

/**
 * 4.4. Максимум из трех чисел[#235421]
 */
public class MultiMax {

    /**
     *метод определяет максимум из трех чисел
     * @param first  - значение
     * @param second - значение
     * @param third - значение
     * @return  - максимум
     */
    public int max(int first, int second, int third) {
        int rsl = first > second ? first : second;
        return rsl > third ? rsl : third;
    }
}
