package Pr3.MathRandom.Pr3_Task1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class FourElementsArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int f = 1;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            array.add((int) ((Math.random() * 90)+10));
            if(i != 0 && f == 1 && array.get(i) <= array.get(i-1)){
                f = 0;
            }
        }
        System.out.println(array);
        if(f == 1){
            System.out.println("Последовательность является строго возрастающей");
        }else{
            System.out.println("Последовательность не является строго возрастающей");
        }
    }
}
