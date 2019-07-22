package ca.jrvs.challenge.freq4;

public class Remove_Duplicates {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     * <p>
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n;
                System.out.println(i);
            }
        }
        return i;
    }
}
