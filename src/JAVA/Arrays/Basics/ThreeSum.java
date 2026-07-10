package JAVA.Arrays.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */
public class ThreeSum {
    static void main() {

        List<List<Integer>> a1 = new ArrayList<>();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Sort to use two pointers
        Arrays.sort(nums);

        // Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            // Find remaining two numbers
            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    // Valid triplet found
                    a1.add(List.of(nums[i], nums[l], nums[r]));

                    l++;
                    r--;

                    // Skip duplicate left values
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (sum > 0) {

                    // Need a smaller sum
                    r--;

                } else {

                    // Need a larger sum
                    l++;
                }
            }
        }

        System.out.println(a1);
    }
}