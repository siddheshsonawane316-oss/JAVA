package JAVA.Arrays.Basics;

public class BinarySearch {
    static void main() {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            // Find the middle index of the current search range
            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            }

            // Target is on the left side
            if (nums[mid] > target) {
                high = mid - 1;
            }

            // Target is on the right side
            else {
                low = mid + 1;
            }
        }
    }
}