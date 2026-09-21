/*
Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
*/

public class SearchinRotatedSortedArray2 {

    public static boolean search(int[] nums, int target) {

        // low points to the beginning of the search space
        int low = 0;

        // high points to the end of the search space
        int high = nums.length - 1;

        int mid = 0;

        // Continue searching while the search space is valid
        while (low <= high) {

            // Find the middle index
            mid = low + ((high - low) / 2);

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // nums[mid] == nums[low] creates ambiguity because of duplicates
            // Skip the duplicate from the left side
            else if (nums[mid] == nums[low]) {
                low++;
            }

            // Left side is not sorted, so right side is sorted
            else if (nums[mid] < nums[low]) {

                // Check if target lies in the sorted right half
                if (nums[mid] < target && nums[high] >= target) {
                    low = mid + 1;
                }
                else {
                    // Target is not in the right half
                    high = mid - 1;
                }
            }

            // Left side is sorted
            else if (nums[mid] > nums[low]) {

                // Check if target lies in the sorted left half
                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                }
                else {
                    // Target is not in the left half
                    low = mid + 1;
                }
            }
        }

        // Target was not found
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        // Call the search method and print the result
        System.out.println(search(nums, target));
    }
}