package Complex.MyLibrary;

public class CheckLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("1984", "Джордж Оруэлл");
        library.addBook("Мастер и Маргарита", "Михаил Булгаков");
        library.addBook("Убить пересмешника", "Харпер Ли");

        library.switchBook("1984");
        library.setActivePage(42);
        library.showActiveBook();

        library.switchBook("Мастер и Маргарита");
        library.setActivePage(75);
        library.showActiveBook();

        library.switchBook("1984");
        library.showActiveBook();

    }
}
