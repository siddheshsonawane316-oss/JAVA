package JAVA.Arrays.Basics;

public class SortArrayByParityII {
    static void main() {

        int[] nums = {5, 2, 7, 4, 9, 6};

        int e = 0;                  // Visits even indices
        int o = nums.length - 1;    // Visits odd indices

        // Find misplaced elements and swap them
        while (e < nums.length && o > 0) {

            // Skip correctly placed even numbers
            if (nums[e] % 2 == 0) {
                e += 2;
            }

            // Skip correctly placed odd numbers
            if (nums[o] % 2 != 0) {
                o -= 2;
            }

            // Swap when both indices have the wrong parity
            if ((e < nums.length && o > 0) &&
                    (nums[e] % 2 != 0 && nums[o] % 2 == 0)) {

                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;

                e += 2;
                o -= 2;
            }
        }

        // Print the rearranged array
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }
}