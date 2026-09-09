package JAVA.Arrays.Basics;

public class SearchinRotatedSortedArray {
    static void main() {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            }

            // Left half is sorted
            if (nums[mid] >= nums[low]) {

                // Target lies inside the sorted left half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies inside the sorted right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
    }
}