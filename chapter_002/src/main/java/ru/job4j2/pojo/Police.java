package ru.job4j2.pojo;

import java.util.Date;

/**
 * 2. Модель данных.[#235612]
 */
public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}