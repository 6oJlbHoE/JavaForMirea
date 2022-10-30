package Pr3.MathRandom.Pr3_Task1_5;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = cin.nextInt();
        while(n <= 0){
            System.out.print("Введите размер массива: ");
            n = cin.nextInt();
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            array.add((int) (Math.random() * (n+1)));
            if(array.get(i) % 2 == 0) evenArray.add(array.get(i));
        }
        System.out.println("Случайно сгенерированный массив из n = " + n + ": ");
        System.out.println(array);
        System.out.println("Массив из четных элементов предыдущего массива: ");
        System.out.println(evenArray);
    }
}
