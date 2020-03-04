package ru.job4j2.tracker;

import java.util.*;
import java.util.Arrays;


/**
 * класс Tracker является хранилищем заявок и содержит методы и поля, необходимые для работы с заявками
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    /**
     * метод add добовляет заявку
     *
     * @param item - заявка
     * @return - заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * метод обеспечивает вывод всех заявок
     *
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * поиск заявок по имени
     *
     * @param key - ключ поиска
     * @return - возвращает массив найденых заявок
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int sizeCopyArray = 0;
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[sizeCopyArray] = item;
                sizeCopyArray++;
            }
        }
        return Arrays.copyOf(result, sizeCopyArray);
    }

    /**
     * поиск заявок по имени
     *
     * @param id - ID искомой заявки
     * @return - возвращает массив найденых заявок
     */
    public Item findById(String id) {
        int index = indexOf(id);
        Item rsl = null;
        if (index != -1) {
            rsl = items[indexOf(id)];
        }
        return rsl;
    }

    /**
     * метод возвращает индекс заявки по его ID
     *
     * @param id - ID искомой заявки
     * @return - индекс искомой заявки
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    /**
     * метод производит замену заявки(ID сохраняется)
     *
     * @param id   - ID заявки , которую необходимо заменить
     * @param item - новая заявка для замены
     * @return - true - в случае удачной замены заявки
     */
    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int indexReplace = indexOf(id);
        if (indexReplace != -1) {
            item.setId(items[indexReplace].getId());
            items[indexReplace] = item;
            rsl = true;
        }
        return rsl;
    }

    /**
     * метод удаляетт заявку из трекера
     *
     * @param id - ID заявки , которую необходимо удалить
     */
    public boolean delete(String id) {
        boolean rsl = false;
        int indexDelete = indexOf(id);
        if (indexDelete != -1) {
            Item delete = items[indexDelete];
            System.arraycopy(items, indexDelete + 1, items, indexDelete, (position - indexDelete - 1));
            items[position - 1] = null;
            position--;
            rsl = true;
        }
        return rsl;
    }

    /**
     * метод генерирует ID
     *
     * @return - String ID
     */
    public String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
