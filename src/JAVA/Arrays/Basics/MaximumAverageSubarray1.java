package JAVA.Arrays.Basics;
/*
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class MaximumAverageSubarray1 {
    static void main() {

        int nums[] = {1, 12, -5, -6, 50, 3};

        // Left pointer of the sliding window.
        int l = 0;

        // Right pointer of the sliding window.
        int r = 0;

        // Stores the sum of the current window.
        double sum = 0;

        // Fixed window size.
        int k = 4;

        // Stores the maximum average found so far.
        double avg = Double.NEGATIVE_INFINITY;

        // Expand the window by moving the right pointer.
        for (; r < nums.length; r++) {

            // Include the current element in the window.
            sum += nums[r];

            // Process the window once it reaches size k.
            if (r - l + 1 == k) {

                // Update the maximum average.
                avg = Math.max(avg, sum / k);

                // Remove the leftmost element before sliding.
                sum -= nums[l];

                // Slide the window forward.
                l++;
            }
        }

        // Print the maximum average.
        System.out.println(avg);
    }
}