package ru.job4j2.condition;

/**
 * 4.1. Глупый бот.[#235415]
 */
public class DummyBot {

    /**
     * метод реализует диалог с "ботом"
     *
     * @param question - вопрос
     * @return - ответ
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}

