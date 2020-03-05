package ru.job4j2.poly;

public interface Transport {
    public void drive();

    public void passenger(int count);

    public double costOfFuel(int amountOfFuel);
}