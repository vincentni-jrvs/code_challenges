package ca.jrvs.challenge.freq4;

public class Reverse_Words {
    /**
     * Given an input string, reverse the string word by word.
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String out = "";
        for (int i = parts.length - 1; i > 0; i--) {
            out += parts[i] + " ";
        }
        return out + parts[0];
    }
}
