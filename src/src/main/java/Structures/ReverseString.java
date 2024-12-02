package Structures;

public class ReverseString {

    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String result = reverse(original);
        System.out.println("Обратная строка: " + result);
    }
}