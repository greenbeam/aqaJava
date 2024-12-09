package Complex.MyLibrary;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Book activeBook;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String title, String author) {
        books.put(title, new Book(title, author));
    }

    public void switchBook(String title) {
        if (books.containsKey(title)) {
            if (activeBook != null) {
                System.out.println("Сохраняем текущую книгу: " + activeBook);
            }
            activeBook = books.get(title);
            System.out.println("Переключено на книгу: " + activeBook);
        } else {
            System.out.println("Книга с таким названием не найдена.");
        }
    }
    public void setActivePage(int page) {
        if (activeBook != null) {
            activeBook.setLastActivePage(page);
            System.out.println("Установлена последняя активная страница для книги " + activeBook.getTitle() + " - "+ page);
        } else {
            System.out.println("Нет активной книги.");
        }
    }

    public void showActiveBook() {
        if (activeBook != null) {
            System.out.println("Активная книга: " + activeBook);
        } else {
            System.out.println("Нет активной книги.");
        }
    }
}
