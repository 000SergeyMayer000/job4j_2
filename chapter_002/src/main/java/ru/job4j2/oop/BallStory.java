package ru.job4j2.oop;

/**
 * 1.6. Взаимодействие объектов.[#235598]
 * на примере сказки Красная шапочка показана возможность взоимодеуствия различных объестов
 */
public class BallStory {
    public static void main(String[] args) {

        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        wolf.tryEat(ball);
        ball.song();
        ball.run();
        fox.tryEat(ball);
        ball.song();
        ball.run();
    }
}
