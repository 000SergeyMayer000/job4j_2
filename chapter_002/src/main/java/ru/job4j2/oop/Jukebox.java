package ru.job4j2.oop;

/**
 * 1.3. Вызов метода с аргументами.[#235597]
 */
public class Jukebox {

    /**
     * метод выводит различные строики в консоль при различнях входящих параметрах
     *
     * @param position - входящий параметр
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи, малыши");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
        box.music(2);
        box.music(3);
    }
}
