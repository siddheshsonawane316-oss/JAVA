package JAVA.Arrays.Basics;
/*
LC 1438:Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class LongestSubarrayWithAbsoluteDiff {

    static void main() {
        int nums[] = {8, 2, 4, 7};
        int limit = 4;

        int r = 0;      // Right pointer
        int l = 0;      // Left pointer
        int ans = 0;    // Maximum length

        Deque<Integer> max = new ArrayDeque<>(); // Stores max indices
        Deque<Integer> min = new ArrayDeque<>(); // Stores min indices

        for (; r < nums.length; r++) {

            // Remove smaller elements
            while (!max.isEmpty() && nums[max.peekLast()] < nums[r]) {
                max.pollLast();
            }

            // Remove larger elements
            while (!min.isEmpty() && nums[min.peekLast()] > nums[r]) {
                min.pollLast();
            }

            // Add current index
            max.offerLast(r);
            min.offerLast(r);

            // Shrink invalid window
            while (nums[max.peekFirst()] - nums[min.peekFirst()] > limit) {

                if (max.peekFirst() == l) {
                    max.pollFirst();
                }

                if (min.peekFirst() == l) {
                    min.pollFirst();
                }

                l++;
            }

            // Update maximum length
            ans = Math.max(ans, r - l + 1);
        }

        System.out.println(ans);
    }
}