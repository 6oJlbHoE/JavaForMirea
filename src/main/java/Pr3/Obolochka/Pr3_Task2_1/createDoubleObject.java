package Pr3.Obolochka.Pr3_Task2_1;

import java.util.Scanner;

public class createDoubleObject {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Double object = 6.0;
        System.out.print("Введите строку для преобразования в тип double: ");
        String str = cin.next();
        double doubleStr = Double.parseDouble(str);
        System.out.println("Введенное число преобразовано в формать double: " + doubleStr);
    }
}
