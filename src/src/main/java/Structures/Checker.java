package Structures;
import java.util.Stack;
/*
Написать функцию, использующую стек для проверки правильности последовательности скобок в строке
(например, "([]{})" является правильной, а "([)]" — нет).
*/

public class Checker {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "([]{})"; // Правильная последовательность
        String test2 = "([)]";   // Неправильная последовательность
        String test3 = "{[()]}"; // Правильная последовательность
        String test4 = "((()))"; // Правильная последовательность
        String test5 = "((()";   // Неправильная последовательность

        System.out.println(test1 + ": " + isValid(test1)); // true
        System.out.println(test2 + ": " + isValid(test2)); // false
        System.out.println(test3 + ": " + isValid(test3)); // true
        System.out.println(test4 + ": " + isValid(test4)); // true
        System.out.println(test5 + ": " + isValid(test5)); // false
    }
}
