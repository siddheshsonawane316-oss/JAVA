package JAVA.Arrays.Basics;
/*
Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3

Output: 16

Explanation:
The bookstore owner keeps themselves not grumpy for the last 3 minutes.
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
 */
public class GrumpyBookstoreOwner {
    static void main() {

        int cust[] = {1, 0, 1, 2, 1, 1, 7, 5};
        int grump[] = {0, 1, 0, 1, 0, 1, 0, 1};
        int k = 3;

        int i = 0;
        int j = 0;

        int sum = 0;      // Customers who are already satisfied.
        int temp = 0;     // Extra customers satisfied in the current window.
        int maxSum = 0;   // Maximum extra customers among all windows.

        // Step 1:
        // Count customers who are already satisfied.
        // They are satisfied because the owner is not grumpy.
        for (int m = 0; m < cust.length; m++) {
            if (grump[m] == 0) {
                sum += cust[m];
            }
        }

        // Step 2:
        // Try every window of size k.
        for (; i < cust.length; i++) {

            // If the owner is grumpy at this minute,
            // these customers can become satisfied
            // if we use the secret technique.
            if (grump[i] == 1) {
                temp += cust[i];
            }

            // Window size becomes k.
            if (i - j + 1 == k) {

                // Store the best window found so far.
                maxSum = Math.max(maxSum, temp);

                // Remove the leftmost minute before sliding.
                // Remove it only if it contributed to temp.
                if (grump[j] == 1) {
                    temp -= cust[j];
                }

                // Slide the window.
                j++;
            }
        }

        // Already satisfied customers
        // + Extra customers from the best window.
        System.out.println(sum + maxSum);
    }
}