package Complex.MyLibrary;

public class Book {
    private String title;
    private String author;
    private int lastActivePage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.lastActivePage = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLastActivePage() {
        return lastActivePage;
    }

    public void setLastActivePage(int page) {
        this.lastActivePage = page;
    }

    @Override
    public String toString() {
        return "Книга: " + title + " | Автор: " + author + " | Последняя активная страница: " + lastActivePage;
    }
}
