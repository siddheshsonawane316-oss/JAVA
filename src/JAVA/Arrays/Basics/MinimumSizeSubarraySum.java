package JAVA.Arrays.Basics;

public class MinimumSizeSubarraySum {
    static void main() {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        // Left and right pointers of the sliding window.
        int l = 0;
        int r = 0;

        // Stores the minimum valid window length found so far.
        int minCount = Integer.MAX_VALUE;

        // Stores the sum of the current window.
        int sum = 0;

        // Expand the window by moving the right pointer.
        for (; r < nums.length; r++) {

            // Include the current element in the window.
            sum += nums[r];

            // While the current window satisfies the condition,
            // try to shrink it to get the smallest possible window.
            while (sum >= target) {

                // Update the minimum window length.
                minCount = Math.min(minCount, r - l + 1);

                // Remove the leftmost element from the window.
                sum -= nums[l];

                // Shrink the window.
                l++;
            }
        }

        // If no valid subarray was found, print 0.
        if (minCount == Integer.MAX_VALUE)
            System.out.println(0);
        else
            // Otherwise, print the minimum length.
            System.out.println(minCount);
    }
}