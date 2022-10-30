package Pr2.Pr2Task6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double Radius;
        System.out.println("Enter parametrs of circle A: ");
        x = input.nextDouble();
        y = input.nextDouble();
        Radius = input.nextDouble();
        Circle A = new Circle(x, y, Radius);
        System.out.println(A);
        System.out.println("Enter parametrs of circle B: ");
        x = input.nextDouble();
        y = input.nextDouble();
        Radius = input.nextDouble();
        Circle B = new Circle(x, y, Radius);
        System.out.println(B);
        System.out.println("Area of circle A: " + A.area());
        System.out.println("Length of circle B: " + B.length());
        A.compare(B);
    }
}
