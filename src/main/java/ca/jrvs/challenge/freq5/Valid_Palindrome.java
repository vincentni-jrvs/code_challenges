package ca.jrvs.challenge.freq5;

public class Valid_Palindrome {
    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        return compare(0, s.length() - 1, s);

    }

    private boolean compare(int a, int b, String s) {
        if (a == b || a > b)
            return true;
        if (Character.toLowerCase(s.charAt(a)) == Character.toLowerCase(s.charAt(b))) {
            return compare(a + 1, b - 1, s);
        } else return false;
    }
}
