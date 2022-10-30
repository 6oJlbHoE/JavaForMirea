package Pr2.Pr2Task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            counter++;
            input.next();
        }
        System.out.println(counter);
    }
}