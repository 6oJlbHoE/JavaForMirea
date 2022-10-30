package Pr3.MathRandom.Pr3_Task1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandArray {
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);
        Random rand = new Random();
        int n = cin.nextInt();
        ArrayList<Double> array = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            array.add(rand.nextDouble());
        }
        System.out.println("Рандомно сгенерированный массив при помощи класса Random:");
        System.out.println(array);
        Collections.sort(array);
        System.out.println("Отсортированный массив, сгенерирован при помощи класса Random:");
        System.out.println(array);
        System.out.println("Рандомно сгенерированный массив при помощи класса Math:");
        System.out.println(array);
        for (int i = 0; i < n; i++) {
            array.set(i, Math.random());
        }
        Collections.sort(array);
        System.out.println("Отсортированный массив, сгенерированный при помощи класса Math:");
        System.out.println(array);
    }
}
