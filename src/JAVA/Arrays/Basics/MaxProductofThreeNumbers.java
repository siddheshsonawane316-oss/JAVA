package JAVA.Arrays.Basics;

public class MaxProductofThreeNumbers {
    static void main() {
        int nums[] = {-10, 3, -10, 2, 1};

        // m1, m2, m3 → 3 largest numbers
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        // s1, s2 → 2 smallest numbers
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Find the 3 largest numbers
            if (nums[i] >= m1) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            }
            else if (nums[i] < m1 && nums[i] >= m2 && nums[i] > m3) {
                m3 = m2;
                m2 = nums[i];
            }
            else if (nums[i] < m1 && nums[i] < m2 && nums[i] > m3) {
                m3 = nums[i];
            }

            // Find the 2 smallest numbers
            if (nums[i] <= s1) {
                s2 = s1;
                s1 = nums[i];
            }
            else if (nums[i] > s1 && nums[i] < s2) {
                s2 = nums[i];
            }
        }

        // Option 1: 3 largest numbers
        // Option 2: 2 smallest numbers × largest number
        System.out.println(Math.max(m1 * m2 * m3, s1 * s2 * m1));
    }
}