package Structures;
import java.util.HashMap;
/*
*Задача 4: Первый уникальный символ
Разработать метод, который возвращает первый уникальный символ в тексте. Какую структуру данных использовать для оптимизации поиска?
*/

public class FirstUnique {
    public static Character firstUniqueChar(String text) {

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Второй проход: ищем первый уникальный символ
        for (char c : text.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character uniqueChar = firstUniqueChar(input);

        if (uniqueChar != null) {
            System.out.println("Первый уникальный символ: " + uniqueChar);
        } else {
            System.out.println("Нет уникальных символов.");
        }
    }

}
