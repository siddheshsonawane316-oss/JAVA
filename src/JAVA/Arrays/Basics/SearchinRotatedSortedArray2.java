
public class SearchinRotatedSortedArray2{

    public static boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {

            mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                return true;
            }
            else if (nums[mid] == nums[low]) {
                low++;
            }
            else if (nums[mid] < nums[low]) {

                if (nums[mid] < target && nums[high] >= target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (nums[mid] > nums[low]) {

                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        System.out.println(search(nums, target));
    }
}