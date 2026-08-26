package JAVA.Arrays.Basics;

public class MaximumSubarray {
    static void main() {
    int nums[]={-2,1,-3,4,-1,2,1,-5,4};

    // Maximum subarray sum ending at the current index
    int bestending = nums[0];

    // Overall maximum subarray sum
    int ans = nums[0];

    for (int i = 1; i < nums.length; i++) {

        // Option 1: Extend the previous subarray
        int v1 = bestending + nums[i];

        // Option 2: Start a new subarray from nums[i]
        int v2 = nums[i];

        // Choose the better option for a subarray ending at i
        bestending = Math.max(v1, v2);

        // Update the overall maximum
        ans = Math.max(ans, bestending);
    }

        System.out.println(ans);;
    }
}
