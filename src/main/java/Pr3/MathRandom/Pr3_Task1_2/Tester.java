package Pr3.MathRandom.Pr3_Task1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    private static int size = 5;
    private static ArrayList<Circle> circles;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circles = new ArrayList<Circle>(size);
        Circle currentCircle;
        double x, y, radius;
        for (int i = 0; i < size; i++){
            System.out.printf("Enter x of center, y of center and radius: ");
            x = input.nextDouble();
            y = input.nextDouble();
            radius = input.nextDouble();
            currentCircle = new Circle(x, y, radius);
            circles.add(currentCircle);
            System.out.println(circles.get(i));
        }
    }
}
