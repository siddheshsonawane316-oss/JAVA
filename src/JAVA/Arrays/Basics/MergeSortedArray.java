package JAVA.Arrays.Basics;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        // nums1 has enough space to hold all elements
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Points to the last valid element in nums1
        int i = m - 1;

        // Points to the last element in nums2
        int j = n - 1;

        // Points to the last position of nums1
        int k = nums1.length - 1;

        // Continue until all elements of nums2 are placed
        while (j >= 0) {

            // If nums1 still has elements and its current element is larger
            if (i >= 0 && nums1[i] > nums2[j]) {

                // Place the larger element from nums1
                nums1[k] = nums1[i];
                i--;

            } else {

                // Otherwise place the element from nums2
                nums1[k] = nums2[j];
                j--;
            }

            // Move to the next position from the end
            k--;
        }

        // Print the merged array
        System.out.println(Arrays.toString(nums1));
    }
}