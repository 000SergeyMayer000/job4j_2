package ru.job4j2.tracker;


/**
 * 2.1. Реализация класса StartUI[#235573]
 */
public class StartUI {

    /**
     * метод обеспечивает работу всего приложения, в зависимости от выбранного
     * значения  меню, метод произведет основные операции с заявуками:
     * добавить, удалить, редактировать, показать все, произведет поиск по имени и ID
     *
     * @param input   - интерфейс реализующий ввод информации от пользователя
     * @param tracker -  класс-хранилище заявок,
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All Items ====");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Replace Item ====");
                String id = input.askStr("Enter ID: ");
                String name = input.askStr("Enter new name Item:");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item was successfully replaced");
                } else {
                    System.out.println("Item was not replaced");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                String id = input.askStr("Enter ID: ");
                if (tracker.delete(id)) {
                    System.out.println("The item was successfully deleted");
                } else {
                    System.out.println("Item was not deleted");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID ====");
                String id = input.askStr("Enter ID: ");
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                String name = input.askStr("Enter name: ");
                Item[] findItems = tracker.findByName(name);
                for (Item item1 : findItems) {
                    System.out.println(item1);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * метод выводит на экран все элементы меню
     */
    private void showMenu() {
        System.out.println("     Menu.");
        System.out.println("     0. Add new Item");
        System.out.println("     1. Show all items");
        System.out.println("     2. Edit item");
        System.out.println("     3. Delete Item");
        System.out.println("     4. Find Item by ID");
        System.out.println("     5. Find Item by Name");
        System.out.println("     6. Exit program");
    }

    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}