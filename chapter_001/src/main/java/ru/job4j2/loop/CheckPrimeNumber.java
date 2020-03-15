package ru.job4j2.loop;

/**
 * 5.5. Простое число.[#235498]
 */
public class CheckPrimeNumber {

    /**
     * метод проверяет является ли число целым
     *
     * @param number - чосло
     * @return - true(false)
     */

    public static boolean check(int number) {
        boolean prime = true;

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        } else {
            prime = false;
        }
        return prime;
    }
//    public static boolean check(int number) {
//        boolean rsl = number > 1;
//        if (rsl) {
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    rsl = false;
//                    break;
//                }
//            }
//        }
//        return rsl;
//    }
}
