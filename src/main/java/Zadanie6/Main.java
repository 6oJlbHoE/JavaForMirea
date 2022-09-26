package Zadanie6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int number1 = 0;
        int number2 = 1;
        int r;
        for (int i = 3; i < a; i++){
            r = number1 + number2;
            number1 = number2;
            number2 = r;
        }
        for(int i = a; i < a + b; i++){
            r = number1 + number2;
            number1 = number2;
            number2 = r;
            System.out.print(number2);
        }
    }
}
