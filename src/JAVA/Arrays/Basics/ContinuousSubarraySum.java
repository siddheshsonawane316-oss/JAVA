package JAVA.Arrays.Basics;

import java.util.HashMap;

public class ContinuousSubarraySum {

    static void main() {

        int nums[] = {23, 2, 6, 7};
        int k = 6;

        // Stores the running prefix sum.
        int prefix = 0;

        // Stores: remainder -> earliest index
        HashMap<Integer, Integer> h1 = new HashMap<>();

        // Remainder 0 exists before the array starts.
        h1.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            // Add current element to the prefix sum.
            prefix += nums[i];

            // Find the remainder of the current prefix sum.
            int rem = prefix % k;

            // If this remainder was seen before,
            // the difference between the two prefix sums
            // is divisible by k.
            if (h1.containsKey(rem)) {

                // Check whether the subarray length is at least 2.
                if (i - h1.get(rem) >= 2) {
                    System.out.println("True");
                    break;
                }

            } else {

                // Store only the first occurrence of this remainder.
                h1.put(rem, i);
            }
        }
    }
}