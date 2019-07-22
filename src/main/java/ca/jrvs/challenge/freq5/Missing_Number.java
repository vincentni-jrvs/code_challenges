package ca.jrvs.challenge.freq5;

import java.util.HashSet;
import java.util.Set;

public class Missing_Number {
    /**
     * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int max = nums.length;
        if (max == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= max; i++) {
            set.add(i);
        }
        for (int i : nums) {
            set.remove(new Integer(i));
        }

        return set.iterator().next();
    }
}
