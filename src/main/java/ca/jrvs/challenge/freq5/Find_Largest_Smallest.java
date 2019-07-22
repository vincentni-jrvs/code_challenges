package ca.jrvs.challenge.freq5;

import java.util.ArrayList;
import java.util.List;

public class Find_Largest_Smallest {
    /**
     * Return the largest and the smallest integers in an unsorted integer array
     *
     * @param intArray
     * @return
     */
    public Integer[] findLargestAndSmallest(int[] intArray) {
        List<Integer> result = new ArrayList<>();
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i : intArray) {
            small = i > small ? small : i;
            large = i < large ? large : i;
        }
        result.add(small);
        result.add(large);
        return result.toArray(new Integer[0]);
    }
}
