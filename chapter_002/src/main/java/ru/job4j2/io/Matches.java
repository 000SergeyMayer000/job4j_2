package ru.job4j2.io;

import java.util.Scanner;

/**
 * 2. Scanner и чтение числа из консоли.[#235563]
 * в этом классе реализована игра "11 спичек". Смысл игры в следующем: На столе
 * лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.
 * Выигрывает тот, кто забрал последние спички.
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int gamer1;
        int gamer2;
        boolean a = true;

        while (matches > 0) {
            do {
                System.out.println("Игрок 1 выбирите колличество спичек от 1 до 3");
                gamer1 = input.nextInt();
                if (gamer1 > 0 && gamer1 <= 3) {
                    matches = matches - gamer1;
                    a = false;
                } else {
                    System.out.println("Вы выбрали не корректное число, повторите снова");
                    System.out.println();
                }
            } while (a);
            a = true;
            if (matches <= 0) {
                System.out.println("Игрок 1 проиграл");
            } else {
                System.out.println("На столе осталось " + matches + " спичек");
                do {
                    System.out.println("Игрок 2 выбирите колличество спичек от 1 до 3");
                    gamer2 = input.nextInt();
                    if (gamer2 > 0 && gamer2 <= 3) {
                        matches = matches - gamer2;
                        a = false;
                    } else {
                        System.out.println("Вы выбрали не корректное число, повторите снова");
                        System.out.println();
                    }
                } while (a);
                a = true;
                if (matches <= 0) {
                    System.out.println("Игрок 2 проиграл");
                } else {
                    System.out.println("На столе осталось " + matches + " спичек");

                }
            }
        }
    }
}
//метод без валидации колличества спичек
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int matches = 11;
//        boolean turn = true;
//        while (matches > 0) {
//            System.out.println("Игрок 1 выберите колличество спичек от 1 до 3");
//            matches = matches - input.nextInt();
//            if (matches <= 0) {
//                System.out.println("Игрок 1 проиграл");
//                turn = false;
//            } else {
//                System.out.println("На столе осталось " + matches + " спичек");
//                System.out.println("Игрок 2 выберите колличество спичек от 1 до 3");
//                matches = matches - input.nextInt();
//                if (matches <= 0) {
//                    System.out.println("Игрок 2 проиграл");
//                    turn = false;
//                }
//            }
//            System.out.println("На столе осталось " + matches + " спичек");
//        }
//    }
//}