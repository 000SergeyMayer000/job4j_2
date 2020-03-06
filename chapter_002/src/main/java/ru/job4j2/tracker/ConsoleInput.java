package ru.job4j2.tracker;

import java.util.Scanner;

/**
 * 4.1. Разрыв зависимости StartUI от Scanner.[#235568]
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * метод возврощает строку котрорую вводит пользователь отвечая на вопрос
     *
     * @param question - входящий параметр - вопрос на который необходимо дать ответ
     * @return - строка - ответ
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * метод возврощает Integer значение которое вводит пользователь отвечая на вопрос
     *
     * @param question - входящий параметр - вопрос на который необходимо дать ответ
     * @return - Integer - ответ
     */
    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}