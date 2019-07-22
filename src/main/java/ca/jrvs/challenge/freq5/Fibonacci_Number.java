package ca.jrvs.challenge.freq5;

import java.util.HashMap;

public class Fibonacci_Number {
    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
     */
    private HashMap<Integer, Integer> container = new HashMap<>();

    public int fib(int N) {
        if (N > 30) return 0;
        container.put(0, 0);
        container.put(1, 1);
        return fibRecursive(N);
    }

    public int fibRecursive(int N) {
        if (!container.containsKey(N)) container.put(N, fibRecursive(N - 1) + fibRecursive(N - 2));
        return container.get(N);
    }
}
