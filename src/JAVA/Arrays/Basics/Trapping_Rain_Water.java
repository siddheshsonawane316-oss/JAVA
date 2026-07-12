package JAVA.Arrays.Basics;

public class Trapping_Rain_Water {
    static void main() {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int l = 0;
        int r = height.length - 1;

        // Maximum height seen from left
        int lmax = height[l];

        // Maximum height seen from right
        int rmax = height[r];

        // Stores total trapped water
        int maxwater = 0;

        // Process until pointers meet
        while (l < r) {

            // Process left side
            if (lmax < rmax) {

                l++;

                // Update left maximum
                lmax = Math.max(lmax, height[l]);

                // Water trapped at current position
                maxwater += lmax - height[l];

            } else {

                // Process right side
                r--;

                // Update right maximum
                rmax = Math.max(rmax, height[r]);

                // Water trapped at current position
                maxwater += rmax - height[r];
            }
        }

        System.out.println(maxwater);
    }
}