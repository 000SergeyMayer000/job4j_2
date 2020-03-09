package ru.job4j2.strategy;

/**
 * 7. Шаблон проектирования - Стратегия.[#235575]
 */
public class Paint {
    public void painting(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.painting(new Triangle());
        paint.painting(new Square());
    }
}

