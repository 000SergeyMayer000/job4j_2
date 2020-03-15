package ru.job4j2.array;

/**
 * 6.4.1. Слово заканчивается с ...[#235432]
 */
public class EndsWith {
    /**
     * метод проверяет, что слово заканчивается на определенную последовательности.
     *
     * @param word - проверыемый массив(слово)
     * @param post -  массив символов "шаблон" для проверки (постфикс)
     * @return -
     */

//    public static boolean endsWith(char[] word, char[] post) {
//        boolean result = true;
//        for (int i = (post.length - 1); i >= 0; i--) {
//            if (post[i] != (word[(word.length - post.length) + i])) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - index - 1] != post[post.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}