package JAVA.Arrays.Basics;
/*
Input: nums = [2,-5,1,-4,3,-2]
Output: 8
Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
 */
public class MaximumAbsoluteSumofAnySubarray {
    static void main() {
        int nums[] = {2, -5, 1, -4, 3, -2};

        // Kadane's algorithm to find the maximum subarray sum
        int maxend = nums[0];
        int maxsum = 0;

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i] + maxend; // Extend the previous subarray
            int v2 = nums[i];          // Start a new subarray

            maxend = Math.max(v1, v2);
            maxsum = Math.max(maxend, maxsum);
        }

        // Kadane's algorithm to find the minimum subarray sum
        int minend = nums[0];
        int minsum = 0;

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i] + minend; // Extend the previous subarray
            int v2 = nums[i];          // Start a new subarray

            minend = Math.min(v1, v2);
            minsum = Math.min(minend, minsum);
        }

        // The maximum absolute sum can come from either
        // the maximum positive subarray or the minimum negative subarray
        System.out.println(Math.max(Math.abs(minsum), maxsum));
    }
}