package ru.job4j2.loop;

/**
 * 5.4. Протеиновая диета.[#235495]
 */
public class Fitness {

    /**
     * Метод вычисляет количество месяцев, которое необходимо Ивану, чтобы обогнать в тяге Николая.
     * @param ivan - жим Ивана
     * @param nik - жим Ника
     * @return - срок
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik > ivan) {
            month++;
            nik *= 2;
            ivan *= 3;
        }
            return month;
    }
}