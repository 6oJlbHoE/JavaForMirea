package Pr2.Pr2Task1;
import  java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String name;
        String email;
        char gender;
        Scanner input = new Scanner(System.in);
        name = input.next();
        email = input.next();
        gender = input.next().charAt(0);
        Author k1 = new Author(name, email, gender);
        System.out.println(k1);
    }
}
