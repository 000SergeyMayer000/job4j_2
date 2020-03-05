package ru.job4j2.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        double t = 5.5;
        double v = 90;
        double s = t * v;
        System.out.println("Пройденый путь составил - " + s + " км");
    }

    @Override
    public void passenger(int count) {
        String name = "Икарус";
        System.out.println("Транспортное стредство - " + name + ", " + "посадочных мест - " + count);
    }

    @Override
    public double costOfFuel(int amountOfFuel) {
        double price = 45.5;
        double sum = price * amountOfFuel;
        System.out.println("Стоимость топлива составила - " + sum + " руб.");
        return sum;
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.passenger(42);
        bus1.drive();
        bus1.costOfFuel(100);
    }
}


