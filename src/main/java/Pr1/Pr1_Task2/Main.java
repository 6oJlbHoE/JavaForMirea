package Pr1.Pr1_Task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int summa = 0, maxValue = 0, minValue = 999999;
        int[] arrayOfInt = new int[n];
        for (int i = 0; i < n; i++){
            arrayOfInt[i] = input.nextInt();
        }///lets go

        int i = 0;
        while   (i < arrayOfInt.length){
            summa += arrayOfInt[i];
            if(arrayOfInt[i] > maxValue) {
                maxValue = arrayOfInt[i];
            }
            if(arrayOfInt[i] < minValue){
                minValue = arrayOfInt[i];
            }
            i++;
        }
        System.out.println("Sum of array elements (while): " + summa);
        System.out.println("Max (while): " + maxValue);
        System.out.println("Min (while): " + minValue);
        maxValue = 0;
        minValue = 999999;
        summa = 0;
        i = 0;
        do{
            summa += arrayOfInt[i];
            if(arrayOfInt[i] > maxValue) {
                maxValue = arrayOfInt[i];
            }
            if(arrayOfInt[i] < minValue){
                minValue = arrayOfInt[i];
            }
            i++;
        }while   (i < arrayOfInt.length);
        System.out.println("Sum of array elements (do while): " + summa);
        System.out.println("Max (do while): " + maxValue);
        System.out.println("Min of array elements (do while): " + minValue);
    }
}
