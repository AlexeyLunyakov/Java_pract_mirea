package ru.mirea.newpr.pr25_done;
import java.util.*;

public class Brackets_check {
    private static boolean isValidBrackets(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            }
            else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Варианты для тестирования: \n");
        System.out.println("(abc*-ab) -> " + isValidBrackets("(abc*-ab)")); // true
        System.out.println("(())) -> " + isValidBrackets("(()))")); // false
        System.out.println("(({()}[()])) -> " + isValidBrackets("(({()}[()]))")); // true
        System.out.println("((] -> " + isValidBrackets("((]")); // false
    }
}
