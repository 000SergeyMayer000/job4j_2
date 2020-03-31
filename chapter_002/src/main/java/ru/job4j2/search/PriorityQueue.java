package ru.job4j2.search;

import java.util.LinkedList;

/**
 * 2. Очередь с приоритетом на LinkedList[#235529]
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        int counter = 0;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() > task.getPriority()) {
                counter = i;
            }
        }
        tasks.add(counter, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}