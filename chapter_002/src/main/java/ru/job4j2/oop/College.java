package ru.job4j2.oop;

public class College {
    public static void main(String[] args) {

        StudentCollege student = new Freshman(); //upcasting - восходящее
        // преобразование( преобрахование происходит автоматически, не явно

        Object object = new Freshman();  //up casting

        Freshman freshman1 = (Freshman) student; //down casting - низходящее преобразование (необходимо
        // явно перобразовывать.

    }
}
