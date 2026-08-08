package JAVA.Arrays.Basics;

import java.util.ArrayDeque;
import java.util.Deque;

public class maxSlidingWindow {
    static void main() {
        int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int r = 0;

        // Deque stores indices of useful elements
        // The values are maintained in decreasing order
        Deque<Integer> dq = new ArrayDeque<>();

        // Result array stores the maximum of each window
        int res[] = new int[nums.length - k + 1];

        for (; r < nums.length; r++) {

            // Remove elements from the back that are smaller
            // than the current element because they cannot
            // become the maximum while the current element exists
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) {
                dq.pollLast();
            }

            // Add the current index to the back
            dq.offerLast(r);

            // Remove the front element if it is outside
            // the current window
            if (!dq.isEmpty() && dq.peekFirst() <= r - k) {
                dq.pollFirst();
            }

            // Once the first complete window is formed,
            // the front of the deque contains the maximum
            if (r >= k - 1) {
                res[r - k + 1] = nums[dq.peekFirst()];
            }
        }

        // Print the result
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}