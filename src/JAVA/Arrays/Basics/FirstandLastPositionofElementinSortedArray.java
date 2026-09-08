package JAVA.Arrays.Basics;

public class FirstandLastPositionofElementinSortedArray {
    static void main() {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Stores the first occurrence of target
        int min = Integer.MAX_VALUE;

        // Stores the last occurrence of target
        int max = Integer.MIN_VALUE;

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        // Binary search to find the first occurrence
        while (low <= high) {
            mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                min = Math.min(min, mid);

                // Target found, but search further left
                high = mid - 1;
            }
            else if (nums[mid] > target) {

                // Target can only be on the left
                high = mid - 1;
            }
            else {

                // Target can only be on the right
                low = mid + 1;
            }
        }

        int low1 = 0;
        int high1 = nums.length - 1;
        int mid1 = 0;

        // Binary search to find the last occurrence
        while (low1 <= high1) {
            mid1 = low1 + ((high1 - low1) / 2);

            if (nums[mid1] == target) {
                max = Math.max(max, mid1);

                // Target found, but search further right
                low1 = mid1 + 1;
            }
            else if (nums[mid1] > target) {

                // Target can only be on the left
                high1 = mid1 - 1;
            }
            else {

                // Target can only be on the right
                low1 = mid1 + 1;
            }
        }

        // Target was never found
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1,-1");
        }
        else {
            System.out.println(min + "," + max);
        }
    }
}