package JAVA.Arrays.Basics;

/*
Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
*/

public class FindMinimuminRotatedSortedArray {

    static void main() {

        int[] nums = {11, 13, 15, 17};

        // l points to the beginning of the current search space
        int l = 0;

        // h points to the end of the current search space
        int h = nums.length - 1;

        int m = 0;

        // Continue until only one element remains
        while (l < h) {

            // Find the middle index
            m = l + (h - l) / 2;

            // If nums[m] > nums[h],
            // the minimum must be on the right side of m
            if (nums[m] > nums[h]) {
                l = m + 1;
            }

            // If nums[m] < nums[h],
            // the minimum can be at m or on the left side
            else if (nums[m] < nums[h]) {
                h = m;
            }
        }

        // l == h, so nums[l] is the minimum element
        System.out.println(nums[l]);
    }
}