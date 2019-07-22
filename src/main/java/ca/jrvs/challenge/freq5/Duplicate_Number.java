package ca.jrvs.challenge.freq5;

public class Duplicate_Number {
    /**
     * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that
     * at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        if (nums.length < 1) return -1;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;

    }
}
