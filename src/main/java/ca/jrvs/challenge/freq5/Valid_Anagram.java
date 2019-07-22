package ca.jrvs.challenge.freq5;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    /**
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> container = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (char a : s.toCharArray()) {
            container.put(a, container.getOrDefault(a, 0) + 1);
        }
        Integer i;
        for (char a : t.toCharArray()) {
            i = container.get(a);
            if (i == null || i <= 0) return false;
            else container.put(a, i - 1);
        }
        return true;
    }
}
