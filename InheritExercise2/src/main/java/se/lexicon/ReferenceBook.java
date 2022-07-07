package se.lexicon;

public class ReferenceBook extends Book{
    public ReferenceBook(String title, String author, int year, int pages) {
        super(title, author, year, pages);
        category = Category.NON_LOANABLE;
    }
}
