package ru.job4j2.tracker;


/**
 * 5. Input и полиморфизм.[#235566]
 */
public class StubInput implements Input {

    /**
     * в поле класса распологаются: массив ответов которые мы получаем при
     * вызове одного из методов и счетчик ответов, который будет считать
     * количество раз обращения и в зависимости от его числа выдавать ту или
     * иную ячеку из массива ответов
     */
    private String[] answers;
    private int position = 0;

    /**
     * конструктор класса который принимает массив ответов
     *
     * @param answers -
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }


    /**
     * метод возвращает String - ответ, в зависимости от того какой вопрос - String был передан на вход
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    /**
     * * метод возвращает Integer - ответ, в зависимости от того какой вопрос - String был передан на вход
     * * @param question - вопрос
     * * @return - ответ
     */
    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}