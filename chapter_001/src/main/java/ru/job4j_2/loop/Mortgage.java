package ru.job4j_2.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while(amount > 0){
          amount = amount + (int)(amount*percent/100);
          amount = amount - salary;
            year++;
        }
        return year;
    }
}