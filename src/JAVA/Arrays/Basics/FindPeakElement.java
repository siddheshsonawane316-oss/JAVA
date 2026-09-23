package JAVA.Arrays.Basics;

/*
Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should
return the index number 2.

Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1
where the peak element is 2, or index number 5 where the
peak element is 6.
*/

public class FindPeakElement {

    static void main() {

        int nums[] = {1, 2};

        // l points to the beginning of the current search range
        int l = 0;

        // h points to the end of the current search range
        int h = nums.length - 1;

        // Continue until only one possible peak index remains
        while (l < h) {

            // Find the middle index
            int m = l + (h - l) / 2;

            // If nums[m] is greater than the element on its right,
            // a peak exists at m or somewhere on the left side.
            if (nums[m] > nums[m + 1]) {
                h = m;
            }

            // If nums[m] is smaller than the element on its right,
            // the slope is going upward, so a peak exists on the right.
            else {
                l = m + 1;
            }
        }

        // When l == h, we have found the index of a peak element
        System.out.println(nums[l]);
    }
}