package ca.jrvs.challenge.freq5;

import java.util.HashSet;

public class Remove_Dup {
    /**
     * Return duplicate characters(in an array) from a given string
     */
    public String remove_dup(String s) {
        String out = "";
        HashSet<Character> dupSet = new HashSet<Character>();
        for (char charS : s.toCharArray()) {
            if (!dupSet.contains(charS)) {
                dupSet.add(charS);
                out = out + String.valueOf(charS);
            }
        }
        return out;
    }
}
