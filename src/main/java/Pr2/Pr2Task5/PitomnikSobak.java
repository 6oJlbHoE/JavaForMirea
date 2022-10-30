package Pr2.Pr2Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class PitomnikSobak {
    private static ArrayList<Dog> pitomnik = new ArrayList<Dog>();

    public static void addDog(int n){
        Dog curDog;
        String name;
        Scanner input = new Scanner(System.in);
        int age;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name and age of new dog: ");
            name = input.next();
            age = input.nextInt();
            curDog = new Dog(name, age);
            pitomnik.add(curDog);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter a count of the dogs: ");
        n = input.nextInt();
        addDog(n);
        for (int i = 0; i < pitomnik.size(); i++) {
            System.out.println(pitomnik.get(i));
        }
    }
}
