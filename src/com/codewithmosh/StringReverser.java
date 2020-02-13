package com.codewithmosh;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StringReverser {

    private final List<Character> openingBracket = Arrays.asList('{', '(', '[', '<');
    private final List<Character> closingBracket = Arrays.asList('}', ')', ']', '>');

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        /*for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }*/
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuffer reverse = new StringBuffer();

        while (!stack.empty()) {
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }

    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (openingBracket.contains(ch)) {
                stack.push(ch);
            } else if (closingBracket.contains(ch)) {
                if (stack.empty()) {
                    return false;
                }
                char left = stack.pop();
                if (!bracketMatch(ch, left)) return false;
            }
        }

        return stack.empty();
    }

    private boolean bracketMatch(char ch, char left) {
        return openingBracket.indexOf(left) == closingBracket.indexOf(ch);
    }
}
