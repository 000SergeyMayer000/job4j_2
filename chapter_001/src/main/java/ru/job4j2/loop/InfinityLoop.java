package ru.job4j2.loop;

/**
 * 5.0.2. Вечный цикл for.[#235501]
 * поиск ошибки в коде
 */
    public class InfinityLoop {
        public static void main(String[] args) {
            for (int index = 0; index < 10; index++) {
                System.out.println("infinity");
                index = index - 1; //лишняя строчка
            }
        }
    }

