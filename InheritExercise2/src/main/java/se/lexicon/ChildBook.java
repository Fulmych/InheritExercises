package se.lexicon;

public class ChildBook extends Book implements Loanable{
    public ChildBook(String title, String author, int year, int pages) {
        super(title, author, year, pages);
        category = Category.CHILD;
    }

    @Override
    public void loan() {
        System.out.println("This book for children has now been loaned.");
    }
}
