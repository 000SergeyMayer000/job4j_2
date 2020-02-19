package ru.job4j2.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        int res1 = (first > second ? first : second);
        result = (first > second ? first : second) > third ? (first > second ? first : second) : third;
        return result;
    }
}
