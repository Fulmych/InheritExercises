package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChildBook c = new ChildBook("Barn", "Person", 2000, 200);
        YoungAdultBook y = new YoungAdultBook("Vuxen", "Person", 2002, 226);
        ReferenceBook r = new ReferenceBook("Frukt", "Person", 1952, 500);
        Book[] books = new Book[]{c,y,r};
        for (Book book : books) {
            if (book.category != Category.NON_LOANABLE) {
                System.out.print("This books is loanable: ");
                System.out.println(book.getTitle());
            }
        }
        for (Book book : books) {
            if (book.category == Category.NON_LOANABLE) {
                System.out.print("This book is not loanable: ");
                System.out.println(book.getTitle());
            }
        }
        for (Book book : books){
            if (book.category == Category.CHILD){
                System.out.print("This book is for children: ");
                System.out.println(book.getTitle());
            }
        }
        for (Book book : books){
            if (book.category == Category.ADULT){
                System.out.print("This book is for adults: ");
                System.out.println(book.getTitle());
            }
        }
    }
}
