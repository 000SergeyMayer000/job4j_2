package ru.job4j2.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Что ты хочешь узнать?, спрашивай...");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
