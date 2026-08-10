package JAVA.Arrays.Basics;

public class FindPivotIndex {

    static void main() {

        int nums[] = {1, 7, 3, 6, 5, 6};

        int sum = 0;
        int right = 0;
        int left = 0;

        // Calculate the total sum of the array
        for (int i : nums) {
            sum += i;
        }

        // Check every index as a possible pivot
        for (int j = 0; j < nums.length; j++) {

            // Right sum = total sum - left sum - current element
            right = sum - left - nums[j];

            // If left sum equals right sum, we found the pivot
            if (left == right) {
                System.out.println(j);
                break;
            }

            // Add current element to the left sum
            left += nums[j];
        }
    }
}