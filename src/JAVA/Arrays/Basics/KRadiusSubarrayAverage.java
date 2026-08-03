package JAVA.Arrays.Basics;

import java.util.Arrays;

public class KRadiusSubarrayAverage {
    static void main(String[] args) {

        int l = 0;
        int nums[] = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int res[] = new int[nums.length];
        int sum = 0;
        int k = 3;

        // Fill the answer array with -1.
        // Indices that cannot be the center of a complete window
        // will remain -1.
        Arrays.fill(res, -1);

        // Fixed-size sliding window.
        for (int r = 0; r < nums.length; r++) {

            // Add the current element to the window sum.
            sum += nums[r];

            // Window size becomes (2*k + 1).
            if (r - l + 1 == 2 * k + 1) {

                // Calculate the average of the current window.
                int avg = sum / (2 * k + 1);

                // Store the average at the center of the window.
                res[(l + r) / 2] = avg;

                // Remove the leftmost element before sliding.
                sum -= nums[l];

                // Slide the window.
                l++;
            }
        }

        // Print the final result.
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}