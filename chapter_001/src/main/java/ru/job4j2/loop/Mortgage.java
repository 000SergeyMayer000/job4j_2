package ru.job4j2.loop;

/**
 * 5.7. Ипотека.[#235497]
 */
public class Mortgage {

    /**
     * метод определяет срок за который должен быть огашен кредит
     *
     * @param amount  - размер кредита
     * @param salary  - размер заработной платы
     * @param percent - процент по кредиту
     * @return - переиод
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount;
        while (debt > 0) {
            debt = debt + (debt * percent / 100);
            debt = debt - salary;
            year++;
            System.out.println(debt + " - " + year);
        }
        return year;
    }
}