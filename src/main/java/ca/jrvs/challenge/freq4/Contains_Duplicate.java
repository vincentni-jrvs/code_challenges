package ca.jrvs.challenge.freq4;

import java.util.HashSet;

public class Contains_Duplicate {
    /**
     * Given an array of integers, find if the array contains any duplicates.
     * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> holder = new HashSet<Integer>();
        for (int i : nums) {
            if (holder.contains(i)) {
                return true;
            }
            holder.add(i);
        }
        return false;
    }
}
