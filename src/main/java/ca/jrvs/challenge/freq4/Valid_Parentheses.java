package ca.jrvs.challenge.freq4;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        HashMap<Character, Character> counter = new HashMap<>();
        counter.put('(', ')');
        counter.put('{', '}');
        counter.put('[', ']');
        Stack<Character> stack = new Stack<Character>();
        for (char charS : s.toCharArray()) {
            if (counter.containsKey(charS)) {
                stack.push(counter.get(charS));
            } else {
                char out = stack.empty() ? '#' : stack.pop();
                if (out != charS) return false;
            }
        }
        return stack.empty();
    }
}
