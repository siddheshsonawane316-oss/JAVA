package JAVA.Arrays.Basics;
/*
LC:238
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
public class ProductofArrayExceptSelf {

    static void main() {

        int nums[] = {-1, 1, 0, -3, 3};

        // Stores product of all elements before current index
        int prefix[] = new int[nums.length];

        // Stores product of all elements after current index
        int suffix = 1;

        // Nothing exists before index 0
        prefix[0] = 1;

        // Build prefix products
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Traverse from right to left to add suffix products
        for (int i = nums.length - 1; i >= 0; i--) {

            // Prefix product × suffix product
            // gives product of all elements except nums[i]
            prefix[i] *= suffix;

            // Include current element in suffix for the next index
            suffix *= nums[i];
        }

        // Print the final answer
        for (int i : prefix) {
            System.out.print(i + " ");
        }
    }
}