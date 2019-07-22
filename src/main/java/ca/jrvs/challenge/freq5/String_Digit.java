package ca.jrvs.challenge.freq5;

public class String_Digit {
    /**
     * Check if a String contains only digits
     */
    public boolean StringWithDigit(String s) {
        for (char charS : s.toCharArray()) {
            if (!Character.isDigit(charS)) {
                return false;
            }
        }
        return true;
    }
}
