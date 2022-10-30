package Pr2.Pr2Task8;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeArrayList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String tempStr;
        int n = input.nextInt();
        for (int i = 0; i < n; i ++){
            tempStr  = input.next();
            array.add(tempStr);
        }
        for (int i = 0; i < n; i ++) System.out.println(array.get(i));
        for (int i = 0; i < n / 2; i++){
            tempStr = array.get(n - 1 - i);
            array.set(n - 1 - i, array.get(i));
            array.set(i, tempStr);
        }
        for (int i = 0; i < n; i ++) System.out.println(array.get(i));
    }
}
