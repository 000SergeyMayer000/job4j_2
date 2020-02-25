package ru.job4j2.loop;

/**
 * 5.5. Простое число.[#235498]
 */
public class CheckPrimeNumber {

    /**
     * метод проверяет является ли число целым
     * @param number - чосло
     * @return - true(false)
     */
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}