package Zadanie5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static   int factorial(int number){
        int result = 1;
        for(; number >= 1; number--){
            result *= number;
        }
        return result;
    }

    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Factorial of number " + n + ": " + factorial(n));
    }
}//на вход 2 числа. 1 длина серии элементов фибоначи 2 с какого начинаем

