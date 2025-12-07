public class Solution {
    public int firstMissingPositive(int[] nums) {
        /**
         * Checking if the input array contains 1. If not, return 1 as the answer
         */
        int n = nums.length;
        int contains = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                contains++;
                break;
            }
        }
        if (contains == 0) {
            return 1;
        }
        /**
         * Since 1 is present, we proceed further.
         * 
         * Any nums[i] which is NOT between 1 and nums.count +1; we convert it to 1
         */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }
        /**
         * We need to go over the 'modified' input array (where we have already changed
         * the values with 1) and anytime we encounter a value other than 1(+ve or -ve)
         * we will change its subsequent index location to a negative value. This
         * negative value is effictively working as a flag indicating that the number
         * (at that location) was found.
         */
        for (int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]);
            if (a == n) {
                nums[0] = -Math.abs(nums[0]);
            } else {
                nums[a] = -Math.abs(nums[a]);
            }
        }
        /**
         * Loop through and return the first instance where number is not negative as
         * this is the first missing positive number as the -ve flag for it is not set
         * in the modified, modified array because the number was simply not found while
         * setting number at index location to -ve in the previous step.
         */
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i;
            }
        }
        /**
         * Handling edge cases
         */
        if (nums[0] > 0) {
            return n;
        }
        return n + 1;
    }
}
