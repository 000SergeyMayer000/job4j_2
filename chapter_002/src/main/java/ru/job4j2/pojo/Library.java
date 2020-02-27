package ru.job4j2.pojo;

/**
 * 3. Массивы и модели.[#235613]
 */
public class Library {

    /**
     *  Main
     * @param args - args
     */
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 500);
        Book book2 = new Book("Философия Java", 640);
        Book book3 = new Book("Унесенные ветром", 480);
        Book book4 = new Book("Незнайка на луне", 70);
        Book[] library = new Book[4];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            System.out.println("Название книги - " + book.getName() + ", количество страниц - " + book.getSize());
        }

        System.out.println();
        Book tmp = library[0];
        library[0] = library[3];
        library[3] = tmp;
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            System.out.println("Название книги - " + book.getName() + ", количество страниц - " + book.getSize());
        }

        System.out.println();
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("Название книги - " + book.getName() + ", количество страниц - " + book.getSize());
            }
        }
    }
}
