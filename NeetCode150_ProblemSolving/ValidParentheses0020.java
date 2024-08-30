package NeetCode150_ProblemSolving;

import java.util.*;

public class ValidParentheses0020 {
    public boolean isValid(String s) {
        final Map<Character, Character> parenLookup = new HashMap<>();
        parenLookup.put('(', ')');
        parenLookup.put('{', '}');
        parenLookup.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (parenLookup.containsKey(c)) {
                stack.push(c);
            } else if (parenLookup.containsValue(c) && stack.size() > 0 && parenLookup.get(stack.peek()) == c) {
                stack.pop();
                continue;
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
    }
}
