package JAVA.Arrays.Basics;
    /*
    Example 1:

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
     */
public class FindKBeautyofaNumber {
    static void main() {

        int num = 240;
        int k = 2;
        int count = 0;

        // Convert the number to a string so that
        // substrings of length k can be generated.
        String s = String.valueOf(num);

        // Generate every substring of length k.
        for (int l = 0; l <= s.length() - k; l++) {

            // Convert the current substring into an integer.
            int temp = Integer.parseInt(s.substring(l, l + k));

            // Ignore 0 because division by 0 is not possible.
            if (temp == 0) {
                continue;
            }

            // Check if the substring value divides the original number.
            if (num % temp == 0) {
                count++;
            }
        }

        // Print the K-Beauty of the number.
        System.out.println(count);
    }
}