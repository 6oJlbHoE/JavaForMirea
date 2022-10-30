package Pr2.Pr2Task7;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        BookShelf shelf1 = new BookShelf(3);
        Scanner input = new Scanner(System.in);
        String name;
        String author;
        int yearOfPublication;
        for (int i = 0; i <= 3; i++){
            name = input.next();
            author = input.next();
            yearOfPublication = input.nextInt();
            if(shelf1.addBook(name, author, yearOfPublication) == 0) System.out.println("We put your book on the bookshelf");
            else System.out.println("Sorry, there's no room on the bookshelf for another book");
        }
        System.out.println(shelf1.newestBook());
        System.out.println(shelf1.oldestBook());
        System.out.println(shelf1);
        shelf1.sortBookShelf();
        System.out.println(shelf1);
    }
}
