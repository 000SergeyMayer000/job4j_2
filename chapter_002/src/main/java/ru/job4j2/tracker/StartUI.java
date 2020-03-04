package ru.job4j2.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.println("Enter name Item:");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item was successfully replaced");
                } else {
                    System.out.println("Item was not replaced");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("The item was successfully deleted");
                } else {
                    System.out.println("Item was not deleted");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID ====");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
               // System.out.println(Arrays.toString(tracker.findByName(name)));
                Item[] findItems = tracker.findByName(name);
                for (Item item1 : findItems) {
                    System.out.println(item1);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}