package JAVA.Arrays.Basics;

import java.util.ArrayList;

public class PartitionAccordingtoPivot {
    static void main() {
        int[] nums = {-3, 4, 3, 2};

        ArrayList<Integer> lessThan = new ArrayList<>();
        ArrayList<Integer> greaterThan = new ArrayList<>();

        int pivotCount = 0;

        // Separate elements based on the pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 2) {
                greaterThan.add(nums[i]);
            } else if (nums[i] < 2) {
                lessThan.add(nums[i]);
            } else {
                pivotCount++;
            }
        }

        int j = 0;

        // Copy elements smaller than the pivot
        for (j = 0; j < lessThan.size(); j++) {
            nums[j] = lessThan.get(j);
        }

        int k = j + pivotCount;

        // Fill pivot values
        for (; j < k; j++) {
            nums[j] = 2;
        }

        int g = 0;

        // Copy elements greater than the pivot
        for (; k < nums.length; k++) {
            nums[k] = greaterThan.get(g);
            g++;
        }

        // Print the partitioned array
        for (int i : nums) {
            System.out.print(i + " ");
        }

        /*
         * Note:
         * Two ArrayLists are used to preserve the relative order of elements.
         * An in-place solution using swaps would change that order, so it
         * cannot satisfy the stable partition requirement.
         */
    }
}