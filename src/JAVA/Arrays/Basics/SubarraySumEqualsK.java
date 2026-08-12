package JAVA.Arrays.Basics;

import java.util.HashMap;

public class SubarraySumEqualsK {
    static void main() {

        int nums[] = {1, 1, 1};
        int k = 2;

        // Stores: prefix sum -> frequency of that prefix sum
        HashMap<Integer, Integer> h1 = new HashMap<>();

        int prefix = 0;
        int count = 0;

        // Prefix sum 0 exists once before we start
        h1.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            // Add current element to the running prefix sum
            prefix += nums[i];

            // Check if a previous prefix sum exists such that
            // current prefix - previous prefix = k
            if (h1.containsKey(prefix - k)) {

                // Add the frequency of that previous prefix sum
                count += h1.get(prefix - k);
            }

            // Store the current prefix sum and update its frequency
            h1.put(prefix, h1.getOrDefault(prefix, 0) + 1);
        }

        System.out.println(count);
    }
}