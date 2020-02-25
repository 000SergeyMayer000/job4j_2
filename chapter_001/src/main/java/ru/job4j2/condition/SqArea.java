package ru.job4j2.condition;

/**
 * 8. Стороны прямоугольника.[#235456]
 */
public class SqArea {

    /**
     * метод определяет площадь парямоугольника
     * @param p - переиметр
     * @param k - коэффициент отношения сторон
     * @return - площадь
     */
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        int s = h * l;
        return s;
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
