package JAVA.Arrays.Basics;

import java.util.HashMap;

public class SubarraySumsDivisiblebyK {

    static void main() {

        int nums[] = {4, 5, 0, -2, -3, 1};
        int k = 5;

        // Running prefix sum
        int prefix = 0;

        // Stores: remainder -> frequency
        HashMap<Integer, Integer> h1 = new HashMap<>();

        // Remainder 0 exists once before the array starts
        h1.put(0, 1);

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            // Add current element to the prefix sum
            prefix += nums[i];

            // Find the remainder of the current prefix sum
            int rem = prefix % k;

            // Same remainder means the subarray between
            // the two prefix sums is divisible by k
            if (h1.containsKey(rem)) {

                // Every previous occurrence gives
                // one valid subarray
                ans += h1.get(rem);

                // Increase the frequency of this remainder
                h1.put(rem, h1.getOrDefault(rem, 0) + 1);

            } else {

                // First time seeing this remainder
                h1.put(rem, 1);
            }
        }

        System.out.println(ans);
    }
}