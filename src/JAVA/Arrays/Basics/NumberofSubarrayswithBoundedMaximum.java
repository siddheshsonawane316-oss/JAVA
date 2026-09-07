package JAVA.Arrays.Basics;

public class NumberofSubarrayswithBoundedMaximum {
    static void main() {
        int nums[] = {2, 1, 4, 3};
        int count = 0;
        int left = 2;
        int right = 3;

        // Latest index where nums[i] >= left
        int valid = -1;

        // Latest index where nums[i] > right
        int invalid = -1;

        for (int i = 0; i < nums.length; i++) {

            // This index cannot be part of any valid subarray
            if (nums[i] > right) {
                invalid = i;
            }

            // This index can make the maximum reach the required range
            if (nums[i] >= left) {
                valid = i;
            }

            // Number of valid subarrays ending at index i
            count += valid - invalid;
        }

        System.out.println(count);
    }
}