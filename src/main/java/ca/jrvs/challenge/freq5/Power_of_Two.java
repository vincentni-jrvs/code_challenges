package ca.jrvs.challenge.freq5;

public class Power_of_Two {
    /**
     * Given an integer, write a function to determine if it is a power of two.
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n < 0) return false;
        String a = Integer.toBinaryString(n);
        boolean output = false;
        for (char c : a.toCharArray()) {
            if (c == '1') {
                output = !output;
                if (output == false) return false;
            }
        }
        return true;
    }
}
