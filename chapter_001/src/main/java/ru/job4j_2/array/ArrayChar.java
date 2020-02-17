package ru.job4j_2.array;

/**
 * 6.4. Слово начинается с ...[#235428]
 */

public class ArrayChar {

    /**
     * метод проверяет, что слово начинается c определенной последовательности.
     *
     * @param word - проверыемый массив(слово)
     * @param pref - массив "шаблон" для проверки (префикс)
     * @return - если полное совпадение - true, в противном случае - false
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
