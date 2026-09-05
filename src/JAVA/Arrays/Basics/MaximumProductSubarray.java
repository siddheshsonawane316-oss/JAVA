package JAVA.Arrays.Basics;

public class MaximumProductSubarray {
    static void main() {
        int nums[] = {-2, 3, -4};

        // Minimum and maximum product ending at the previous index
        int minprod = nums[0];
        int maxprod = nums[0];

        // Stores the maximum product found so far
        int ans = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {

            // Three possibilities:
            // 1. Extend the previous maximum product
            // 2. Extend the previous minimum product
            //    (important because negative × negative can become positive)
            // 3. Start a new subarray from nums[i]
            int op1 = maxprod * nums[i];
            int op2 = minprod * nums[i];
            int op3 = nums[i];

            // Store the minimum product ending at the current index
            minprod = Math.min(op3, Math.min(op1, op2));

            // Store the maximum product ending at the current index
            maxprod = Math.max(op3, Math.max(op1, op2));

            // Update the overall maximum product
            ans = Math.max(ans, maxprod);
        }

        System.out.println(ans);
    }
}