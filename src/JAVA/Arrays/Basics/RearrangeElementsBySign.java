package JAVA.Arrays.Basics;

public class RearrangeElementsBySign {

    /*
     * Rearrange the array so that:
     * 1. Positive and negative numbers alternate.
     * 2. The relative order of positives and negatives is preserved.
     * 3. The array starts with a positive number.
     */

    static void main() {

        int nums[] = {3, 1, -2, -5, 2, -4};

        // Result array
        int res[] = new int[nums.length];

        // Next available even index for positive numbers
        int p = 0;

        // Next available odd index for negative numbers
        int n = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {

                // Place positive number at the next even index
                res[p] = nums[i];
                p += 2;

            } else {

                // Place negative number at the next odd index
                res[n] = nums[i];
                n += 2;
            }
        }

        // Print the rearranged array
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}