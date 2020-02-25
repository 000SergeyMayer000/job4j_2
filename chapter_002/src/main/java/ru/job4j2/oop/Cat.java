package ru.job4j2.oop;


public class Cat {

    private String name;
    private String food;

    public void show() {
        System.out.println(this.name + " - " + this.food);
    }

    public void givNick(String nick) {
        this.name = nick;
    }


    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.givNick("Гав");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.givNick("Черный кот");
        black.eat("fish");
        black.show();
    }
}