package Pr2.Pr2Task7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String author = input.next();
        int yearOfPublication = input.nextInt();
        Book book = new Book(name, author, yearOfPublication);
        System.out.println(book);
    }
}
