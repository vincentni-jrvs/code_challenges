package ca.jrvs.challenge.freq4;

public class Merge_Sorted_Array {
    /**
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i > -1 && j > -1) nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        while (j > -1) nums1[k--] = nums2[j--];
    }
}
