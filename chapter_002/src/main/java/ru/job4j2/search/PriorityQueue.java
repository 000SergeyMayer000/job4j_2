package ru.job4j2.search;

import java.util.LinkedList;

/**
 * 2. Очередь с приоритетом на LinkedList[#235529]
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * метод вставляет задачи в список исходя из приоритета
     *
     * @param task -
     */
    public void put(Task task) {
        int counter = 0;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() >= task.getPriority()) {
                break;
            } else {
                counter++;
            }
        }
        tasks.add(counter, task);
    }

    /**
     * метод возвращает первую задачу из списка, а после удаляет ее
     *
     * @return -
     */
    public Task take() {
        return tasks.poll();
    }
}