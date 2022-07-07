package se.lexicon;

public class YoungAdultBook extends Book implements Loanable{
    public YoungAdultBook(String title, String author, int year, int pages) {
        super(title, author, year, pages);
        category = Category.ADULT;
    }
    @Override
    public void loan() {
        System.out.println("This book for adults has now been loaned.");
    }
    @Override
    public String toString() {
        return "YoungAdultBook: " +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
