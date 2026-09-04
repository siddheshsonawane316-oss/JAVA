package JAVA.Arrays.Basics;
/*
Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.
 */
public class MaximumSumCircularSubarray {
    static void main() {
        int nums[] = {1, -2, 3, -2};

        // Kadane's algorithm to find the maximum subarray sum
        int maxend = nums[0];
        int maxsum = 0;

        for (int i = 1; i < nums.length; i++) {
            int v1 = maxend + nums[i]; // Extend the previous subarray
            int v2 = nums[i];          // Start a new subarray

            maxend = Math.max(v1, v2);
            maxsum = Math.max(maxsum, maxend);
        }

        // Kadane's algorithm to find the minimum subarray sum
        int minend = nums[0];
        int minsum = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int v1 = minend + nums[i]; // Extend the previous subarray
            int v2 = nums[i];          // Start a new subarray

            minend = Math.min(v1, v2);
            minsum = Math.min(minsum, minend);
        }

        // Calculate the total sum of the array
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // If all numbers are negative, sum - minsum gives 0,
        // which represents an empty subarray. The problem requires
        // a non-empty subarray, so return the normal maximum.
        if (maxsum < 0) {
            System.out.println(maxsum);
            return;
        }

        // Circular maximum = total sum - minimum subarray sum
        int circularSum = sum - minsum;

        // Choose the better of normal and circular maximum subarray
        System.out.println(Math.max(circularSum, maxsum));
    }
}