package JAVA.Arrays.Basics;
/*
Example 1:

Input
["NumArray", "sumRange", "update", "sumRange"]
[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
Output
[null, 9, null, 8]

Explanation
NumArray numArray = new NumArray([1, 3, 5]);
numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
numArray.update(1, 2);   // nums = [1, 2, 5]
numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8

 */
public class RangeSumQueryMutable {

    int nums[];
    int fw[];

    public RangeSumQueryMutable(int[] nums) {

        this.nums = nums;

        // Create Fenwick Tree with 1-based indexing
        fw = new int[nums.length + 1];

        fw[0] = 0;

        // First create normal prefix sums
        for (int i = 0; i < nums.length; i++) {
            fw[i + 1] = fw[i] + nums[i];
        }

        // Convert prefix sums into Fenwick Tree values
        // by subtracting the parent's prefix sum
        for (int i = nums.length; i > 0; i--) {

            int parent = i - (i & -i);

            fw[i] -= fw[parent];
        }
    }

    public void updateSum(int diff, int index) {

        // Convert array index to Fenwick index
        index++;

        // Update all Fenwick nodes affected by this index
        while (index <= nums.length) {

            fw[index] += diff;

            // Move to the next affected Fenwick node
            index = index + (index & -index);
        }
    }

    public void update(int index, int val) {

        // Calculate how much the value changed
        int diff = val - nums[index];

        // Update the original array
        nums[index] = val;

        // Apply the difference to the Fenwick Tree
        updateSum(diff, index);
    }

    public int sum(int x) {

        // Convert array index to Fenwick index
        x++;

        int res = 0;

        // Collect the Fenwick nodes needed for the prefix sum
        while (x > 0) {

            res += fw[x];

            // Move to the parent node
            x = x - (x & -x);
        }

        return res;
    }

    public int sumRange(int left, int right) {

        // Range sum = prefix up to right
        //              - prefix before left
        return sum(right) - sum(left - 1);
    }

    public static void main(String[] args) {

        int nums[] = {1, 3, 5};

        RangeSumQueryMutable obj = new RangeSumQueryMutable(nums);

        System.out.println(obj.sumRange(0, 2));

        obj.update(1, 2);

        System.out.println(obj.sumRange(0, 2));

        obj.update(2, 10);

        System.out.println(obj.sumRange(1, 2));
    }
}