package Pr2.Pr2Task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double xDisp = input.nextDouble();
        double yDisp = input.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println(ball);
        ball.move(xDisp, yDisp);
        System.out.println(ball);
    }
}
