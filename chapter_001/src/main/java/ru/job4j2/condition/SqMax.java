package ru.job4j2.condition;

/**
 *  4.5. Отладка программы в IDEA[#235418]
 */
public class SqMax {

    /**
     *метод определяет максимум из четырех чисел
     * @param first  - значение
     * @param second - значение
     * @param third - значение
     *@param forth - значение
     * @return  - максимум
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            } else if (third > forth) {
                result = third;
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
