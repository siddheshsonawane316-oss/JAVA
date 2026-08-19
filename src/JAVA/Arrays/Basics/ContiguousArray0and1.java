package JAVA.Arrays.Basics;

import java.util.HashMap;

public class ContiguousArray0and1 {

    static void main() {

        int[] nums = {0, 1, 1, 1, 1, 1, 0, 0, 0};

        // Prefix balance:
        // 0 contributes -1, 1 contributes +1
        int prefix = 0;

        // Stores: balance -> first index where the balance appeared
        HashMap<Integer, Integer> h1 = new HashMap<>();

        // Balance 0 exists before the array starts
        h1.put(0, -1);

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            // Treat 0 as -1 and 1 as +1
            if (nums[i] == 0) {
                prefix += -1;
            } else {
                prefix += 1;
            }

            // If the same balance appeared before,
            // the elements between the two indices have
            // equal numbers of 0s and 1s
            if (h1.containsKey(prefix)) {

                // Calculate the length of the subarray
                // and keep the maximum length
                ans = Math.max(ans, i - h1.get(prefix));

            } else {

                // Store only the first occurrence
                // because it gives the longest possible subarray
                h1.put(prefix, i);
            }
        }

        System.out.println(ans);
    }
}