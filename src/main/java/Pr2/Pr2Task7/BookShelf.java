package Pr2.Pr2Task7;

import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    private ArrayList<Book> shelf;
    private int count = 0;
    private int size;

    public BookShelf(int size) {
        this.size = size;
        shelf = new ArrayList<Book>(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int addBook(String name, String author, int yearOfPublication){
        if(count < size) {
            Book book = new Book(name, author, yearOfPublication);
            shelf.add(book);
            count++;
            return 0;
        }else{
            return 1;
        }
    }

    public Book newestBook(){
        int maxYear = shelf.get(0).getYearOfPublication();
        int newestI = 0;
        for (int i = 1; i < count; i++){
            if(shelf.get(i).getYearOfPublication() > maxYear){
                newestI = i;
            }
        }
        return shelf.get(newestI);
    }

    public Book oldestBook(){
        int minYear = shelf.get(0).getYearOfPublication();
        int oldestI = 0;
        for (int i = 1; i < count; i++){
            if(shelf.get(i).getYearOfPublication() < minYear){
                oldestI = i;
            }
        }
        return shelf.get(oldestI);
    }

    public void sortBookShelf(){
        Collections.sort(shelf);
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "shelf=" + shelf +
                ", count=" + count +
                ", size=" + size +
                '}';
    }
}
