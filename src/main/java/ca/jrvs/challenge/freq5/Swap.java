package ca.jrvs.challenge.freq5;

public class Swap {
    /**
     * Swap two numbers without using the third variable
     *
     * @param a
     * @param b
     */
    public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
