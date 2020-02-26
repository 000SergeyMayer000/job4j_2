package ru.job4j2.oop;

/**
 * 1.7. Состояние объекта.[#235600]
 */
public class Battery {
    private int load;

    /**
     * начальное состояние батареи - заряд
     *
     * @param value -
     */
    public Battery(int value) {
        this.load = value;
    }

    /**
     * метод извликает ВЕСЬ заряд из батареи(входящий параметр)
     *
     * @param another - Батарея "донор"
     */
    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Battery battery1 = new Battery(30);
        Battery battery2 = new Battery(70);
        System.out.println("Заряд первой батареи - " + battery1.load);
        System.out.println("Заряд второй батареи - " + battery2.load);
        System.out.println("Разряжаем первую батарею во вторую");
        battery2.exchange(battery1);
        System.out.println("Заряд первой батареи - " + battery1.load);
        System.out.println("Заряд второй батареи - " + battery2.load);
    }
}