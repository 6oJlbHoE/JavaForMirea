package Pr1.Pr1_Task1;
import java.util.Scanner;

//public class Main {
//    public static int sum1(int [] arrayOfInt){
//        int s = 0;
//        for (int j : arrayOfInt) {
//            s += j;
//        }
//        return s;
//    }
//    public static int sum2(int [] arrayOfInt){
//        int s = 0;
//        int i = 0;
//        do {
//            s += arrayOfInt[i];
//            i++;
//        }while(i < arrayOfInt.length);
//        return s;
//    }
//    public static int sum3(int [] arrayOfInt){
//        int s = 0;
//        int i = 0;
//        while(i < arrayOfInt.length){
//            s += arrayOfInt[i];
//            i++;
//        }
//        return s;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] arrayOfInt = new int[n];
//
//        for (int i = 0; i < n; i++){
//            arrayOfInt[i] = input.nextInt();
//        }
//        System.out.println("Sum of array elements (for): " + sum1(arrayOfInt));
//        System.out.println("Sum of array elements (while): " + sum2(arrayOfInt));
//        System.out.println("Sum of array elements (do while): " + sum3(arrayOfInt));
//    }
//}
public class Main {
    public static void main(String[] args) {
        int[] arrayOfInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa = 0;
        for (int j : arrayOfInt) {
            summa += j;
        }
        System.out.println("Sum of array elements (for): " + summa);
        System.out.println("arithmetic mean: " + (float)summa / arrayOfInt.length);
    }
}
//разработать программу которая считает сумму элементов int массива. Задаем сами. При помощи трех циклов
//разработать программу в которой выводится первые 10 элементов гармонического ряда с округлением до 2х знаков
//после запятой. И вывести их сумму