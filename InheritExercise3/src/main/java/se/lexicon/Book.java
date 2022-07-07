package se.lexicon;

public class Book {
    String title;
    String author;
    Category category;
    int year;
    int pages;

    public void BookPages() {
        this.pages = 100;
    }

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book:" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
